package com.example.homework7.ui.home;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework7.databinding.ItemHomeBinding;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.MyViewHolder> {

    private ArrayList<ModelForFirst> arrayList;
    private ItemHomeBinding binding;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new MyViewHolder(binding);

    }

    public void setArrayList(ArrayList<ModelForFirst> arrayList) {
        this.arrayList = new ArrayList<>();
        this.arrayList = arrayList;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {


        public MyViewHolder(@NonNull ItemHomeBinding itemView) {
            super(itemView.getRoot());

        }

        public void onBind(ModelForFirst s) {
            binding.tvComm.setText(s.getComment());
            binding.imgCt.setImageResource(s.getPhoto());
        }
    }
}
