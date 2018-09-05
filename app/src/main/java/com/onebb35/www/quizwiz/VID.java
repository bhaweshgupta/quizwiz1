package com.onebb35.www.quizwiz;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class VID extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vid);
        TextView serve1=(TextView)findViewById(R.id.serve1);
        serve1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aqNPdY2sxoc")));
            }
        });
        TextView serve2=(TextView)findViewById(R.id.serve2);
        serve2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=uhpzKrRmz0c")));
            }
        });
        TextView serve3=(TextView)findViewById(R.id.serve3);
        serve3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jvoFaiygaOU")));
            }
        });
        TextView serve4=(TextView)findViewById(R.id.serve4);
        serve4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=knbT7nv5k1c")));
            }
        });
        TextView serve5=(TextView)findViewById(R.id.serve5);
        serve5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=_mdUdyz-yy0")));
            }
        });
        TextView serve6=(TextView)findViewById(R.id.serve6);
        serve6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=yWVrolNQ4RU")));
            }
        });
        TextView serve7=(TextView)findViewById(R.id.serve7);
        serve7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oWoqIzzzJR8")));
            }
        });
        TextView serve8=(TextView)findViewById(R.id.serve8);
        serve8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLaI5lCKwq3Idh1ZaWKMTQD1lJPE9-rahv")));
            }
        });
    }

}
