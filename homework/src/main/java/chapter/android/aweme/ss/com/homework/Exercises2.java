package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view= LayoutInflater.from(this).inflate(R.layout.activity_chatroom,null);
        setContentView(view);
        System.out.println(getViewCount(view));
        /**
        *输出结果为7
        */
    }

    public static int getViewCount(View view) {
        //todo 补全你的代码
        int count = 0;
        if(view==null) return 0;
        if(view instanceof ViewGroup){

            ViewGroup vp = (ViewGroup)view ;
            count+=vp.getChildCount();
            for(int i=0;i<vp.getChildCount();i++){
                View viewchild = vp.getChildAt(i);
                count+=getViewCount(viewchild);
            }
        }
        return count;
    }
}
