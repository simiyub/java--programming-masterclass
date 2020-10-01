package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Album {
    private final String name;
    private List<Song> songs;
    private final String singer;

    private Album(String name, String singer, List<Song> songs) {
        this.name = name;
        this.singer=singer;
        this.songs = songs;
    }

    public static Album newAlbum(String name, String singer, Song[] songs) {
        return new Album(name, singer, Arrays.asList(songs));
    }

    public Song song(String name) {
        Song song = null;
        for (int i = 0; i < songs.size(); i++) {
            song = songs.get(i);
            if (song.getName().equalsIgnoreCase(name)) {
                return song;
            }
        }
        return song;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getSinger() {
        return singer;
    }
}
