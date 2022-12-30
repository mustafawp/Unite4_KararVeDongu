package com.example.unite4_kararvedongu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class GoldSoru1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsorulayout);
        Button btn = findViewById(R.id.GbtnOgren);
        EditText txt = findViewById(R.id.GtxtSayi);
        TextView textler = findViewById(R.id.GtxtSayilar);
        //TreeMap list = new TreeMap<>();
        HashMap<Integer, Integer> list = new HashMap<>();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.clear();
                textler.setText("");
                for(int i = 1;i <= 10;i++)
                {
                    int sonuc = i * Integer.parseInt(txt.getText().toString());
                    list.put(i,sonuc);
                }
                for(int i=1;i <= list.size();i++)
                {
                    textler.setText(textler.getText().toString() + "\n" + txt.getText().toString() + " x " + i + " = " + list.get(i));
                }
                //kısa yol
                //for(int i = 1; i <= 10;i++){
                //  textler.setText(textler.getText().toString() % "\n" + txt.getText.toString() + " x " + i + " = " + Integer.parseInt(txt.getText.toString()) * i)
                // }
            }
        });
    }
}