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

public class Lingkaran extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    EditText txtjari;
    TextView txthasill;
    Button btnjari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtjari = findViewById(R.id.txtjari);
        txthasill = findViewById(R.id.txthasill);
        btnjari = findViewById(R.id.btnjari);
        btnjari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Ijari = txtjari.getText().toString().trim();

                if (Ijari.equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "g", Toast.LENGTH_LONG).show();
                } else {
                    double jari = Double.parseDouble(String.valueOf(txtjari.getText()));
                    double luaslingkaran = (3.14 * jari * jari);
                    txthasill.setText(String.valueOf(luaslingkaran));
                }
            }
        });
    }
    public boolean onSupportNavigateUp() {

        finish();
        return true;
    }
}
