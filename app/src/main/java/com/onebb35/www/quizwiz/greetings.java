package com.onebb35.www.quizwiz;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class greetings extends AppCompatActivity {

    public void upcoming(View view){
        String name="Upcoming Matches";
        Intent intObj = new Intent(greetings.this,upcoming.class);
        intObj.putExtra("USERNAME",name);
        startActivity(intObj);
    }
    public void lineup(View view){
        Intent intObj = new Intent(greetings.this,line.class);
        startActivity(intObj);
    }
    public void quiz(View view){

        Intent intObj = new Intent(greetings.this,Main2Activity.class);
        startActivity(intObj);
    }
    public void news(View view){
        Intent intObj = new Intent(greetings.this,NEWS.class);
        startActivity(intObj);
    }
    public void Video(View view){
        Intent intObj = new Intent(greetings.this,VID.class);
        startActivity(intObj);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);
        TextView greetMsg = (TextView) findViewById(R.id.textview1);
        Intent intename = getIntent();
        String uname = (String) intename.getSerializableExtra("USERNAME");
        greetMsg.setText("Welcome " + uname);
    }
}
