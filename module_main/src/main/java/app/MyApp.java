package app;

import android.app.Application;
import android.util.Log;

import top.akit.main.MainApp;

/**
 * Created by hcp on 2017/11/15.
 */
public class MyApp extends Application {
    final String tag = MyApp.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(tag, "onCreate...");
        MainApp.init(this);
    }
}
