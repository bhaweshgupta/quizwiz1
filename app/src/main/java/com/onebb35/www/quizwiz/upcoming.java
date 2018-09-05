package com.onebb35.www.quizwiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class upcoming extends AppCompatActivity {

    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming);

        ListView listView=(ListView)findViewById(R.id.LIST1);
        final ArrayList<String> team=new ArrayList<String>();
        team.add("Real Madrid Vs Sevialla");
        team.add("Corinthians Vs Malaga");
        team.add("Barcelona Vs Valencia");
        team.add("Juventus Vs Crotona");
        team.add("Real Madrid Vs PSG");
        team.add("Avai Vs Atletico PR");
        team.add("Real Betis Vs Girona");
        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,team);
        listView.setAdapter(arrayAdapter);
    }

}
