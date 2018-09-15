package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    protected ImageView ballDisplay;

    private Random rnd = new Random();

    protected int[] ballArray = new int[]{R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    protected Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        myButton = (Button) findViewById(R.id.askButton);

        updateBall();

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateBall();
            }
        });


    }

    protected void updateBall() {
        int randomBallMessageIndex = rnd.nextInt(5);

        ballDisplay.setImageResource(ballArray[randomBallMessageIndex]);
    }
}
