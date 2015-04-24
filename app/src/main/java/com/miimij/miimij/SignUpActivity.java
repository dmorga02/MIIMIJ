package com.miimij.miimij;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;


public class SignUpActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the message from the intent
        Intent intent = getIntent();
        String usernameFromLogin = intent.getStringExtra(LoginActivity.LOGIN_EMAIL);

        setContentView(R.layout.activity_sign_up);
        // Create the text view
        EditText username = (EditText) findViewById(R.id.sign_up_username);
        username.setText(usernameFromLogin);

        //TODO wrap this in a minimum sdk checker
        LinearLayout DOBLinearLayout = (LinearLayout) findViewById(R.id.DOB_linear_layout);
        NumberPicker month = new NumberPicker(this);
        month.setMinValue(1);
        month.setMaxValue(12);
        month.setValue(12);
        month.setId(R.id.login_month);
        NumberPicker day = new NumberPicker(this);
        day.setMinValue(1);
        day.setMaxValue(31);
        day.setValue(19);
        day.setId(R.id.login_day);
        NumberPicker year = new NumberPicker(this);
        year.setMinValue(1899);
        year.setMaxValue(2014);
        year.setValue(1991);
        year.setId(R.id.login_year);

        DOBLinearLayout.addView(month);
        DOBLinearLayout.addView(day);
        DOBLinearLayout.addView(year);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sign_up, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
