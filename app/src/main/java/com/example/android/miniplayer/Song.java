package com.example.android.miniplayer;

public class Song {

    // initiate string variables
    private String mSongName;
    private String mArtistName;


    // create a new Song constructor to take 2 imput params: song name and artist name

    public Song(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    // get the song name from the playlist
    public String getSongName() {
        return mSongName;
    }

    // get artist name from the playlist
    public String getArtisName() {
        return mArtistName;
    }


}
