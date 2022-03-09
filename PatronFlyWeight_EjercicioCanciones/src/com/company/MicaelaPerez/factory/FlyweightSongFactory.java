package com.company.MicaelaPerez.factory;
import com.company.MicaelaPerez.models.Song;
import java.util.HashMap;

public class FlyweightSongFactory {
    private static HashMap<String, Song> songHashMap = new HashMap<>();

    public static Song getSong(String name){
        Song song = songHashMap.get(name);
        if (song == null){
            song = new Song(name);
            songHashMap.put(name,song);
            System.out.println("Create a new song call " + name);
            return song;
        }
        System.out.println("This song already exist");
        return song;
    }

    public static HashMap<String,Song> getSongHashMap(){
        return songHashMap;
    }

}
