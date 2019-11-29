package com.ripenapps.w2naturals.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ripenapps.w2naturals.R;

public class MostPopularProduct extends RecyclerView.Adapter<MostPopularProduct.ViewHolder> {


    private Context context;
int count=0;


    public MostPopularProduct(Context context) {

        this.context = context;
    }


    @NonNull
    @Override
    public MostPopularProduct.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.best_seller_row, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MostPopularProduct.ViewHolder holder, int position) {

        final ViewHolder holders = (ViewHolder) holder;

        holders.tv_set_count.setText(count+"");

        holders.bt_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                holders.tv_set_count.setText(count+"");

            }
        });
        holders. bt_less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(count>0)
                    count--;
                else
                    count=0;

                holders.tv_set_count.setText(count+"");

            }
        });



        holders.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holders.textView.setVisibility(View.INVISIBLE);
                holders.linearLayout.setVisibility(View.VISIBLE);

            }
        });

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    LinearLayout linearLayout;
        ImageView bt_more;
        ImageView bt_less;
        TextView tv_set_count;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.add_cart);
            linearLayout=itemView.findViewById(R.id.lv_add_plus);

            bt_more = itemView.findViewById(R.id.bt_more);
            bt_less = itemView.findViewById(R.id.bt_less);
            tv_set_count = itemView.findViewById(R.id.tv_set_count);
        }
    }
}