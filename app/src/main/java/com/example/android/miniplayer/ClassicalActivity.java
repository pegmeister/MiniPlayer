package com.example.android.miniplayer;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs in classical activity
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Symphony No.5", "Beethoven"));
        songs.add(new Song("Canon in D Major", "Pachelbel"));
        songs.add(new Song("Piano Concerto in No.21", "Mozart"));
        songs.add(new Song("The Four Seasons", "Vivaldi"));
        songs.add(new Song("Carmen", "Bizet"));
        songs.add(new Song("Nocturne No. 2", "Chopin"));
        songs.add(new Song("The Valkyrie", "Wagner"));
        songs.add(new Song("Brandenburg Concert No.3", "Bach"));

        // Create an Custom Adapter called SongAdapter to create playlist items
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_classical);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(ClassicalActivity.this, "Start Playing", Toast.LENGTH_SHORT).show();

                // Create a new intent to open the NowPlayingActivity
                Intent classicalSongIntent = new Intent(ClassicalActivity.this, NowPlayingActivity.class);

                // Start the new ClassicalActivity
                startActivity(classicalSongIntent);
            }
        });
    }
}
