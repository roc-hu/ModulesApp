package top.akit.main;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import top.akit.base.BaseActivity;

@Route(path = "/app/test")
public class TestActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_test);
        setTitle(R.string.main_app_name);
    }
}
