package top.akit.main;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import top.akit.base.BaseActivity;

@Route(path = "/app/test")
public class TestActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_test);
        setTitle(R.string.main_app_name);

        TextView tv = findViewById(R.id.tv);

        String buildTime = getResources().getString(R.string.build_time);
        String buildHost = getResources().getString(R.string.build_host);
        String buildRevision = getResources().getString(R.string.build_revision);

        StringBuilder tvBuilder = new StringBuilder();
        tvBuilder.append("buildTime:").append(buildTime).append("\n");
        tvBuilder.append("buildHost:").append(buildHost).append("\n");
        tvBuilder.append("buildRevision:").append(buildRevision).append("\n");
        tv.setText(tvBuilder);
    }
}
