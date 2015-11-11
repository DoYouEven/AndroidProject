package com.tests.reuben.layouttests.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.tests.reuben.layouttests.framework.MyApplication;

/**
 * Created by BBC on 11/11/2015.
 */
public abstract class BaseActivity extends ActionBarActivity {


    protected MyApplication application;

    @Override
    protected void onCreate(Bundle savedState)
    {
        super.onCreate(savedState);


        application = (MyApplication) getApplication();
    }
}
