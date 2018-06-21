package com.example.android.miniplayer;

public class Song {

    // initiate string variables
    private String song;
    private String artist;


    // create a new Song constructor to take 2 input params: song name and artist name

    public Song(String songName, String artistName) {
        song = songName;
        artist = artistName;
    }

    // get the song name from the playlist
    public String getSongName() {
        return song;
    }

    // get artist name from the playlist
    public String getArtisName() {
        return artist;
    }


}
