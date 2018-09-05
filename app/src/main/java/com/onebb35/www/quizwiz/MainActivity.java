package com.onebb35.www.quizwiz;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RelativeLayout mylayout;
    AnimationDrawable animationDrawable;
    public void Next(View view)
    {   String name;
        EditText editText=(EditText)findViewById(R.id.editText);
        Toast.makeText(this,"Enjoy "+editText.getText().toString() , Toast.LENGTH_LONG).show();
        ImageView img=(ImageView)findViewById(R.id.imageView);
        img.setImageResource(R.drawable.real1);
        // VideoView videoView=(VideoView)findViewById(R.id.videoView);
        if (editText != null && editText.getText().length() != 0){
            name = editText.getText().toString();
        }
        else
            name="guest";


        Intent intObj = new Intent(MainActivity.this,greetings.class);
        intObj.putExtra("USERNAME",name);
        startActivity(intObj);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylayout=(RelativeLayout) findViewById(R.id.myLayout);
        animationDrawable=(AnimationDrawable)mylayout.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();
    }
}
