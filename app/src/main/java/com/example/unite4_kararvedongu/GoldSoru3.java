package com.example.unite4_kararvedongu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GoldSoru3 extends AppCompatActivity {

    HashMap<Integer,String> ulkeler = new HashMap<>();
    private String[] torba1icinulkeler = {"Almanya", "Arjantin", "Fransa", "Arabistan","Mısır", "İngiltere"};
    private String[] torba2icinulkeler = {"Brezilya", "Senegal", "Fas", "Portekiz","Qatar", "Hırvatistan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru3layout);
        ulkeler.put(0,"Almanya");
        ulkeler.put(1,"Arjantin");
        ulkeler.put(2,"Fransa");
        ulkeler.put(3,"Arabistan");
        ulkeler.put(4,"Mısır");
        ulkeler.put(5,"İngiltere");
        ulkeler.put(6,"Brezilya");
        ulkeler.put(7,"Senegal");
        ulkeler.put(8,"Fas");
        ulkeler.put(9,"Portekiz");
        ulkeler.put(10,"Qatar");
        ulkeler.put(11,"Hırvatistan");
        ListView torba1 = findViewById(R.id.listTorba1);
        ListView torba2 = findViewById(R.id.listTorba2);
        List<Integer> sayilar=new ArrayList<Integer>();
        ArrayAdapter<String> veriAdaptoru1=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,torba1icinulkeler);
        ArrayAdapter<String> veriAdaptoru2=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,torba2icinulkeler);
        torba1.setAdapter(veriAdaptoru1);
        torba2.setAdapter(veriAdaptoru2);
        Button btn = findViewById(R.id.G3kuraCek);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView grupA = findViewById(R.id.G3grupA);
                TextView grupB = findViewById(R.id.G3grupB);
                TextView grupC = findViewById(R.id.G3grupC);
                TextView grupD = findViewById(R.id.G3grupD);
                for (int i = 0; i < ulkeler.size();i++)
                {
                    int random = (int)(Math.random()*10);
                    sayilar.add(random);
                    for(int ia = 0; i < sayilar.size();ia++)
                    {
                        if(sayilar.get(ia) == random)
                        {
                            random = (int)(Math.random()*10);
                        }
                    }

                }
            }
        });
    }
}