package com.DAVE;

/**
 * Created by ds on 10/11/16.
 */
public class Song {
    String mSongName;
    String mArtistName;
    String mAlbumName;

    public Song (String songName, String artistName, String albumName){
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public void play(){
        System.out.println(mSongName);
        System.out.println(mAlbumName);
        System.out.println(mArtistName);
    }

}
