package com.example.juanpablo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mostrarF(View view)
    {
        Intent i = new Intent(this, Frameworks.class);
        startActivity(i);
    }

    public void mostrarD(View view) {
        Intent i = new Intent(this, Distribuidos.class);
        startActivity(i);
    }

    public void mostrarM(View view) {
        Intent i = new Intent(this, Multiplataforma.class);
        startActivity(i);
    }

    public void mostrarA(View view) {
        Intent i = new Intent(this, Auditoria.class);
        startActivity(i);
    }

    public void mostrarSI(View view) {
        Intent i = new Intent(this, Sistemas.class);
        startActivity(i);
    }
}
