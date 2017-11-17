package top.akit.main;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import top.akit.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_main);
        setTitle(R.string.main_app_name);

        findViewById(R.id.btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 应用内简单的跳转(通过URL跳转在'进阶用法'中)
                ARouter.getInstance().build("/app/test").navigation();
//                Toast.makeText(v.getContext(),"One",Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 应用内简单的跳转(通过URL跳转在'进阶用法'中)
                ARouter.getInstance().build("/one/1").navigation();
//                Toast.makeText(v.getContext(),"One",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 2. 跳转并携带参数
                ARouter.getInstance().build("/two/1")
                        .withLong("key1", 666L)
                        .withString("key3"                                           , "888")
//                        .withObject("key4", new Test("Jack", "Rose"))
                        .navigation();
//                Toast.makeText(v.getContext(),"Two",Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri testUriMix = Uri.parse("arouter://m.akit.top/one/1");
                ARouter.getInstance().build(testUriMix)
                        .withString("key1", "value1")
                        .navigation();
//                Toast.makeText(v.getContext(),"Main",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
