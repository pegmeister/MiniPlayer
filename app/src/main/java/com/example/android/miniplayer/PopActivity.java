package com.example.android.miniplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs in pop activity
        final ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Flames", "Sia"));
        songs.add(new Song("Finesse", "Bruno Mars"));
        songs.add(new Song("Wait", "Maroon 5"));
        songs.add(new Song("Perfect", "Ed Sheeran"));
        songs.add(new Song("In My Blood", "Shawn Mendes"));
        songs.add(new Song("Viva la Vida", "Cold Play"));
        songs.add(new Song("La Isla Bonita", "Madonna"));
        songs.add(new Song("Smooth Criminal", "Michael Jackson"));

        // Create an Custom Adapter called SongAdapter to create playlist items
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_pop);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(PopActivity.this, "Song Clicked", Toast.LENGTH_SHORT).show();

                // Create a new intent to open the NowPlayingActivity
                Intent popSongIntent = new Intent(PopActivity.this, NowPlayingActivity.class);

                // Start the new NowPlayingActivity
                startActivity(popSongIntent);

            }
        });
    }
}
