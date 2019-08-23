package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.Segitiga;

public class TwoFragment extends Fragment{

    Button btnsegitiga;
    Button btnlingkaran;
    Button btnpersegipanjang;
    Button btnkotak;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        btnsegitiga = view.findViewById(R.id.btnsegitiga);
        btnpersegipanjang = view.findViewById(R.id.btnpersegipanjang);
        btnlingkaran = view.findViewById(R.id.btnlingkaran);
        btnkotak = view.findViewById(R.id.btnkotak);
        btnsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), Segitiga.class);
                startActivity(in);
            }
        });
        btnpersegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), Persegipanjang.class);
                startActivity(in);
            }
        });
        btnlingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), Lingkaran.class);
                startActivity(in);
            }
        });
        btnkotak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), Kotak.class);
                startActivity(in);
            }
        });
        return view;
    }
}
