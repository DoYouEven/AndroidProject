package com.tests.reuben.layouttests.framework;

import android.content.Context;

/**
 * Created by BBC on 10/11/2015.
 */
public class Auth
{
private final Context context;

    private User user;


    public Auth(Context context)
    {
        this.context = context;
        user = new User();
    }

    public User getUser() {
        return user;
    }
}
