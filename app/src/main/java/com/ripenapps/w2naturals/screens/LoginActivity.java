package com.ripenapps.w2naturals.screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.ripenapps.w2naturals.R;
import com.ripenapps.w2naturals.fragments.LoginFragment;
import com.ripenapps.w2naturals.fragments.SignUpFragment;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class LoginActivity extends AppCompatActivity implements  TabLayout.OnTabSelectedListener {

    private TabLayout login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
    }

    private void initViews() {
        login=(TabLayout) findViewById(R.id.tabLayout);
        login.addTab(login.newTab().setText("Login"));
        login.addTab(login.newTab().setText("Sign Up"));
        login.addOnTabSelectedListener(this);
        setFragment(new LoginFragment());
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
         switch (tab.getPosition()){
             case 0:
                 setFragment(new LoginFragment());
                 break;

             case 1:
                 setFragment(new SignUpFragment());

                 break;
         }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }


    /*@Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.signup:
                startActivity(new Intent(LoginActivity.this,SignupActivity.class));
                break;
            case R.id.fgPass:
                startActivity(new Intent(LoginActivity.this,ForgetPasswordActivity.class));

                break;
        }
    }*/


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    public void setFragment(Fragment fragment) {


        FragmentTransaction transaction;
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment );
        transaction.commit();
    }

}
