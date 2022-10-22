package com.geektech.bindinghomeworkcontinent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private ArrayList<Country> country;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        CountryAdapter adapter = new CountryAdapter(country, requireContext(), this::onItemClick);
        binding.recyclerView.setAdapter(adapter);
    }
    private void loadData() {
        Bundle bundle = getArguments();
        country = new ArrayList<>();
        int continent = bundle.getInt("ID");
        switch (continent) {
            case 1:
                country.add(new Country("Киргизия","Бишкек", R.drawable.kg,1));
                country.add(new Country("Аргентина","Буэнос-Айрес", R.drawable.ar,1));
                country.add(new Country("Канада","Оттава", R.drawable.ca,1));
                country.add(new Country("Австралия","Канберра", R.drawable.au,1));
                country.add(new Country("Марокко","Рабат", R.drawable.mx,1));
                break;
            case 2:
                country.add(new Country("Сша","Вашингтон", R.drawable.us,1));
                country.add(new Country("Венесуэлы","Каракас", R.drawable.ke,1));
                country.add(new Country("Уругвай", "Монтевидео",R.drawable.uy,1));
                country.add(new Country("Палау","Нгерулдмуд", R.drawable.pe,1));
                country.add(new Country("Швейцария","Берн", R.drawable.eg,1));
                break;
            case 3:
                country.add(new Country("Норвегия","Осло", R.drawable.kz,1));
                country.add(new Country("Мексика", "Мехико",R.drawable.mx,1));
                country.add(new Country("Европа", "",R.drawable.ceu,1));
                country.add(new Country("Венесуэлы", "Каракас",R.drawable.ke,1));
                country.add(new Country("Франция","Париж", R.drawable.fr,1));
                break;
            case 4:
                country.add(new Country("Испания","Мадрид", R.drawable.ru,1));
                country.add(new Country("Корея","Сеул", R.drawable.pe,1));
                country.add(new Country("Панама","Панама", R.drawable.ua,1));
                country.add(new Country("Нигерия","Абуджа", R.drawable.ng,1));
                country.add(new Country("Фолклендский остров","Порт-Стэнли", R.drawable.jp,1));
                break;
            case 5:
                country.add(new Country("Таиланд","Бангкок", R.drawable.sd,1));
                country.add(new Country("Германия", "Берлин",R.drawable.hr,1));
                country.add(new Country("Новая Зеландия","Веллингтон", R.drawable.tj,1));
                country.add(new Country("Швейцария","Берн", R.drawable.ca,1));
                country.add(new Country("Сша","Вашингтон",R.drawable.us,1));
                break;
        }
    }

    private void onItemClick(Country country) {
    }
}
}