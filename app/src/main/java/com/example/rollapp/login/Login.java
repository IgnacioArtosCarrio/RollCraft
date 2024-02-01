package com.example.rollapp.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.rollapp.R;
import com.example.rollapp.VentanaPrincipal;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button entrar = findViewById(R.id.login);
        TextView crearCuenta = findViewById(R.id.create_account);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, VentanaPrincipal.class);
                startActivity(intent);
            }
        });

        crearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, CrearCuenta.class);
                startActivity(intent);
            }
        });
    }
}