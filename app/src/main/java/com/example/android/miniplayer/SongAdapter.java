package com.example.android.miniplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private int mColorResourceId;

    public SongAdapter(@NonNull Context context, ArrayList<Song> songs, int colorResourceId) {
        super(context, 0, songs);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // get the current song with position id
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_text_view.
        TextView songTextView = listItemView.findViewById(R.id.song_text_view);

        // Get the song from currentSong and set it to songTextView
        songTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item layout with the ID artist_text_view.
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);

        // get the song artist from currentArtist and set it to artistTextView
        artistTextView.setText(currentSong.getArtisName());

        // Set the theme color for the corresponding category and set color to textBox View
        View textBox = listItemView.findViewById(R.id.text_box);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textBox.setBackgroundColor(color);

        // return the view
        return listItemView;
    }
}

