package com.example.pma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pma.R;

public class MainActivity extends AppCompatActivity {


    private EditText eName;
    private EditText ePassword;
    private Button eLogin;

    String userName = "";
    String userPassword = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pocetna);
        eName = findViewById(R.id.ime);
        ePassword = findViewById(R.id.sifra);
        eLogin = findViewById(R.id.btnLogin);


        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                userName = eName.getText().toString();
                userPassword = ePassword.getText().toString();


                if(userName.isEmpty() || userPassword.isEmpty())
                {

                    Toast.makeText(MainActivity.this, "Unesi Korisnicko ime i Sifru!", Toast.LENGTH_LONG).show();

                }else {

                    startActivity(new Intent(MainActivity.this, MainActivity2.class));

                }
            }
        });
    }

}
