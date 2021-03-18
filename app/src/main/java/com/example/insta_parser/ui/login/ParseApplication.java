package com.example.insta_parser.ui.login;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("fzeuDj9xmKS2sYd514g1c2g0qalsSIjhtMYVbZrt")
                .clientKey("EMutQxk59s3vkCFVF7Y7Pk8EtC75dUNWGWBMDd2K")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
