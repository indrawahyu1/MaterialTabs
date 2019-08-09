package info.androidhive.materialtabs;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    EditText txtongko;
    EditText txtagk2;
    Button btnhasilnya;
    TextView txtHasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        txtongko=findViewById(R.id.txtongko);
        txtagk2=findViewById(R.id.txtagk2);
        btnhasilnya=findViewById(R.id.btnhasilnya);
        txtHasil2=findViewById(R.id.txthasil2);




        btnhasilnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtongko.length()==0 && txtagk2.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                else if (txtongko.length()==0){
                    Toast.makeText(getApplication(),"Alas tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                else if (txtagk2.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isialas = txtongko.getText().toString();
                    String isitinggi = txtagk2.getText().toString();
                    double txtagk1 = Double.parseDouble(isialas);
                    double txtagk2 = Double.parseDouble(isitinggi);
                    double hs = LuasSegitiga(txtagk1,txtagk2);
                    String output = String.valueOf(hs);
                    txtHasil2.setText(output.toString());
                }
            }
        });
    }
    public boolean onSupportNavigateUp(){

        finish();
        return true;
    }
    public double LuasSegitiga(double txtagk1, double txtagk2){return txtagk1*txtagk2/2;}
}

