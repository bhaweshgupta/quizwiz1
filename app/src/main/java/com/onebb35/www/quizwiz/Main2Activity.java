package com.onebb35.www.quizwiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;

    TextView score,question;

    private Questions mQuestion=new Questions();
    private String mAnswer;
    private int mScore=0;
    private int mQuestionsLength=mQuestion.mQuestion.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        r=new Random();


        answer1=(Button)findViewById(R.id.ans1);
        answer2=(Button)findViewById(R.id.ans2);
        answer3=(Button)findViewById(R.id.ans3);
        answer4=(Button)findViewById(R.id.ans4);
        score=(TextView) findViewById(R.id.score);
        question=(TextView) findViewById(R.id.question);

        score.setText("Score:"+mScore);
        updateQuestion(r.nextInt(mQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score:" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }
                else
                    gameOver();

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           if (answer2.getText() == mAnswer) {
                                               mScore++;
                                               score.setText("Score:" + mScore);
                                               updateQuestion(r.nextInt(mQuestionsLength));
                                           }
                                           else
                                               gameOver();

                                       }

                                   }
        );
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score:" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }
                else
                    gameOver();

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score:" + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }
                else
                    gameOver();

            }
        });

    }
    private void updateQuestion(int num)
    {
        question.setText(mQuestion.getQuestion(num));
        answer1.setText(mQuestion.getChoice1(num));
        answer2.setText(mQuestion.getChoice2(num));
        answer3.setText(mQuestion.getChoice3(num));
        answer4.setText(mQuestion.getChoice4(num));
        mAnswer=mQuestion.getCorrectAnswer(num);
    }
    private void gameOver()
    {
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(Main2Activity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is "+mScore+" points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }

}

