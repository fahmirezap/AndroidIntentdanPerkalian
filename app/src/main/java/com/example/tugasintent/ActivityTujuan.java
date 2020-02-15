package com.example.tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTujuan extends AppCompatActivity {
    private Button btnperkalian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuan);

        TextView t = (TextView) findViewById(R.id.tvTampilNama);
        Bundle bundle=getIntent().getExtras();
        String text= bundle.getString("name");
        String s= "Halo " + text + "!";
        t.setText(s);

        btnperkalian=findViewById(R.id.btnPerkalian);
        btnperkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ActivityPerkalian.class);
                startActivity(intent);
            }
        });
    }
}
