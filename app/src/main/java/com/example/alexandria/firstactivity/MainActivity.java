package com.example.alexandria.firstactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText quiz_1;
    EditText quiz_2;
    EditText seat_works;
    EditText lab_exercises;
    EditText major_exams;

    Double ra;
    Double fg;
    Button btn_Compute;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quiz_1 = (EditText) findViewById(R.id.quiz1);
        quiz_2 = (EditText) findViewById(R.id.quiz2);
        seat_works = (EditText) findViewById(R.id.seatworks);
        lab_exercises = (EditText) findViewById(R.id.labexercises);
        major_exams = (EditText) findViewById(R.id.majorexams);

    }

    public void callSecondActivity (View view) {
        Double quiz1Score = Double.parseDouble(quiz_1.getText().toString());
        Double quiz2Score = Double.parseDouble(quiz_2.getText().toString());
        Double seatScore = Double.parseDouble(seat_works.getText().toString());
        Double labScore = Double.parseDouble(lab_exercises.getText().toString());
        Double majorScore = Double.parseDouble(major_exams.getText().toString());

        ra = (quiz1Score * .1) + (quiz2Score * .1) + (seatScore * .1) + (labScore * .4) + (majorScore * .3);

        String fg = new String();
        if(ra<60) {
            fg = "FAILED";
        }else if (ra<=65){
            fg = "3.00";
        }else if (ra<=70){
            fg = "2.75";
        }else if (ra<=75){
            fg = "2.50";
        }else if (ra<=80){
            fg = "2.00";
        }else if (ra<= 85){
            fg = "1.75";
        }else if (ra<=90){
            fg = "1.50";
        }else if (ra<=95){
            fg = "1.25";
        }else if(ra<=100){
            fg = "1.00";
        }

         Intent intent = new Intent(this, SecondActivity.class);
         intent.putExtra("raGrade", ra.toString());
         intent.putExtra("fgGrade", fg.toString());
         startActivity(intent);





    }
}
