package com.example.unite4_kararvedongu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Uyg8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8layout);
        Button btn = findViewById(R.id.btnDongu2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0;i <=100;i+=3)
                {
                    System.out.println("Sayı = " + i);
                }
            }
        });
    }
}