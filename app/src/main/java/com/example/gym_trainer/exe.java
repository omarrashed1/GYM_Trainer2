package com.example.gym_trainer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class exe extends AppCompatActivity {
    ImageView beginner;
    BottomNavigationView navMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe);
        beginner = (ImageView) findViewById(R.id.beginner);
        navMenu = findViewById(R.id.bottomNavigationView);
        navMenu.setSelectedItemId(R.id.bottomNavigationView);

        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(exe.this, beginner.class);
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
                }
                return false;
            }
        });

    }
}