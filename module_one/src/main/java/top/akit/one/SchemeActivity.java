package top.akit.one;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by hcp on 2017/11/16.
 */
public class SchemeActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"SchemeActivity",Toast.LENGTH_SHORT).show();
        // 直接通过ARouter处理外部Uri
        Uri uri = getIntent().getData();
        ARouter.getInstance().build(uri).navigation(this, new NavCallback() {
            @Override
            public void onArrival(Postcard postcard) {
                finish();
            }
        });
    }
}
