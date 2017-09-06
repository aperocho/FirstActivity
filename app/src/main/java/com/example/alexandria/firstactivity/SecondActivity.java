package com.example.alexandria.firstactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    TextView ra;
    TextView fg;
    Button btn_Back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_Back = (Button) findViewById(R.id.btn_Back);
        ra = (TextView) findViewById(R.id.RA);
        fg = (TextView) findViewById(R.id.FG);

        String rg = getIntent().getExtras().getString("RA");
        ra.setText(rg);
        String fn = getIntent().getExtras().getString("FG");
        fg.setText(fn);
    }
        public void toFirstActivity(View view){

            Intent intent2 = new Intent(this, MainActivity.class);
            startActivity(intent2);


    }

}
