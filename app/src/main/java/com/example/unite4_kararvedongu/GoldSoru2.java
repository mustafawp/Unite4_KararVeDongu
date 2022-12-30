package com.example.unite4_kararvedongu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GoldSoru2 extends AppCompatActivity {
    public int tek2 = 0;
    public int cift2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru2layout);
        EditText txt = findViewById(R.id.G2txtGirisSayi);
        TextView tek = findViewById(R.id.G2teksayilar);
        TextView sa = findViewById(R.id.G2ciftsayilar);
        Button btn = findViewById(R.id.G2btnHesapla);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sa.setText("");
                tek.setText("");
                int ab = Integer.parseInt(txt.getText().toString());
                for(int i = 1; i <= ab;i++)
                {
                    if(i % 2 == 0)
                    {
                        sa.setText(sa.getText().toString() + "\n" + (cift2 + i));
                        cift2 = cift2 + i;
                    }
                    else {
                        tek.setText(tek.getText().toString() + "\n" + (tek2 + i));
                        tek2 = tek2 + i;
                    }
                }
            }
        });
    }
}