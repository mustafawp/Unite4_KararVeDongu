package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1layout);
    }

    public void uyg1Uygulabtn(View view)
    {
        EditText txt = findViewById(R.id.uyg1Sayitxt);
        try {
            int not = Integer.parseInt(txt.getText().toString());
            if (not > 100 || not <= 0) {
                Toast.makeText(this, "Not 0 dan büyük, 100 veya daha küçük olmalıdır.", Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this, "Başarıyla Uygulandı.", Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Lütfen sayı girdiğinize emin olun.", Toast.LENGTH_SHORT).show();
        }
    }
}
