package com.DAVE;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by ds on 10/11/16.
 */
public class Playlist {

    String mName;
    List<String> mSongs;

    public Playlist(String name){
        mName = name;
        ArrayList mSongs = new ArrayList()
    }

    public String getName(String name){
        return mName;
    }

    public addSong(Song song) {
        mSongs.add(song);
    }

    public playAll(){
    }

}


