package com.example.gym_trainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;




public class home_page extends AppCompatActivity {
    ImageView imagebutton2;
    ImageView imagebutton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        imagebutton2=(ImageView) findViewById(R.id.imagebutton2);
        imagebutton4=(ImageView) findViewById(R.id.imagebutton4);

        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(home_page.this, workout.class);
                startActivity(i);
            }
        });
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(home_page.this, backlunges.class);
                startActivity(i);
            }
        });
    }
}