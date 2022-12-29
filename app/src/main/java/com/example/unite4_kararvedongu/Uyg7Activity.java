package com.example.unite4_kararvedongu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Uyg7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7layout);
        Button btn = findViewById(R.id.btnDongu);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 1;i <= 50;i++)
                {  //C# aynısı SKDLGJASDFPLŞGSJFES
                    System.out.println("Sayı = " + i);
                }
            }
        });
    }
}