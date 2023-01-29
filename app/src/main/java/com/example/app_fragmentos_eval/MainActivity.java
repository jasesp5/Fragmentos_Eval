package com.example.app_fragmentos_eval;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton imagenSum;
    ImageButton imagen2;
    ImageButton imagen3;
    ImageButton imagen4;
    ImageButton imageButton5;
    TextView texto;

    Button button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        imagenSum = findViewById(R.id.imageButton3);
        imagen2 = findViewById(R.id.imageButton4);
        imagen3 = findViewById(R.id.imageButton5);
        imagen4 = findViewById(R.id.imageButton6);
        imageButton5 = findViewById(R.id.imageButton7);
        texto = findViewById(R.id.textView);
        button = findViewById(R.id.button);


        imagenSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager FM = getSupportFragmentManager();
                FragmentTransaction FT = FM.beginTransaction();
                FragmentSun fragment = new FragmentSun();
                FT.add(R.id.contenedor,fragment);
                FT.commit();
                imagenSum.setVisibility(View.INVISIBLE);
                imagen2.setVisibility(View.INVISIBLE);
                imagen3.setVisibility(View.INVISIBLE);
                imagen4.setVisibility(View.INVISIBLE);
                texto.setVisibility(View.INVISIBLE);
                imageButton5.setVisibility(View.INVISIBLE);
                button.setVisibility(View.VISIBLE);

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagenSum.setVisibility(View.VISIBLE);
                imagen2.setVisibility(View.VISIBLE);
                imagen3.setVisibility(View.VISIBLE);
                imagen4.setVisibility(View.VISIBLE);
                texto.setVisibility(View.VISIBLE);
                imageButton5.setVisibility(View.VISIBLE);
                FragmentManager FM = getSupportFragmentManager();
                FragmentTransaction FT = FM.beginTransaction();
                FragmentoVacio fragmentoVacio = new FragmentoVacio();
                FT.replace(R.id.contenedor,fragmentoVacio);
                FT.commit();
                button.setVisibility(View.INVISIBLE);

            }
        });
        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager FM = getSupportFragmentManager();
                FragmentTransaction FT = FM.beginTransaction();
                FrahmentColdshoer fragment = new FrahmentColdshoer();
                FT.add(R.id.contenedor,fragment);
                FT.commit();
                imagenSum.setVisibility(View.INVISIBLE);
                imagen2.setVisibility(View.INVISIBLE);
                imagen3.setVisibility(View.INVISIBLE);
                imagen4.setVisibility(View.INVISIBLE);
                texto.setVisibility(View.INVISIBLE);
                imageButton5.setVisibility(View.INVISIBLE);
                button.setVisibility(View.VISIBLE);

            }
        });
        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager FM = getSupportFragmentManager();
                FragmentTransaction FT = FM.beginTransaction();
                FragmentExercise fragment = new FragmentExercise();
                FT.add(R.id.contenedor,fragment);
                FT.commit();
                imagenSum.setVisibility(View.INVISIBLE);
                imagen2.setVisibility(View.INVISIBLE);
                imagen3.setVisibility(View.INVISIBLE);
                imagen4.setVisibility(View.INVISIBLE);
                texto.setVisibility(View.INVISIBLE);
                imageButton5.setVisibility(View.INVISIBLE);
                button.setVisibility(View.VISIBLE);

            }
        });
        imagen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager FM = getSupportFragmentManager();
                FragmentTransaction FT = FM.beginTransaction();
                FragmentCoffe fragment = new FragmentCoffe();
                FT.add(R.id.contenedor,fragment);
                FT.commit();
                imagenSum.setVisibility(View.INVISIBLE);
                imagen2.setVisibility(View.INVISIBLE);
                imagen3.setVisibility(View.INVISIBLE);
                imagen4.setVisibility(View.INVISIBLE);
                texto.setVisibility(View.INVISIBLE);
                imageButton5.setVisibility(View.INVISIBLE);
                button.setVisibility(View.VISIBLE);

            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager FM = getSupportFragmentManager();
                FragmentTransaction FT = FM.beginTransaction();
                FragmentMeditation fragment = new FragmentMeditation();
                FT.add(R.id.contenedor,fragment);
                FT.commit();
                imagenSum.setVisibility(View.INVISIBLE);
                imagen2.setVisibility(View.INVISIBLE);
                imagen3.setVisibility(View.INVISIBLE);
                imagen4.setVisibility(View.INVISIBLE);
                texto.setVisibility(View.INVISIBLE);
                imageButton5.setVisibility(View.INVISIBLE);
                button.setVisibility(View.VISIBLE);

            }
        });
    }
}