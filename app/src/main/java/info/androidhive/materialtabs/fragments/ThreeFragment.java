package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import info.androidhive.materialtabs.BangunRuang;
import info.androidhive.materialtabs.BangunruangAdapter;
import info.androidhive.materialtabs.R;

public class ThreeFragment extends Fragment {

    private RecyclerView recyclerView;
    private BangunruangAdapter adapter;
    private ArrayList<BangunRuang> mahasiswaArrayList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        addData();

        recyclerView = view.findViewById(R.id.recycler_view);

        adapter = new BangunruangAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
        return view;
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new BangunRuang("Kubus", "6xs2"));
        mahasiswaArrayList.add(new BangunRuang("Balok", "(2 x p x l) + (2 x p x t) + (2 x l x t)"));
        mahasiswaArrayList.add(new BangunRuang("Kerucut", " (π x r2 )+  (π x r x s )"));
        mahasiswaArrayList.add(new BangunRuang("Tabung", " (2 x π x r x r) + (π x d x t)"));
    }

}