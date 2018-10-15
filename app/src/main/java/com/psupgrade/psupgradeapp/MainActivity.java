package com.psupgrade.psupgradeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMudar;
        buttonMudar = (Button) findViewById(R.id.buttonMudar);

        final ImageView layers = (ImageView) findViewById(R.id.layers);

        final ImageView distort = (ImageView) findViewById(R.id.distort);

        final int [] cardArray = {
                R.drawable.selecao,
                R.drawable.efeitos,
                R.drawable.layers,
                R.drawable.distort,
        };

        buttonMudar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("PsUpgrade", "Ça marche!");

                Random randomNumberGenerator =  new Random ();

                int number = randomNumberGenerator.nextInt(4);

                Log.d("PsUpgrade", "The random number is:" + number);

                layers.setImageResource(cardArray[number]);

                number = randomNumberGenerator.nextInt(4);

                distort.setImageResource(cardArray[number]);
            }
        });

    }
}
