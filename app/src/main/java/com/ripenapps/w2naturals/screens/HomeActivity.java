package com.ripenapps.w2naturals.screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ripenapps.w2naturals.R;
import com.ripenapps.w2naturals.adapters.BestRowProduct;
import com.ripenapps.w2naturals.adapters.HomeRowAdapter;
import com.ripenapps.w2naturals.adapters.MostPopularProduct;

public class HomeActivity extends AppCompatActivity {


    private RecyclerView mrecyclerView, mrecyclerViewProduct,mostPopularProducts;

    ImageView imageView, imageViewWhislist;
    DrawerLayout drawerLayout;
    HomeRowAdapter homeRowAdapter;
    BestRowProduct bestSellerRowAdapter;
    MostPopularProduct mostPopularProductAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);

        initViews();

        mrecyclerView.setHasFixedSize(true);
        LinearLayoutManager mCLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mrecyclerView.setLayoutManager(mCLayoutManager);
        homeRowAdapter = new HomeRowAdapter(new String[]{"0", "1", "2", "3", "4", "5"}, this);
        mrecyclerView.setAdapter(homeRowAdapter);


        final LinearLayoutManager layoutManager = new LinearLayoutManager(HomeActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mrecyclerViewProduct.setLayoutManager(layoutManager);
        mrecyclerViewProduct.setItemAnimator(new DefaultItemAnimator());
        mrecyclerViewProduct.setNestedScrollingEnabled(false);
        bestSellerRowAdapter = new BestRowProduct(HomeActivity.this);
        mrecyclerViewProduct.setAdapter(bestSellerRowAdapter);


        final LinearLayoutManager layoutManagerOne = new LinearLayoutManager(HomeActivity.this);
        layoutManagerOne.setOrientation(LinearLayoutManager.VERTICAL);
        mostPopularProducts.setLayoutManager(layoutManagerOne);
        mostPopularProducts.setItemAnimator(new DefaultItemAnimator());
        mostPopularProducts.setNestedScrollingEnabled(false);
        mostPopularProductAdapter = new MostPopularProduct(HomeActivity.this);
        mostPopularProducts.setAdapter(mostPopularProductAdapter);











       /* imageViewWhislist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, WishListProductActivity.class));
            }
        });
*/

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                }else{
                    drawerLayout.openDrawer(GravityCompat.START);
                }            }
        });


    }



    public void initViews(){


        mrecyclerViewProduct = findViewById(R.id.popularProducts);
        drawerLayout = findViewById(R.id.drawer);
        imageView = findViewById(R.id.home_bar);
        mrecyclerView = findViewById(R.id.home_product_recycler);
        mostPopularProducts=findViewById(R.id.mostPopularProduct);
       // imageViewWhislist = findViewById(R.id.im_wishlist);



    }


}


