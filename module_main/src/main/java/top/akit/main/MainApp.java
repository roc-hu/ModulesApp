package top.akit.main;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Main 的Application
 * <p>
 * Created by hcp on 2017/11/15.
 */
public class MainApp implements Application.ActivityLifecycleCallbacks {

    final String tag = MainApp.class.getSimpleName();


    /**
     * 初始化
     *
     * @param application
     */
    public static void init(Application application) {
        new MainApp(application);
    }

    private MainApp(Application application) {
        if (application == null) return;
        Log.d(tag, "MainApp->application:[" + application + "]");
        application.registerActivityLifecycleCallbacks(this);
        //****** ARouter ***************************************
        if (true) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(application); // 尽可能早，推荐在Application中初始化
        //****** End ***************************************

    }


    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Log.d(tag, "onActivityCreated->activity:[" + activity + "]");
    }

    @Override
    public void onActivityStarted(Activity activity) {
        Log.d(tag, "onActivityStarted->activity:[" + activity + "]");
    }

    @Override
    public void onActivityResumed(Activity activity) {
        Log.d(tag, "onActivityResumed->activity:[" + activity + "]");
    }

    @Override
    public void onActivityPaused(Activity activity) {
        Log.d(tag, "onActivityPaused->activity:[" + activity + "]");
    }

    @Override
    public void onActivityStopped(Activity activity) {
        Log.d(tag, "onActivityStopped->activity:[" + activity + "]");
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Log.d(tag, "onActivitySaveInstanceState->activity:[" + activity + "]");
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        Log.d(tag, "onActivityDestroyed->activity:[" + activity + "]");
    }
}
