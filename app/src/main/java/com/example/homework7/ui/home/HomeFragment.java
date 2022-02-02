package com.example.homework7.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework7.R;
import com.example.homework7.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private ArrayList<ModelForFirst> arrayList = new ArrayList<>();
    private PersonAdapter personAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        personAdapter = new PersonAdapter();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler();

    }

    private void createList() {
        arrayList  = new ArrayList<>();
        arrayList.add(new ModelForFirst("sagynaly", R.drawable.img_city));
        arrayList.add(new ModelForFirst("sagynaly", R.drawable.img_city));
        arrayList.add(new ModelForFirst("sagynaly", R.drawable.img_city));
        arrayList.add(new ModelForFirst("sagynaly", R.drawable.img_city));
        arrayList.add(new ModelForFirst("argen", R.drawable.img_city));
    }

    private void initRecycler() {
        binding.recycler1.setAdapter(personAdapter);
        personAdapter.setArrayList(arrayList);
    }

}