package com.company;

import java.io.*;
import java.until.*;

public class Jukebox8 {  // at least one class and the class here is 'Main'
    ArrayList<Song> songList = new ArrayList<Song>();
    int val;

    public static void main(String[] args) { // this statement is compulsory
	// write your code here
        new Jukebox8().go();
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList); //order by songs' names
        System.out.println(songList);

        TreeSet<Song> songSet = new TreeSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
    }
    void getSongs(){
        try{
            File myFile = new File("SongListMore.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);

            String line=null;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
        songList.add(nextSong);
    }
}

class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;

    public boolean equals(Object aSong){
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
    }

    public int compareTo(String s){
        return title.compareTo(s.getTitle());
    }

    Song(String t,String a,String r,String b){
        title=t;
        artist=a;
        rating=r;
        bpm=b;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getRating(){
        return rating;
    }
    public String getBpm(){
        return bpm;
    }
    public String toString(){
        return title;
    }
}

