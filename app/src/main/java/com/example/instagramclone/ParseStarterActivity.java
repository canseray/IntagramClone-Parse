package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("ox3ok5YIjfQuJKjdKDtvvLr1O6gzFL33xQc7sO6E")
        .clientKey("UK2Xl4AyCMSJnWkeGIGN35nXerPNozGCa2zCpC3p")
        .server("https://parseapi.back4app.com/")
        .build()
        );



    }
}


