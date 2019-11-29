package com.ripenapps.w2naturals.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ripenapps.w2naturals.R;

public class SimilarProductImgRecycler extends RecyclerView.Adapter<SimilarProductImgRecycler.ViewHolder> {

    private Context context;

    public SimilarProductImgRecycler(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public SimilarProductImgRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_similar_product, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SimilarProductImgRecycler.ViewHolder holder, int position) {

        final ViewHolder holders = (ViewHolder) holder;

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}