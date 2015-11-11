package com.tests.reuben.layouttests.activities;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by BBC on 11/11/2015.
 */
public abstract class BaseAuthenticationActivity extends BaseActivity {

    @Override
    protected  final void onCreate(Bundle savedState)
    {
     super.onCreate(savedState);

        if(!application.getAuth().getUser().isLoggedIn())
        {
            startActivity(new Intent(this,LoginActivity.class));
            finish();
            return;
        }
    }


    protected  abstract  void onMyApplicatonCreate(Bundle savedState);
}
