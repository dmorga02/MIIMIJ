package com.miimij.miimij;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;

/**
 * Created by Dimitri on 4/22/2015.
 */
public class LoginTask extends AsyncTask<Activity, Void, Boolean> {
    @Override
    protected Boolean doInBackground(Activity... loginActivity) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent mainIntent = new Intent(loginActivity[0],MainActivity.class);
        loginActivity[0].startActivity(mainIntent);
        return false;
    }
}
