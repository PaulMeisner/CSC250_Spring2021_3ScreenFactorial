package com.example.csc250_spring2021_3screenfactorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.BreakIterator;

public class Screen2 extends AppCompatActivity {
    private String name;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        this.answerTV = this.findViewById(R.id.answerTV);
        this.name = this.getIntent().getStringExtra("num");
        String currValue = this.name;
        int num = Integer.parseInt(currValue);

        this.answerTV.setText(String.valueOf(fact(num)));

    }

    private long fact(long num)
    {

        if(num <= 1)
            return 1;
        else {

            return num * fact(num - 1);
        }

    }

    public void onFactorialButtonClicked(View v)
    {

        //launch the next screen
        Intent i = new Intent(this, Screen3.class);
        i.putExtra("num", this.answerTV.getText().toString());
        this.startActivity(i);

    }

    @Override
    protected void onPause()
    {
        super.onPause();

    }

    @Override
    protected void onStop()
    {
        super.onStop();
        TextView nameTV = this.findViewById(R.id.answerTV);
        nameTV.setText("WOOT");
    }
}