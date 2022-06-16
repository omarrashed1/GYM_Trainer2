package com.example.gym_trainer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imagebutton2;
    ImageView imagebutton4;
    ImageView imagebutton5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().hide();

        imagebutton2 = (ImageView) findViewById(R.id.imagebutton2);
        imagebutton4 = (ImageView) findViewById(R.id.imagebutton4);
        imagebutton5 = (ImageView) findViewById(R.id.imagebutton5);

        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,workout.class);
                startActivity(i);
            }
        });
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,backlunges.class);
                startActivity(i);
            }
        });
        imagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,frog.class);
                startActivity(i);
            }
        });



    }
}