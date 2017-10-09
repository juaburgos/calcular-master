package com.example.juanpablo.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sistemas extends AppCompatActivity {

    private EditText nota_s1, nota_s2,nota_s3;
    private TextView tv_res_s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistemas);
        SharedPreferences prefe1=getSharedPreferences("Sistemas", Context.MODE_PRIVATE);
        nota_s1=(EditText)findViewById(R.id.nota_s1);
        nota_s1.setText(prefe1.getString("primer",""));
        nota_s2=(EditText)findViewById(R.id.nota_s2);
        nota_s2.setText(prefe1.getString("segundo",""));
        nota_s3=(EditText)findViewById(R.id.nota_s3);
        nota_s3.setText(prefe1.getString("tercer",""));
        tv_res_s=(TextView)findViewById(R.id.tv_res_s);
        tv_res_s.setText(prefe1.getString("resul","0"));



        nota_s1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {



                SharedPreferences prefe1=getSharedPreferences("Sistemas",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=prefe1.edit();
                String t1=nota_s1.getText().toString();
                editor.putString("primer", nota_s1.getText().toString());
                String t2=nota_s2.getText().toString();
                String t3=nota_s3.getText().toString();
                if (nota_s1!=null)
                {
                    try {
                        float n1=Float.parseFloat(t1);
                        float n2=Float.parseFloat(t2);
                        float n3=Float.parseFloat(t3);

                        if (n1<=5 )
                        {
                                double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                                String resul=Double.toString(cal);
                                editor.putString("resul", resul);
                                editor.commit();
                                tv_res_s.setText(resul);

                            }
                            else
                            {
                                //toast para menores de 5
                                Toast notificacion = Toast.makeText(Sistemas.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                                notificacion.show();
                            }


                    }catch (Exception ex)
                    {
                        //toast para valores vacios
                        Toast notificacion = Toast.makeText(Sistemas.this,getResources().getString(R.string.texto_vacio),Toast.LENGTH_LONG);
                        notificacion.show();
                    }

                }

            }

        });
        nota_s2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                SharedPreferences prefe1=getSharedPreferences("Sistemas",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=prefe1.edit();
                String t1=nota_s1.getText().toString();
                String t2=nota_s2.getText().toString();
                editor.putString("segundo", nota_s2.getText().toString());
                String t3=nota_s3.getText().toString();

                if (nota_s2!=null)
                {
                    try {
                        float n1=Float.parseFloat(t1);
                        float n2=Float.parseFloat(t2);
                        float n3=Float.parseFloat(t3);
                        if (n2<=5 )
                        {



                                double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                                String resul=Double.toString(cal);
                                editor.putString("resul", resul);
                                editor.commit();
                                tv_res_s.setText(resul);

                            }else
                            {
                                //toast para menores de 5
                                Toast notificacion = Toast.makeText(Sistemas.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                                notificacion.show();
                            }


                    }catch (Exception ex)
                    {
                        //toast para valores vacios
                        Toast notificacion = Toast.makeText(Sistemas.this,getResources().getString(R.string.texto_vacio),Toast.LENGTH_LONG);
                        notificacion.show();
                    }


                }

            }
        });

        nota_s3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                SharedPreferences prefe1=getSharedPreferences("Sistemas",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=prefe1.edit();
                String t1=nota_s1.getText().toString();
                String t2=nota_s2.getText().toString();
                String t3=nota_s3.getText().toString();
                editor.putString("tercer", nota_s3.getText().toString());

                if (nota_s3!=null)
                {
                    try {
                        float n1=Float.parseFloat(t1);
                        float n2=Float.parseFloat(t2);
                        float n3=Float.parseFloat(t3);
                        if (n3<=5 )
                        {



                                double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                                String resul=Double.toString(cal);
                                editor.putString("resul", resul);
                                editor.commit();
                                tv_res_s.setText(resul);

                            }else
                            {
                                //toast para menores de 5
                                Toast notificacion = Toast.makeText(Sistemas.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                                notificacion.show();
                            }

                    }catch (Exception e)
                    {
                        //toast para valores vacios
                        Toast notificacion = Toast.makeText(Sistemas.this,getResources().getString(R.string.texto_vacio),Toast.LENGTH_LONG);
                        notificacion.show();
                    }

                }


            }
        });
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
