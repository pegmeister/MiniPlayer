package com.example.android.miniplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    public static final String KEY_SONG_ROCK = "KEY_SONG_ROCK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs in rock activity
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Whatever It Takes", "Imagine Dragon"));
        songs.add(new Song("Believer", "Imagine Dragon"));
        songs.add(new Song("New light", "John Mayer"));
        songs.add(new Song("We Will Rock You", "Queen"));
        songs.add(new Song("Sit", "Foster the People"));
        songs.add(new Song("I'll Be There For You", "Bon Jovi"));
        songs.add(new Song("Complicated", "Avril Lavigne"));
        songs.add(new Song("I Don't Want To Miss A Thing", "Aerosmith"));

        // Create an Custom Adapter called SongAdapter to create playlist items
        final SongAdapter adapter = new SongAdapter(this, songs, R.color.category_rock);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(RockActivity.this, "Song Clicked", Toast.LENGTH_SHORT).show();

                // when user click song from list, song title is sent to NowPlayingActivity
                Song item = adapter.getItem(position);

                // Create a new intent to open the NowPlayingActivity
                Intent rockSongIntent = new Intent(RockActivity.this, NowPlayingActivity.class);
                rockSongIntent.putExtra(KEY_SONG_ROCK, item.getSongName());


                // Start the new RockActivity
                startActivity(rockSongIntent);
            }
        });
    }
}
