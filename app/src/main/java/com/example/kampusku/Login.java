package com.example.kampusku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button regis = findViewById(R.id.register);
        Button login = findViewById(R.id.login);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        String data_user = "kiki";
        String data_pws  = "kiki";
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_name = username.getText().toString().toLowerCase().trim();
                String result_ps = password.getText().toString().toLowerCase().trim();
                if(result_name.isEmpty() || result_ps.isEmpty())
                {
                    Toast.makeText(Login.this,"Data Kosong",Toast.LENGTH_SHORT).show();
                }else{
                    if(result_name.equals(data_user) && result_ps.equals(data_pws))
                    {
                        Toast.makeText(Login.this,"Berhasil",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Login.this,MainActivity.class));
                    }else{
                        Toast.makeText(Login.this,"Username atau Password salah !",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,Register.class));
            }
        });
    }
}