package com.myapp.parstagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mH8yEMY1m5QnUf9Z857DjFsSWmTRRv2NLaVbgjgY")
                .clientKey("RnlcC5l2mjQSLofgKVyCHIYYCLtLAmR5Ntefv49M")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}