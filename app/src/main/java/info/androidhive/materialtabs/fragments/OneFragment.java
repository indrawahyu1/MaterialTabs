package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{
    Button btnKurang, btnKali, btnBagi, btnplus;
    EditText txtangka1;
    EditText txtangka2;
    TextView txtHasil;



    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        btnKurang = (Button) view.findViewById(R.id.btn_);
        btnKali = (Button) view.findViewById(R.id.btnx);
        btnBagi = (Button) view.findViewById(R.id.btnbg);
        btnplus = (Button) view.findViewById(R.id.btnplus);
        txtangka1 = view.findViewById(R.id.txtangka1);
        txtangka2 = view.findViewById(R.id.txtangka2);
        txtHasil = (TextView) view.findViewById(R.id.txthasil);

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtangka1.getText().toString();
                String angka2 = txtangka2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim(). isEmpty()|| angka2.equalsIgnoreCase("")|| angka2.trim().isEmpty()){
                    Toast.makeText(getContext(), "g", Toast.LENGTH_LONG).show();

                }else {
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(txtangka1.getText().toString());
                    angkas2 = Double.parseDouble(txtangka2.getText().toString());
                    hasill = angkas1 + angkas2;
                    txtHasil.setText("hasil dari " + angka1 + "+" + angka2+ "="+hasill );
                }
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtangka1.getText().toString();
                String angka2 = txtangka2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim(). isEmpty()|| angka2.equalsIgnoreCase("")|| angka2.trim().isEmpty()){
                    Toast.makeText(getContext(), "g", Toast.LENGTH_LONG).show();

                }else if (angka1.equalsIgnoreCase("0")||angka2.equalsIgnoreCase("")||angka2.trim().isEmpty()){
                    Toast.makeText(getContext(), "/ g boleh 0", Toast.LENGTH_LONG);
                }
                else{
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(txtangka1.getText().toString());
                    angkas2 = Double.parseDouble(txtangka2.getText().toString());
                    hasill = angkas1 / angkas2;
                    txtHasil.setText("hasil dari " + angka1 + "/" + angka2+ "="+hasill );

                }
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtangka1.getText().toString();
                String angka2 = txtangka2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim(). isEmpty()|| angka2.equalsIgnoreCase("")|| angka2.trim().isEmpty()){
                    Toast.makeText(getContext(), "g", Toast.LENGTH_LONG).show();

                }else {
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(txtangka1.getText().toString());
                    angkas2 = Double.parseDouble(txtangka2.getText().toString());
                    hasill = angkas1 * angkas2;
                    txtHasil.setText("hasil dari " + angka1 + "x" + angka2+ "="+hasill );
                }
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka1 = txtangka1.getText().toString();
                String angka2 = txtangka2.getText().toString();

                if (angka1.equalsIgnoreCase("") || angka1.trim(). isEmpty()|| angka2.equalsIgnoreCase("")|| angka2.trim().isEmpty()){
                    Toast.makeText(getContext(), "g", Toast.LENGTH_LONG).show();

                }else {
                    double angkas1, angkas2, hasill;
                    angkas1 = Double.parseDouble(txtangka1.getText().toString());
                    angkas2 = Double.parseDouble(txtangka2.getText().toString());
                    hasill = angkas1 - angkas2;
                    txtHasil.setText("hasil dari " + angka1 + "-" + angka2+ "="+hasill );
                }
            }
        });



        return view;
    }

}
