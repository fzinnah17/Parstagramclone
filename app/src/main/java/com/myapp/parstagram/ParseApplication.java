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
                .applicationId("38GMOllXNvKJEFXmp9Iw1tGqtWiWLcohIXdutLXi")
                .clientKey("oRQgNOex7N5uoBiw026hEr6QxcnfiXEhbqymXVYB")
                .server("https://parseapi.back4app.com")
                        .build()
                );

    }
}