package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4layout);
        Switch knmservisi = findViewById(R.id.knmServisleri);
        Switch knmbilgi = findViewById(R.id.knmBilgileri);
        Switch knmbilgipsh = findViewById(R.id.knmInfoPush);
        if (knmservisi.isChecked() == true)
        {
            knmbilgi.setVisibility(View.VISIBLE);
            knmbilgipsh.setVisibility(View.VISIBLE);
        }
        else
        {
            knmbilgi.setVisibility(View.GONE);
            knmbilgipsh.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Switch knmservisi = findViewById(R.id.knmServisleri);
        Switch knmbilgi = findViewById(R.id.knmBilgileri);
        Switch knmbilgipsh = findViewById(R.id.knmInfoPush);
        knmservisi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (knmservisi.isChecked() == true)
                {
                    knmbilgi.setVisibility(View.VISIBLE);
                    knmbilgipsh.setVisibility(View.VISIBLE);
                }
                else
                {
                    knmbilgi.setVisibility(View.GONE);
                    knmbilgipsh.setVisibility(View.GONE);
                }
            }
        });
    }
    public void btnClick (View view)
    {
        Switch knmservisi = findViewById(R.id.knmServisleri);
        Switch knmbilgi = findViewById(R.id.knmBilgileri);
        Switch knmbilgipsh = findViewById(R.id.knmInfoPush);
        if (!knmservisi.isChecked())
        {
            Toast.makeText(this, "Konum servisleri açık değil.", Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(knmbilgi.isChecked() == true && knmbilgipsh.isChecked() == true)
            {
                Toast.makeText(this, "Konum Bilgisi alma & gönderme açık.", Toast.LENGTH_SHORT).show();
            }
            else if(knmbilgi.isChecked() == true && knmbilgipsh.isChecked() == false)
            {
                Toast.makeText(this, "Konum Bilgilerini alma açık", Toast.LENGTH_SHORT).show();
            }
            else if(knmbilgi.isChecked() == false && knmbilgipsh.isChecked() == true)
            {
                Toast.makeText(this, "Konum bilgilerini gönderme açık", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Servisler açık lakin alma & gönderme kapalı.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
