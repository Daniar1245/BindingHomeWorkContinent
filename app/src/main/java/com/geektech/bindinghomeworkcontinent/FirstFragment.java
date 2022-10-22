package com.geektech.bindinghomeworkcontinent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment implements OnItemClick{
    private FragmentFirstBinding binding;
    private ArrayList<Country> countries;
    public static final String KEY = "ID";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(LayoutInflater.from(getContext()), container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        CountryAdapter adapter = new CountryAdapter(countries, requireContext(), this::onItemClick);
        binding.recyclerView.setAdapter(adapter);
    }
    private void loadData() {
        countries = new ArrayList<>();
        countries.add(new Country("Евразия", "",R.drawable.cas, 1));
        countries.add(new Country("Северная Америка","", R.drawable.us, 2));
        countries.add(new Country("Южная Америка","", R.drawable.csa, 3));
        countries.add(new Country("Африка","", R.drawable.caf, 4));
        countries.add(new Country("Австралия","", R.drawable.coc, 5));
    }
    @Override
    public void onItemClick(Country country) {
        Bundle bundle = new Bundle();
        SecondFragment fragment = new SecondFragment();
        bundle.putInt("ID", country.getKey_id());
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).
                addToBackStack("").commit();
    }
}