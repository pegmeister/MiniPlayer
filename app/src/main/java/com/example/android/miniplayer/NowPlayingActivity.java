package com.example.android.miniplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import static com.example.android.miniplayer.PopActivity.KEY_SONG;
import static com.example.android.miniplayer.RockActivity.KEY_SONG_ROCK;
import static com.example.android.miniplayer.ClassicalActivity.KEY_SONG_CLASSICAL;
import static com.example.android.miniplayer.MyLibraryActivity.KEY_SONG_LIBRARY;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_now_playing);

        // method for displaying PopSongTitle
        String playingSong = "";

        Intent intent = getIntent();
        if (null != intent) {
            playingSong = intent.getStringExtra(KEY_SONG);
        }

        TextView playingSongText = findViewById(R.id.play);
        playingSongText.setText(playingSong);

        // method for displaying RockSongTitle
        String playingSongRock = "";

        Intent intentRock = getIntent();
        if (null != intentRock) {
            playingSongRock = intent.getStringExtra(KEY_SONG_ROCK);
        }

        TextView playingRockSongText = findViewById(R.id.play);
        playingRockSongText.setText(playingSongRock);

        // method for displaying ClassicalSongTitle
        String playingSongClassical = "";

        Intent intentClassical = getIntent();
        if (null != intentClassical) {
            playingSongClassical = intent.getStringExtra(KEY_SONG_CLASSICAL);
        }

        TextView playingClassicalSongText = findViewById(R.id.play);
        playingClassicalSongText.setText(playingSongClassical);

        // method for displaying LibrarySongTitle
        String playingSongLibrary = "";

        Intent intentLibrary = getIntent();
        if (null != intentLibrary) {
            playingSongLibrary = intent.getStringExtra(KEY_SONG_LIBRARY);
        }

        TextView playingLibrarySongText = findViewById(R.id.play);
        playingLibrarySongText.setText(playingSongLibrary);

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
