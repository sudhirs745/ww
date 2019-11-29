package com.ripenapps.w2naturals.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.ripenapps.w2naturals.R;
import com.ripenapps.w2naturals.screens.ForgetPasswordActivity;
import com.ripenapps.w2naturals.screens.HomeActivity;
import com.ripenapps.w2naturals.screens.UpdatePasswordActivity;

public class LoginFragment extends Fragment {
    private View view;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_login, container, false);
        initViews();

        return view;
    }

    private void initViews() {

        TextView tv_forgot = view.findViewById(R.id.forgotPassword);

        tv_forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity( new Intent(getActivity(), ForgetPasswordActivity.class));
            }
        });

        TextView tv_login =view. findViewById(R.id.login);

        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity( new Intent(getActivity(), HomeActivity.class));
            }
        });



    }
}
