package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityPerkalian extends AppCompatActivity {
    private Button btnkali,btnreset;
    private TextView tvhasil;
    private EditText etangka1,etangka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkalian);

        btnkali=findViewById(R.id.btnKali);
        btnreset=findViewById(R.id.btnReset);
        tvhasil=findViewById(R.id.tvHasil);
        etangka1=findViewById(R.id.etAngka1);
        etangka2=findViewById(R.id.etAngka2);

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sangka1 = etangka1.getText().toString();
                    String sangka2 = etangka2.getText().toString();

                    double angka1 = Double.parseDouble(sangka1);
                    double angka2 = Double.parseDouble(sangka2);

                    double hasil = angka1 * angka2;
                    String shasil = String.valueOf(hasil);
                    tvhasil.setText(shasil);
                }
                catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etangka1.setText("");
                etangka2.setText("");
                tvhasil.setText("0");
            }
        });
    }
}
