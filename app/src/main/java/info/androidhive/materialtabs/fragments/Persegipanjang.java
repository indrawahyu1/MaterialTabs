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

public class Persegipanjang extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
EditText txtpanjang;
EditText txtLebar;
TextView txthsl;
Button btnLuas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtpanjang = findViewById(R.id.txtpanjang);
        txtLebar = findViewById(R.id.txtlebar);
        txthsl = findViewById(R.id.txthsl);
        btnLuas = findViewById(R.id.btnLuas);

        btnLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtpanjang.length()==0 && txtLebar.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else if (txtpanjang.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                else if (txtLebar.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isipanjang = txtpanjang.getText().toString();
                    String isilebar = txtLebar.getText().toString();
                    double txtpanjang = Double.parseDouble(isipanjang);
                    double txtLebar = Double.parseDouble(isilebar);
                    double hs = LuasPersegiPanjang(txtpanjang,txtLebar);
                    String output = String.valueOf(hs);
                    txthsl.setText(output.toString());
                }
            }
        });
    }
    public boolean onSupportNavigateUp() {

        finish();
        return true;
    }
    public double LuasPersegiPanjang(double txtpanjang, double l){return txtpanjang*l;}
}

