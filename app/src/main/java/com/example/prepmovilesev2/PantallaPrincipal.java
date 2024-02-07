package com.example.prepmovilesev2;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PantallaPrincipal extends AppCompatActivity {

//    int contFavsSevilla = 0;
//    int contFavsTenerife = 0;
//    int contFavsMadrid = 0;
//    int contFavsBilbao = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        //imagenes, comentarios, array

//        try{
//
//        Intent intent = getIntent();
//        Bundle bundle = intent.getExtras();
//        String CiudadNombreSumar = bundle.getString("CiudadNombreSumar");
//
//        if(CiudadNombreSumar.equals("Sevilla")){
//            contFavsSevilla++;
//        }
//        else if(CiudadNombreSumar.equals("Tenerife")){
//            contFavsTenerife++;
//        }
//        else if(CiudadNombreSumar.equals("Madrid")){
//            contFavsMadrid++;
//        }
//        else if(CiudadNombreSumar.equals("Bilbao")){
//            contFavsBilbao++;
//        }
//
//        }catch (Exception e){
//            Log.v(TAG, "no volvio con fav");
//        }


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        ArrayList<Integer> listaFavs7 = bundle.getIntegerArrayList("listaFavs7");





        TextView textViewFavsS =findViewById(R.id.textViewFavsS);
        textViewFavsS.setText("Cantidad favoritos: "+listaFavs7.get(0));

        TextView textViewFavsT =findViewById(R.id.textViewFavsT);
        textViewFavsT.setText("Cantidad favoritos: "+listaFavs7.get(1));

        TextView textViewFavsM =findViewById(R.id.textViewFavsM);
        textViewFavsM.setText("Cantidad favoritos: "+listaFavs7.get(2));

        TextView textViewFavsB =findViewById(R.id.textViewFavsB);
        textViewFavsB.setText("Cantidad favoritos: "+listaFavs7.get(3));





        ImageView imageSevilla =findViewById(R.id.imageViewSevilla);
        ImageView imageTenerife =findViewById(R.id.imageViewTenerife);
        ImageView imageMadrid =findViewById(R.id.imageViewMadrid);
        ImageView imageBilbao =findViewById(R.id.imageViewBilbao);

        Intent Pagina3 = new Intent(this, PantallaLugar.class);

        //al clickar en la imagen lleva a la siguiente pagina con una variable de el nombre de la ciudad seleccionada


        imageSevilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle = new Bundle();
                bundle.putString("nombreCiudad", "Sevilla");
                bundle.putIntegerArrayList("listaFavs7",listaFavs7);
                Pagina3.putExtras(bundle);

                startActivity(Pagina3);

            }
        });

        imageTenerife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("nombreCiudad", "Tenerife");
                bundle.putIntegerArrayList("listaFavs7",listaFavs7);
                Pagina3.putExtras(bundle);

                startActivity(Pagina3);

            }
        });

        imageMadrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("nombreCiudad", "Madrid");
                bundle.putIntegerArrayList("listaFavs7",listaFavs7);
                Pagina3.putExtras(bundle);

                startActivity(Pagina3);

            }
        });

        imageBilbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("nombreCiudad", "Bilbao");
                bundle.putIntegerArrayList("listaFavs7",listaFavs7);
                Pagina3.putExtras(bundle);

                startActivity(Pagina3);

            }
        });


    }
}