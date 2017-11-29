package com.teamenigma.rockpaperscissorsp2p;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // rock button onclick goes to gameOver() just for testing purposes
        findViewById(R.id.btnRock).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), GameOver.class);
            startActivity(i);
            }
        });

    }

    // finish this intent and start GameOver.class
    public void gameOver() {
        Intent i = new Intent(getApplicationContext(), GameOver.class);
        startActivity(i);
    }

}
