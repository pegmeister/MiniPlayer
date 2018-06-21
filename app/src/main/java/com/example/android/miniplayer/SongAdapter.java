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

    // Create ViewHolder class to improve scrolling performance
    static class ViewHolderItem{
        TextView mySong;
        TextView myArtist;
    }

    private int mColorResourceId;

    public SongAdapter(@NonNull Context context, ArrayList<Song> songs, int colorResourceId) {
        super(context, 0, songs);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolderItem viewHolder;

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        // If listItemView is null, inflate it from list_item
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            // Setup the ViewHolder
            viewHolder = new ViewHolderItem();

            // Find the TextView in the list_item.xml layout with the ID song_text_view.
            viewHolder.mySong = listItemView.findViewById(R.id.song_text_view);

            // Find the TextView in the list_item layout with the ID artist_text_view.
            viewHolder.myArtist = listItemView.findViewById(R.id.artist_text_view);

            // Store the holder with the view
            listItemView.setTag(viewHolder);

            }else{
            // avoid frequent calling of findViewByID(), just use viewHolder
            viewHolder = (ViewHolderItem)listItemView.getTag();
        }

        // get the current song with position id
        Song currentSong = getItem(position);

        if(currentSong != null){
           // Get the song from currentSong and set it to songTextView
            viewHolder.mySong.setText(currentSong.getSongName());

            // get the song artist from currentArtist and set it to artistTextView
            viewHolder.myArtist.setText(currentSong.getArtisName());
        }

        // Set the theme color for the corresponding category and set color to textBox View
        View textBox = listItemView.findViewById(R.id.text_box);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textBox.setBackgroundColor(color);

        // return the view
        return listItemView;
    }
}

