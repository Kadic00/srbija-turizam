package com.example.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Prikaz extends AppCompatActivity {

    TextView naslov;
    Button rez;
    TextView opis;
    ImageView slika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.prikaz);
        naslov = findViewById(R.id.naslov2);
        slika = findViewById(R.id.slika2);
        opis = findViewById(R.id.opis);
        rez = findViewById(R.id.rez);
        Intent i = getIntent();
        String ime =i.getExtras().getString("naziv");
        String op =i.getExtras().getString("opis");
        int slidza = i.getIntExtra("slika",0);
        slika.setImageResource(slidza);
        naslov.setText(ime);
        opis.setText(op);

        rez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Uspesno si rezervisao:" + ime,Toast.LENGTH_SHORT).show();

            }
        });






    }
}