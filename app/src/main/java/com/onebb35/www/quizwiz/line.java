package com.onebb35.www.quizwiz;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class line extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        ImageView image=new ImageView(this);
        if(view.getId()==R.id.b1){
            image.setImageResource(R.drawable.rmrbline);
        }
        else if(view.getId()==R.id.b2){
            image.setImageResource(R.drawable.ponteatlepr);
        }
        else if(view.getId()==R.id.b3){
            image.setImageResource(R.drawable.rmmalagaline);
        }
        else if(view.getId()==R.id.b4){
            image.setImageResource(R.drawable.rmmcline);
        }
        else {
            image.setImageResource(R.drawable.valebarca);
        }
        AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
        alertDialog.setView(image);
        AlertDialog ad=alertDialog.create();
        ad.show();

    }
}