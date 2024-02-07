package com.example.prepmovilesev2;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;



public class InfoMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_menu);

        ImageView arrowChangeRight = findViewById(R.id.arrowInfoRight);
        ImageView arrowChangeLeft = findViewById(R.id.arrowInfoLeft);
        //boton que abre el siguiente fragment con la informacion correspondiente
        arrowChangeRight.setOnClickListener(v -> {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            Fragment fragment = fragmentManager.findFragmentById(R.id.idFragmentMap);

            Fragment nuevoFragment = null;
            if (fragment instanceof InfoFragment1) {
                nuevoFragment = new InfoFragment2b();
            } else if (fragment instanceof InfoFragment2b) {
                nuevoFragment = new InfoFragment3();
            } else if (fragment instanceof InfoFragment3) {
                nuevoFragment = new InfoFragment1();
            }

            assert nuevoFragment != null;
            fragmentTransaction.replace(R.id.idFragmentMap, nuevoFragment);
            fragmentTransaction.commit();
        });

        //boton que abre el siguiente fragment con la informacion correspondiente

        arrowChangeLeft.setOnClickListener(v -> {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            Fragment fragment = fragmentManager.findFragmentById(R.id.idFragmentMap);

            Fragment nuevoFragment = null;
            if (fragment instanceof InfoFragment3) {
                nuevoFragment = new InfoFragment2b();
            } else if (fragment instanceof InfoFragment2b) {
                nuevoFragment = new InfoFragment1();
            } else if (fragment instanceof InfoFragment1) {
                nuevoFragment = new InfoFragment3();
            }

            assert nuevoFragment != null;
            fragmentTransaction.replace(R.id.idFragmentMap, nuevoFragment);
            fragmentTransaction.commit();
        });

    }
}