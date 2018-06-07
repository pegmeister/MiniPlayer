package com.example.android.miniplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_now_playing);

        // set onClickListener to Pause music when user clicks pause button
        ImageView musicPause = findViewById(R.id.pause);
        musicPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlayingActivity.this, "Pause Music", Toast.LENGTH_SHORT).show();
            }
        });

        // set onClickListener to Play music when user clicks play button
        ImageView musicPlay = findViewById(R.id.np1);
        musicPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlayingActivity.this, "Play Music", Toast.LENGTH_SHORT).show();
            }
        });

        // set onClickListener to Stop music when user clicks stop button
        ImageView musicStop = findViewById(R.id.stop);
        musicStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlayingActivity.this, "Stop Music", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
