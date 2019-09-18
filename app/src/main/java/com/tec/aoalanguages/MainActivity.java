package com.tec.aoalanguages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import com.tec.aoalanguages.Horoscope.HoroscopeDetailActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    protected void initComponents(){
        ImageButton bueyImageButton         = findViewById(R.id.bueyMainImageButton);
        ImageButton caballoImageButton      = findViewById(R.id.caballoMainImageButton);
        ImageButton cabraImageButton        = findViewById(R.id.cabraMainImageButton);
        ImageButton dragonImageButton       = findViewById(R.id.dragonMainImageButton);
        ImageButton galloImageButton        = findViewById(R.id.galloMainImageButton);
        ImageButton gatoImageButton         = findViewById(R.id.gatoMainImageButton);
        ImageButton jabaliImageButton       = findViewById(R.id.jabaliMainImageButton);
        ImageButton monoImageButton         = findViewById(R.id.monoMainImageButton);
        ImageButton perroImageButton        = findViewById(R.id.perroMainImageButton);
        ImageButton rataImageButton         = findViewById(R.id.rataMainImageButton);
        ImageButton serpienteImageButton    = findViewById(R.id.serpienteMainImageButton);
        ImageButton tigreImageButton        = findViewById(R.id.tigreMainImageButton);

        bueyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(), HoroscopeDetailActivity.class);
                intent.putExtra("animal",R.string.menu_ox);
                intent.putExtra("content",getString(R.string.description_ox));

                startActivity(intent);
            }
        });

        caballoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal",R.string.menu_horse);
                intent.putExtra("content",getString(R.string.description_horse));
                startActivity(intent);

            }
        });

        cabraImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal",R.string.menu_goat);
                intent.putExtra("content",getString(R.string.description_goat));

                startActivity(intent);
            }
        });

        dragonImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal",R.string.menu_dragon);
                intent.putExtra("content",getString(R.string.description_dragon));

                startActivity(intent);

            }
        });

        galloImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal",R.string.menu_rooster);
                intent.putExtra("content",getString(R.string.description_rooster));

                startActivity(intent);

            }
        });

        gatoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal",R.string.menu_cat);
                intent.putExtra("content",getString(R.string.description_cat));

                startActivity(intent);

            }
        });

        jabaliImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal",R.string.menu_wild_pig);
                intent.putExtra("content",getString(R.string.description_wild_pig));

                startActivity(intent);

            }
        });

        monoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal",R.string.menu_monkey);
                intent.putExtra("content",getString(R.string.description_monkey));

                startActivity(intent);

            }
        });

        perroImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal",R.string.menu_dog);
                intent.putExtra("content",getString(R.string.description_dog));

                startActivity(intent);

            }
        });

        rataImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal",R.string.menu_rat);
                intent.putExtra("content",getString(R.string.description_rat));

                startActivity(intent);

            }
        });

        serpienteImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal",R.string.menu_snake);
                intent.putExtra("content",getString(R.string.description_snake));

                startActivity(intent);

            }
        });

        tigreImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent   = new Intent(getApplicationContext(),HoroscopeDetailActivity.class);
                intent.putExtra("animal",R.string.menu_tiger);
                intent.putExtra("content",getString(R.string.description_tiger));

                startActivity(intent);
            }
        });


    }
}
