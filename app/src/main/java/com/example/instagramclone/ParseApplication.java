package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("hLESum7DzOHMUg6aD0Bu0p7lM9WrBNE8bDjMzfWw")
                .clientKey("z5LX59w6fANivXDYofzKaZVlQ73qr1os7jSLO8pC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}