package com.example.gym_trainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class exe extends AppCompatActivity {
    ImageView beginner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exe);
        beginner = (ImageView) findViewById(R.id.beginner);

        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(exe.this, frog.class);
                startActivity(i);
            }
        });
    }
}