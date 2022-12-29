package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2layout);
    }
    public void btnHesapla(View view)
    {
        EditText x = findViewById(R.id.uyg2Txt1);
        EditText y = findViewById(R.id.uyg2Text2);
        if (Integer.parseInt(x.getText().toString()) > Integer.parseInt(y.getText().toString()))
        {
            Toast.makeText(this, "X Büyüktür", Toast.LENGTH_SHORT).show();
        }
        if (Integer.parseInt(x.getText().toString()) < Integer.parseInt(y.getText().toString()))
        {
            Toast.makeText(this, "Y Büyüktür", Toast.LENGTH_SHORT).show();
        }
        if (Integer.parseInt(x.getText().toString()) == Integer.parseInt(y.getText().toString()))
        {
            Toast.makeText(this, "X ve Y eşittir", Toast.LENGTH_SHORT).show();
        }
    }
}
