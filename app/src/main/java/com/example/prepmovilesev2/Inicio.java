package com.example.prepmovilesev2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView IV =findViewById(R.id.imageView);
        Button infoPageButton = findViewById(R.id.buttonInfoPageGo);
        Button pageMapaRealButton = findViewById(R.id.buttonPageMapaRealGo);

        Intent Pagina2 = new Intent(this, PantallaPrincipal.class);
        Intent infoPage = new Intent(this, InfoMenu.class);
        Intent PageMapaReal = new Intent(this, ActivityPageMapaReal.class);

        ArrayList<Integer> listaFavs7= new ArrayList<Integer>();
        listaFavs7.add(0);
        listaFavs7.add(0);
        listaFavs7.add(0);
        listaFavs7.add(0);

        IV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //este boton lleba al menu principal

                Bundle bundle = new Bundle();
                bundle.putIntegerArrayList("listaFavs7",listaFavs7);
                Pagina2.putExtras(bundle);

                startActivity(Pagina2);

            }
        });




        infoPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(infoPage);
            }
        });


        pageMapaRealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                startActivity(PageMapaReal);
            }
        });


    }
}