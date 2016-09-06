package com.example.lloyd.crystalize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class questions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    public void onHindClick(View view){

        Toast toasty = Toast.makeText(getApplication(), getString(R.string.H1), Toast.LENGTH_SHORT);
        toasty.show();

    }

    public void onAnswerClick(View view){

        String answer = ((EditText)findViewById(R.id.answer)).getText().toString();
        answer = answer.toLowerCase();
        String correctanswer = getString(R.string.A1);

        if (answer.equals(correctanswer)){

            Toast toasty = Toast.makeText(getApplicationContext(), "Correct Answer!", Toast.LENGTH_SHORT);
            toasty.show();


        }else{

            Toast toasty = Toast.makeText(getApplicationContext(), "Incorrect Answere!", Toast.LENGTH_SHORT);
            toasty.show();
        }
    }
}
