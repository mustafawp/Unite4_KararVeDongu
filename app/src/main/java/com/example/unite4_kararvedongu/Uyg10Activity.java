package com.example.unite4_kararvedongu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Uyg10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10layout);
        Button btn = findViewById(R.id.btnUygulaS);
        EditText txt = findViewById(R.id.txtSayi10);
        TextView textview = findViewById(R.id.txtSonuc10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi = Integer.parseInt(txt.getText().toString());
                int number = 1;
                int sayac = 1;
                int sonuc=1;
                while (sayac <= sayi)
                {
                    sonuc = sonuc * sayac;
                    sayac++;
                }
                textview.setText("Sonuç = " + sonuc);
            }
        });
    }
}