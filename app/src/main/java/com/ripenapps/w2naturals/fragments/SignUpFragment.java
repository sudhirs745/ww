package com.ripenapps.w2naturals.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.ripenapps.w2naturals.R;
import com.ripenapps.w2naturals.screens.UpdatePasswordActivity;

import java.util.ArrayList;
import java.util.List;

public class SignUpFragment extends Fragment {
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_signup, container, false);
        initViews();


        return view;
    }


    private void initViews() {

        TextView tv_forgot = view.findViewById(R.id.next);
        final Spinner spinner = view.findViewById(R.id.spinner_country);
        final Spinner spinnerCity=view.findViewById(R.id.spinner_city);
        RelativeLayout country = view.findViewById(R.id.rel_country_spinner);
        RelativeLayout city=view.findViewById(R.id.rel_city_spinner);


        tv_forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), UpdatePasswordActivity.class));
            }
        });

//CountrySpinner
        List<String> categories = new ArrayList<String>();
        categories.add("India");
        categories.add("Australia");
        categories.add("Singapore");
        categories.add("Italy");
        categories.add("USA");
        categories.add("Japan");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // String item = parent.getItemAtPosition(position).toString();
                // Showing selected spinner item
                // Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //CitySpinner

        List<String> categoriesCity = new ArrayList<String>();
        categoriesCity.add("Mathura");
        categoriesCity.add("Agra");
        categoriesCity.add("Delhi");
        categoriesCity.add("Ghaziabad");
        categoriesCity.add("Noida");
        categoriesCity.add("Jaipur");


        ArrayAdapter<String> dataAdapterCity = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categoriesCity);
        dataAdapterCity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCity.setAdapter(dataAdapterCity);


        spinnerCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinnerCity.performClick();
            }
        });




        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinner.performClick();
            }
        });


    }
}
