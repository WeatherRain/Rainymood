package zoloandgong.rainymood;

import android.app.Application;

/**
 * Created by tinyzo on 2016-12-08.
 */

public class MyApplication extends Application{
    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        this.instance = this;
    }



    public static MyApplication getInstance() {
        return instance;
    }

}
