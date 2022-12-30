package com.example.unite4_kararvedongu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btnUyg1);
    }

    public void btnUyg1(View view)
    {
        Intent uyg1 = new Intent(MainActivity.this,Uyg1Activity.class);
        startActivity(uyg1);
    }
    public void btnUyg2(View view)
    {
        Intent uyg2 = new Intent(MainActivity.this,Uyg2Activity.class);
        startActivity(uyg2);
    }
    public void btnUyg3(View view)
    {
        Intent uyg3 = new Intent(MainActivity.this,Uyg3Activity.class);
        startActivity(uyg3);
    }
    public void btnUyg4(View view)
    {
        Intent uyg4 = new Intent(MainActivity.this,Uyg4Activity.class);
        startActivity(uyg4);
    }
    public void btnUyg5(View view)
    {
        Intent uyg5 = new Intent(MainActivity.this,Uyg5Activity.class);
        startActivity(uyg5);
    }
    public void btnUyg6(View view)
    {
        Intent uyg6 = new Intent(MainActivity.this,Uyg6Activity.class);
        startActivity(uyg6);
    }
    public void btnUyg7(View view)
    {
        Intent uyg7 = new Intent(MainActivity.this,Uyg7Activity.class);
        startActivity(uyg7);
    }
    public void btnUyg8(View view)
    {
        Intent uyg8 = new Intent(MainActivity.this,Uyg8Activity.class);
        startActivity(uyg8);
    }
    public void btnUyg9(View view)
    {
        Intent uyg9 = new Intent(MainActivity.this,Uyg9Activity.class);
        startActivity(uyg9);
    }
    public void btnUyg10(View view)
    {
        Intent uyg10 = new Intent(MainActivity.this,Uyg10Activity.class);
        startActivity(uyg10);
    }
    public void btnAltin(View view)
    {
        Intent altin = new Intent(MainActivity.this,GoldSoru1.class);
        startActivity(altin);
    }
    public void asd(View view)
    {
        Intent altin2 = new Intent(MainActivity.this,GoldSoru2.class);
        startActivity(altin2);
    }
    public void asd3(View view)
    {
        Intent altin2 = new Intent(MainActivity.this,GoldSoru3.class);
        startActivity(altin2);
    }
}