import data.Album;
import data.Song;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class MusicPlayer {

    /**
     *     Create a program that implements a playlist for songs
     *      Create a Song class having Title and Duration for a song.
     *      The program will have an Album class containing a list of songs.
     *      The albums will be stored in an ArrayList
     *      Songs from different albums can be added to the playlist and will appear in the list in the order
     *      they are added.
     *      Once the songs have been added to the playlist, create a menu of options to:-
     *      Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
     *      List the songs in the playlist
     *      A song must exist in an album before it can be added to the playlist (so you can only play songs that
     *      you own).
     *      Hint:  To replay a song, consider what happened when we went back and forth from a city before we
     *      started tracking the direction we were going.
     *      As an optional extra, provide an option to remove the current song from the playlist
     *      (hint: listiterator.remove()
     *
     *      ***** Bug: Fix back and forward so they don't try to play a song when there's no more songs at the end of the playlist.
     *      ***** Features:
     *              Check song is in an album before adding.
     *              Add and remove songs to playlist
     *              Shuffle songs
     *              Play random songs
     * */

    LinkedList<Song> playList;
    Scanner ui;
    static final String NEXT = "NEXT";
    static final String PREVIOUS = "PREVIOUS";
    Song play;
    int playIndex=0;
    ListIterator<Song> iterator;

    public void run() {

        ui = new Scanner(System.in);

        playList = new LinkedList<>();
        Song[] songs = new Song []{
                Song.newSong("love", "Feelings", "New Sound",4.5),
                Song.newSong("hate", "Feelings", "New Sound",4),
                Song.newSong("jealousy", "Feelings", "New Sound",3.5),
                Song.newSong("sadness", "Feelings", "New Sound",5),
                Song.newSong("joy","Feelings", "New Sound",6),
                Song.newSong("disappointment", "Feelings", "New Sound",3)};
        Album album = Album.newAlbum("Feelings", "New Sound",songs );
        playList.addAll(album.getSongs());
        iterator = playList.listIterator();

        boolean run = true;
        while(run) {

            System.out.println("Please select an option from the menu below:");
            printMenu();
            int selection = ui.nextInt();
            ui.nextLine();
            switch (selection) {
                case 1:
                    playSong();
                    break;
                case 2:
                    replay();
                    break;
                case 3:
                    back();
                    break;
                case 4:
                    next();
                    break;
                case 5:
                    showSongs();
                    break;
                case 6:
                    quit();
                    run=false;
                    break;
                case 0: default:
                    printMenu();
                    break;

            }
        }
    }

    private void quit() {
        System.out.println("exiting..");
        //exit the player
    }

    private void showSongs() {
        System.out.println("Songs in the playlist are:"+playList.toString());
        for (int i=0;i<playList.size();i++){
            Song song = playList.get(i);
            System.out.println(song.getName()+ " by  "+song.getSinger()+" from the album "+song.getAlbum());
        }
    }

    private void next() {
        System.out.println("Going Next..");
        play(NEXT);
    }

    private void back() {
        System.out.println("Going back..");
        play(PREVIOUS);
    }


    private void replay() {
        System.out.println("Replaying..");
        if(play!=null){
            play(play.getName());
        }
        else{
            System.out.println("No tune currently playing.");
        }

    }

    private void play(String request){
        if(!request.equalsIgnoreCase(NEXT) && !request.equalsIgnoreCase(PREVIOUS)){
            System.out.println("Playing.."+request);
        }
        else{

            if(request.equalsIgnoreCase(NEXT)){
                play=iterator.next();
                    System.out.println("Playing.."+play.getName());
                }
                else if(request.equalsIgnoreCase(PREVIOUS)){
                    play=iterator.previous();
                    System.out.println("Playing.."+play.getName());
                }
        }

    }

    private void playSong() {
        //show song playing
        //Show next song
        //Show previous song
        System.out.println("What song do you want to play?");
        String songName=ui.nextLine();

        play=null;
        for(int i=0;i<playList.size();i++){
            Song song = playList.get(i);
            if(playList.get(i).getName().equalsIgnoreCase(songName)){
                play=song;
                playIndex=i;
                break;
            }
        }

        if(play!=null){
            play(play.getName());
        }
        else {
            System.out.println(songName+" is not in the playlist");
        }

    }

    private void printMenu() {
        System.out.println("0-Print Menu\n" +
                "1-Play\n" +
                "2-Replay\n" +
                "3-Back\n" +
                "4-Next\n" +
                "5-Show songs in the album\n" +
                "6-Quit");
    }
}
