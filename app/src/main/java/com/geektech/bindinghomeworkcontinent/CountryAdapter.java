package com.geektech.bindinghomeworkcontinent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder>{
    private ArrayList<Country> countries;
    private Context context;
    private OnItemClick ItemClick;

    public CountryAdapter(ArrayList<Country> countries,Context context, OnItemClick onItemClick) {
        this.countries = countries;
        this.context = context;
        this.ItemClick = onItemClick;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countries.get(position), context);
        holder.itemView.setOnClickListener(view -> {
            ItemClick.onItemClick(countries.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    static class CountryViewHolder extends RecyclerView.ViewHolder {
        private ItemCountryBinding binding;

        public CountryViewHolder(ItemCountryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


        public void bind(Country country, Context context) {
            binding.nameCountry.setText(country.getNameCountry());
            binding.nameCapital.setText(country.getNameCapital());
            Glide.with(context).load(country.getFlag()).into(binding.imageFlag);
        }
}
}
