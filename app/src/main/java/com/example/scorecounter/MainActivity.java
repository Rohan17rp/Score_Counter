package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_red, score_blue;
    TextView red, blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red = findViewById(R.id.score_red);
        blue = findViewById(R.id.score_blue);
        setview();
    }
    public void setview(){
        red.setText(Integer.toString(score_red));
        blue.setText(Integer.toString(score_blue));
    }

    public void buttons(View plus){
        switch (plus.getId()){
            case R.id.increment_red:
                score_red++;
                break;
            case R.id.increment_blue:
                score_blue++;
                break;
            case R.id.decrement_red:
                score_red--;
                break;
            case R.id.decrement_blue:
                score_blue--;
                break;
            case R.id.reset:
                score_blue = 0;
                score_red = 0;
                break;
        }
        setview();
    }
}
