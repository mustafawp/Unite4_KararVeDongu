package com.example.unite4_kararvedongu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Uyg9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9layout);
        EditText txt = findViewById(R.id.uyg10Giris);
        List<Integer> list=new ArrayList<Integer>();
        TextView sayilar = findViewById(R.id.txtSayilar);
        Button btn = (Button) findViewById(R.id.btnUygula10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.clear();
                sayilar.setText("");
                for(int i = 0;i <= Integer.parseInt(txt.getText().toString());i++)
                {
                    if(i % 2 == 0)
                    {
                        list.add(i);
                    }
                }
                for(int i = 0;i < list.size();i++)
                {
                    String z = sayilar.getText().toString();
                    sayilar.setText(z + "\n" + list.get(i).toString());
                }
            }
        });
        Button btn2 = findViewById(R.id.btnTekSayilar);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.clear();
                sayilar.setText("");
                for(int i = 0;i <= Integer.parseInt(txt.getText().toString());i++)
                {
                    if(i % 2 != 0)
                    {
                        list.add(i);
                    }
                }
                for(int i = 0;i < list.size();i++)
                {
                    String z = sayilar.getText().toString();
                    sayilar.setText(z + "\n" + list.get(i).toString());
                }
            }
        });
        Button btn3 = findViewById(R.id.btnTumSayilar);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.clear();
                sayilar.setText("");
                for(int i = 0;i <= Integer.parseInt(txt.getText().toString());i++)
                {
                    list.add(i);
                }
                for(int i = 0;i < list.size();i++)
                {
                    String z = sayilar.getText().toString();
                    sayilar.setText(z + "\n" + list.get(i).toString());
                }
            }
        });
    }
}