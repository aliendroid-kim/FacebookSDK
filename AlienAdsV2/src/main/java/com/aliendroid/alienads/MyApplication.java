package com.aliendroid.alienads;

import android.app.Application;
import android.content.Context;
import com.aliendroid.sdkads.config.InitializeAlienAds;

public class MyApplication extends Application {
    private static AlienNotif notif;
    private static InitializeAlienAds sdkads;
    Context context;
    //Uranus
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        sdkads = new InitializeAlienAds(this);
        notif = new AlienNotif(context,this);

    }
}