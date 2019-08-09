package info.androidhive.materialtabs.fragments;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class Kotak extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    EditText txtsisi;
    TextView txtsisi2;
    Button btnsisi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotak);

        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtsisi=findViewById(R.id.txtsisi);
        txtsisi2=findViewById(R.id.txtsisi2);
        btnsisi3=findViewById(R.id.btnsisi3);

        btnsisi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtsisi.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (txtsisi.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (txtsisi.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isipanjang = txtsisi.getText().toString();
                    String isilebar = txtsisi.getText().toString();
                    double txtpanjang = Double.parseDouble(isipanjang);
                    double txtLebar = Double.parseDouble(isilebar);
                    double hs = LuasPersegi(txtpanjang,txtLebar);
                    String output = String.valueOf(hs);
                    txtsisi2.setText(output.toString());
                }
            }
        });
    }
    public boolean onSupportNavigateUp() {

        finish();
        return true;
    }
    public double LuasPersegi(double txtsisi, double l){return txtsisi*l;}
}