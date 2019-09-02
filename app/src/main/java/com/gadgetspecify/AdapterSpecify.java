package com.gadgetspecify;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterSpecify extends RecyclerView.Adapter<AdapterSpecify.SpecifyViewHolder> {
    private ArrayList<ModelSpecify> listspecify;
    private OnItemClickCallback onItemClickCallback;
    AdapterSpecify(ArrayList<ModelSpecify> listspecify) {
        this.listspecify = listspecify;
    }

    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public AdapterSpecify.SpecifyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_specify, parent, false);
        return new SpecifyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterSpecify.SpecifyViewHolder holder, final int position) {

        holder.gname.setText(listspecify.get(position).getNama());
        holder.Rn.setText(listspecify.get(position).getRelease());
        holder.itemspecify.setImageResource(listspecify.get(position).getPhoto());
        holder.itemspecify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listspecify.get(holder.getAdapterPosition()));

            }


        });


    }

    @Override
    public int getItemCount() {
        return (listspecify != null) ? listspecify.size() : 0;

    }

    class SpecifyViewHolder extends RecyclerView.ViewHolder {
        TextView gname, Rn;
        ImageView itemspecify;
        CardView detail;

        public SpecifyViewHolder(@NonNull View itemView) {
            super(itemView);
            gname = (TextView) itemView.findViewById(R.id.Gname);
            Rn = (TextView) itemView.findViewById(R.id.Release);
            itemspecify = (ImageView) itemView.findViewById(R.id.item_specify);

        }

    }

    public interface OnItemClickCallback {
        void onItemClicked(ModelSpecify data);
    }
}