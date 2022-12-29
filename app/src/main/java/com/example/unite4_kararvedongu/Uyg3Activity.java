package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3layout);
        final String kadi = "mustafawiped";
        final String sifre = "wolves123";
        Button btn = findViewById(R.id.uyg3Girisbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText user = findViewById(R.id.uyg3Kaditxt);
                EditText pass = findViewById(R.id.uyg3Sifretxt);
                if(kadi.equals(user.getText().toString()) && sifre.equals(pass.getText().toString()))
                {
                    Toast.makeText(Uyg3Activity.this, "Giriş Başarılı", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Uyg3Activity.this, "Giriş Başarısız", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
