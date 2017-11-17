package top.akit.one;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import top.akit.base.BaseActivity;

@Route(path = "/one/1")
public class OneActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.one_app_name);
        setContentView(R.layout.one_activity_one);
    }
}
