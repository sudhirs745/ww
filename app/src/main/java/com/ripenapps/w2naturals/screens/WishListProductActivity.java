package com.ripenapps.w2naturals.screens;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ripenapps.w2naturals.R;
import com.ripenapps.w2naturals.adapters.WhislistAdapter;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class WishListProductActivity extends AppCompatActivity {


    private RecyclerView whislist;

    WhislistAdapter whislistAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_list_product);
        whislist=findViewById(R.id.whislistRecycler);



        final LinearLayoutManager layoutManager = new LinearLayoutManager(WishListProductActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        whislist.setLayoutManager(layoutManager);
        whislist.setItemAnimator(new DefaultItemAnimator());
        whislist.setNestedScrollingEnabled(false);
        whislistAdapter = new WhislistAdapter(WishListProductActivity.this);
        whislist.setAdapter(whislistAdapter);


    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
