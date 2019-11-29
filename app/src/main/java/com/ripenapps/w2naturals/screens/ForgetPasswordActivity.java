package com.ripenapps.w2naturals.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.ripenapps.w2naturals.R;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ForgetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        initViews();
    }

    private void initViews() {

        /*startActivity(new Intent(this,UpdatePasswordActivity.class));*/
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
