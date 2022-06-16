package com.example.gym_trainer;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class BMIresult extends AppCompatActivity {

    android.widget.Button mrecalculatebtn;
    android.widget.Button mcontinuebtn;
    TextView mbmidisplay, mbmicategory, mgender, calDisplay;
    Intent intent;
    ImageView mimageview;
    String mbmi;
    float intbmi;
    String height;
    String weight;
    float intheight, intweight, intAge ,intValue;
    RelativeLayout mbackground;
    String value ,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiresult);
//        getSupportActionBar().hide();
//
//        getSupportActionBar().setElevation(0);
//        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"white\"></font>"));
//        getSupportActionBar().setTitle("Result");
//        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#1E1D1D"));
//        getSupportActionBar().setBackgroundDrawable(colorDrawable);

        intent = getIntent();

        mbmidisplay = findViewById(R.id.bmidisplay);
        mbmicategory = findViewById(R.id.bmicategory);
        mgender = findViewById(R.id.genderdisplay);
        mbackground = findViewById(R.id.contentlayout);
        mimageview = findViewById(R.id.imageview);
        mrecalculatebtn = findViewById(R.id.recalculatebtn);
        calDisplay = findViewById(R.id.calDisplay);

        height = intent.getStringExtra("height");
        weight = intent.getStringExtra("weight");
        value = intent.getStringExtra("active");
        age = intent.getStringExtra("age");

        intheight = Float.parseFloat(height);
        intweight = Float.parseFloat(weight);
        intAge = Float.parseFloat(age);
        intValue = Float.parseFloat(value);


        float calories = 0;
        if (intent.getStringExtra("gender").equals("Male")){
            calories = (float) ((10 * intweight) + (6.25 * intheight) - (5 * intAge) + 5);
            calories = calories * intValue;
        }else if (intent.getStringExtra("gender").equals("Female")){
            calories = (float) ((10 * intweight) + (6.25 * intheight) - (5 * intAge) - 161);
            calories = calories * intValue;
        }else{
            calories = 1;
        }
        String cal;
        cal = String.valueOf(calories);
        intheight = intheight/100;
        intbmi = intweight/(intheight*intheight);

        mbmi = Float.toString(intbmi);

        if(intbmi<16)
        {
            mbmicategory.setText("Severe Thinness");
            mbackground.setBackgroundColor(Color.GRAY);
            mimageview.setImageResource(R.drawable.crosss);
        }
        else if(intbmi < 16.9 && intbmi>16)
        {
            mbmicategory.setText("Moderate Thinness");
            mbackground.setBackgroundColor(Color.WHITE);
            mimageview.setImageResource(R.drawable.wwarning);
        }
        else if(intbmi < 18.4 && intbmi>17)
        {
            mbmicategory.setText("Mild Thinness");
            mbackground.setBackgroundColor(Color.WHITE);
            mimageview.setImageResource(R.drawable.wwarning);
        }
        else if(intbmi<25 && intbmi>18.4)
        {
            mbmicategory.setText("Normal");
            mimageview.setImageResource(R.drawable.ok);
        }
        else if(intbmi<29.4 && intbmi>25)
        {
            mbmicategory.setText("Overweight");
            mbackground.setBackgroundColor(Color.WHITE);
            mimageview.setImageResource(R.drawable.wwarning);
        }
        else
        {
            mbmicategory.setText("Obese");
            mbackground.setBackgroundColor(Color.WHITE);
            mimageview.setImageResource(R.drawable.wwarning);
        }


        mgender.setText(intent.getStringExtra("gender"));
        mbmidisplay.setText(mbmi);
        calDisplay.setText(cal);






        mrecalculatebtn = findViewById(R.id.recalculatebtn);

        mrecalculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMIresult.this, BMICalculator.class);
                startActivity(intent);
                finish();
            }
        });

        mcontinuebtn = findViewById(R.id.continuebtn);
        mcontinuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMIresult.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}