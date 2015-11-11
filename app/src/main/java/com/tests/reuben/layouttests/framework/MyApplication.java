package com.tests.reuben.layouttests.framework;

import android.app.Application;

/**
 * Created by BBC on 10/11/2015.
 */
public class MyApplication extends Application {

    private Auth auth;



    @Override
    public void onCreate(){
        super.onCreate();
        auth = new Auth(this);
    }


    public Auth getAuth()
    {
        return auth;
    }


}
