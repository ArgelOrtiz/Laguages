package com.tec.aoalanguages.Horoscope;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import com.tec.aoalanguages.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HoroscopeDetailActivity extends AppCompatActivity {
    Intent currentIntent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope_detail);

        currentIntent   = getIntent();

        initComponents();
    }

    protected void initComponents(){
        TextView animalTextView     = findViewById(R.id.animalHoroscopeDetailTextView);
        TextView contentTextView    = findViewById(R.id.contentHoroscopeDetailTextView);
        ImageView currentImageView  = findViewById(R.id.currentHoroscopeDetailImageView);

        animalTextView.setText(getString(currentIntent.getIntExtra("animal",0)));
        contentTextView.setText(currentIntent.getStringExtra("content"));

        switch (currentIntent.getIntExtra("animal",0)){
            case R.string.menu_ox:
                currentImageView.setImageResource(R.mipmap.buey);
                break;
            case R.string.menu_horse:
                currentImageView.setImageResource(R.mipmap.caballo);
                break;
            case R.string.menu_goat:
                currentImageView.setImageResource(R.mipmap.cabra);
                break;
            case R.string.menu_dragon:
                currentImageView.setImageResource(R.mipmap.dragon);
                break;
            case R.string.menu_rooster:
                currentImageView.setImageResource(R.mipmap.gallo);
                break;
            case R.string.menu_cat:
                currentImageView.setImageResource(R.mipmap.gato);
                break;
            case R.string.menu_wild_pig:
                currentImageView.setImageResource(R.mipmap.jabali);
                break;
            case R.string.menu_monkey:
                currentImageView.setImageResource(R.mipmap.mono);
                break;
            case R.string.menu_dog:
                currentImageView.setImageResource(R.mipmap.perro);
                break;
            case R.string.menu_rat:
                currentImageView.setImageResource(R.mipmap.rata);
                break;
            case R.string.menu_snake:
                currentImageView.setImageResource(R.mipmap.serpiente);
                break;
            case R.string.menu_tiger:
                currentImageView.setImageResource(R.mipmap.tigre);
                break;
            default:
                currentImageView.setImageResource(R.drawable.ic_horoscope);
                break;

        }


    }
}
