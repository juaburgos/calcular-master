package com.example.juanpablo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Acerca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);
    }


    public void regresar(View view)

    {
        finish();
    }

    public void acerca(View view)
    {
        Intent i = new Intent(this, Acerca.class);
        startActivity(i);
    }
}
