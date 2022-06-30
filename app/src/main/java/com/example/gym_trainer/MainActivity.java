package com.example.gym_trainer;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ImageView imagebutton2;
    ImageView imagebutton4;
    ImageView imagebutton5;
    BottomNavigationView navMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().hide();

        imagebutton2 = (ImageView) findViewById(R.id.imagebutton2);
        imagebutton4 = (ImageView) findViewById(R.id.imagebutton4);
        imagebutton5 = (ImageView) findViewById(R.id.imagebutton5);
        navMenu = findViewById(R.id.bottomNavigationView);
        navMenu.setSelectedItemId(R.id.bottomNavigationView);
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,workout.class);
                startActivity(i);
            }
        });



        navMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    finish();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }else if (item.getItemId() == R.id.home2) {
                    finish();
                    Intent intent = new Intent(getApplicationContext(), BMICalculator.class);
                    startActivity(intent);
                }else if (item.getItemId() == R.id.exe) {
                    finish();
                    Intent intent = new Intent(getApplicationContext(), exe.class);
                    startActivity(intent);
                }
                return false;
            }
        });

    }
}