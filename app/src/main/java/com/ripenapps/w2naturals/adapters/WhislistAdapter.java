package com.ripenapps.w2naturals.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ripenapps.w2naturals.R;

public class WhislistAdapter extends RecyclerView.Adapter<WhislistAdapter.ViewHolder> {


    private Context context;


    public WhislistAdapter(Context context) {

        this.context = context;
    }


    @NonNull
    @Override
    public WhislistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.whislist_row, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final WhislistAdapter.ViewHolder holder, int position) {

        final ViewHolder holders = (ViewHolder) holder;

        if (position == 0) {
            holder.relativeLayout.setVisibility(View.VISIBLE);
            holder.cardView.setVisibility(View.VISIBLE);
        } else {
            holder.relativeLayout.setVisibility(View.GONE);
            holder.cardView.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout relativeLayout;

        CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            relativeLayout = itemView.findViewById(R.id.relative_wishlist);
            cardView = itemView.findViewById(R.id.card_wish);

        }
    }
}