package com.example.prepmovilesev2;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PantallaLugar extends AppCompatActivity {

    String ciudadRecivida;
    TextView textViewLugar;
    TextView textViewDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_lugar);

        textViewLugar =findViewById(R.id.textViewLugar);
        //img
        textViewDescripcion =findViewById(R.id.textViewDescripcion);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        ciudadRecivida = bundle.getString("nombreCiudad");
        ArrayList<Integer> listaFavs7 = bundle.getIntegerArrayList("listaFavs7");

        Button buttonVolver =findViewById(R.id.buttonVolver);
        Button buttonVolverFavs =findViewById(R.id.buttonVolverFavs);

        ImageView imageViewS =findViewById(R.id.imageViewS);
        imageViewS.setVisibility(View.INVISIBLE);

        ImageView imageViewT =findViewById(R.id.imageViewT);
        imageViewT.setVisibility(View.INVISIBLE);

        ImageView imageViewM =findViewById(R.id.imageViewM);
        imageViewM.setVisibility(View.INVISIBLE);

        ImageView imageViewB =findViewById(R.id.imageViewB);
        imageViewB.setVisibility(View.INVISIBLE);




        Intent Pagina2 = new Intent(this, PantallaPrincipal.class);


        //se modifica el texto o imagen en vase a la variable obtenida de la ciudad
        if(ciudadRecivida.equals("Sevilla")){
            textViewLugar.setText("Sevilla");
            imageViewS.setVisibility(View.VISIBLE);
            textViewDescripcion.setText("Sevilla es un municipio y una ciudad de España, capital de la provincia homónima y de Andalucía");

        }
        else if(ciudadRecivida.equals("Tenerife")){
            Log.v(TAG, "tennnnnerrrRRr");
            textViewLugar.setText("Tenerife");
            imageViewT.setVisibility(View.VISIBLE);
            textViewDescripcion.setText("Tenerife es la más grande de las islas Canarias de España, frente a África Occidental. La domina el monte Teide, un volcán inactivo que es la cima más alta de España");

        }
        else if(ciudadRecivida.equals("Madrid")){
            textViewLugar.setText("Madrid");
            imageViewM.setVisibility(View.VISIBLE);
            textViewDescripcion.setText("Madrid es un municipio y una ciudad de España. La localidad, con categoría histórica de villa,  es la capital del Estado y de la Comunidad de Madrid");

        }
        else if(ciudadRecivida.equals("Bilbao")){
            textViewLugar.setText("Bilbao");
            imageViewB.setVisibility(View.VISIBLE);
            textViewDescripcion.setText("Bilbao  es un municipio situado en el norte de España y una villa de dicho municipio, capital de la provincia y territorio histórico de Vizcaya, en la comunidad autónoma del País Vasco.");

        }


        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putIntegerArrayList("listaFavs7",listaFavs7);
                Pagina2.putExtras(bundle);

                startActivity(Pagina2);


            }
        });


//se vuelve a la pagina anterior pero con una variable para poner el favorito
        buttonVolverFavs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ciudadRecivida.equals("Sevilla")){
                    listaFavs7.set(0,listaFavs7.get(0)+1);
                }
                else if(ciudadRecivida.equals("Tenerife")){
                    listaFavs7.set(1,listaFavs7.get(1)+1);
                }
                else if(ciudadRecivida.equals("Madrid")){
                    listaFavs7.set(2,listaFavs7.get(2)+1);
                }
                else if(ciudadRecivida.equals("Bilbao")){
                    listaFavs7.set(3,listaFavs7.get(3)+1);
                }


                Bundle bundle = new Bundle();
                bundle.putIntegerArrayList("listaFavs7",listaFavs7);
                Pagina2.putExtras(bundle);

                startActivity(Pagina2);

            }
        });











    }
}