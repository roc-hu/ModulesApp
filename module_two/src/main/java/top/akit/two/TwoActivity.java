package top.akit.two;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import top.akit.base.BaseActivity;

@Route(path = "/two/1")
public class TwoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_activity_two);
        setTitle(R.string.two_app_name);
    }
}
