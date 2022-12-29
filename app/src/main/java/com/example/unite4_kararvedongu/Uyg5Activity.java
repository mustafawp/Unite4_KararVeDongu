package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5layout);
        EditText not1 = findViewById(R.id.not1);
        EditText not2 = findViewById(R.id.not2);
        EditText not3 = findViewById(R.id.not3);
        Button btn = findViewById(R.id.onaylabtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (Integer.parseInt(not1.getText().toString()) > 100 || Integer.parseInt(not2.getText().toString()) > 100 || Integer.parseInt(not3.getText().toString()) > 100)
                    {
                        Toast.makeText(Uyg5Activity.this, "Sayılar 100 den büyük olamaz", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    int ortalama = (Integer.parseInt(not1.getText().toString()) + Integer.parseInt(not2.getText().toString()) + Integer.parseInt(not3.getText().toString())) / 3;
                    if (ortalama < 25) {
                        Toast.makeText(Uyg5Activity.this, "Ortalamanız 0 :D", Toast.LENGTH_SHORT).show();
                    } else if (ortalama < 50) {
                        Toast.makeText(Uyg5Activity.this, "Ortalamanız 1 :D", Toast.LENGTH_SHORT).show();
                    } else if (ortalama < 60) {
                        Toast.makeText(Uyg5Activity.this, "2 ile geçtin knk :D", Toast.LENGTH_SHORT).show();
                    } else if (ortalama < 70) {
                        Toast.makeText(Uyg5Activity.this, "3 ile geçtiniz.", Toast.LENGTH_SHORT).show();
                    } else if (ortalama < 85) {
                        Toast.makeText(Uyg5Activity.this, "4 ile geçtiniz. Tebrikler", Toast.LENGTH_SHORT).show();
                    } else if (ortalama <= 100) {
                        Toast.makeText(Uyg5Activity.this, "Kralım 5 ile geçtin tebrikler!", Toast.LENGTH_SHORT).show();
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(Uyg5Activity.this, "Hata! Lütfen tekrar dene.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
