package com.ripenapps.w2naturals.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.RecyclerView;

import com.ripenapps.w2naturals.R;
import com.ripenapps.w2naturals.screens.HomeActivity;


public class HomeRowAdapter extends RecyclerView.Adapter<HomeRowAdapter.ViewHolder> {
    private String[] mDataset;
    private Context mContext;



    public static class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

    public HomeRowAdapter(String[] myDataset, Context context) {
        mDataset = myDataset;
        mContext = context;
    }

    @Override
    public HomeRowAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_item_row, parent, false);
        ViewHolder vh = new ViewHolder(v);




        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}