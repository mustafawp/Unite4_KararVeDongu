package com.example.unite4_kararvedongu;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6layout);
        EditText txt = findViewById(R.id.uyg6Txt);
        TextView text = findViewById(R.id.uyg6TextV);
        Button btn = findViewById(R.id.uyg6Btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ay = Integer.parseInt(txt.getText().toString());
                String yazi;
                switch (ay) {
                    case 1:
                        yazi = "Ocak";
                        break;
                    case 2:
                        yazi = "Şubat";
                        break;
                    case 3:
                        yazi = "Mart";
                        break;
                    case 4:
                        yazi = "Nisan";
                        break;
                    case 5:
                        yazi = "Mayıs";
                        break;
                    case 6:
                        yazi = "Haziran";
                        break;
                    case 7:
                        yazi = "Temmuz";
                        break;
                    case 8:
                        yazi = "Ağustos";
                        break;
                    case 9:
                        yazi = "Eylül";
                        break;
                    case 10:
                        yazi = "Ekim";
                        break;
                    case 11:
                        yazi = "Kasım";
                        break;
                    case 12:
                        yazi = "Aralık";
                        break;
                    default:
                        yazi = "HATALI GİRİŞ";
                        break;
                }
                text.setText(yazi);
            }
        });
    }
}
