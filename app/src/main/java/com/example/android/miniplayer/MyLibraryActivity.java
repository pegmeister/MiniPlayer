package com.example.android.miniplayer;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs in My Library activity
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Fallin", "Alicia Keys"));
        songs.add(new Song("Yesterday", "The Beatles"));
        songs.add(new Song("24K Magic", "Bruno Mars"));
        songs.add(new Song("Delicate", "Taylor Swift"));
        songs.add(new Song("Sunny", "Boney M"));
        songs.add(new Song("Pray For Me", "The Weeknd"));
        songs.add(new Song("Thriller", "Michael Jackson"));
        songs.add(new Song("Faith", "George Michael"));

        // Create an Custom Adapter called SongAdapter, to create playlist items
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_library);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MyLibraryActivity.this, "Song Clicked", Toast.LENGTH_SHORT).show();

                // Create a new intent to open the NowPlayingActivity
                Intent librarySongIntent = new Intent(MyLibraryActivity.this, NowPlayingActivity.class);

                // Start the new LibraryActivity
                startActivity(librarySongIntent);
            }
        });
    }
}
