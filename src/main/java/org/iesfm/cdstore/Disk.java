package org.iesfm.cdstore;

import java.util.HashSet;
import java.util.Objects;

public class  Disk implements Comparable<Disk> {
    private String title;
    private String artist;
    private HashSet<String> genres;

    public Disk(String title, String artist, HashSet<String> genre) {
        this.title = title;
        this.artist = artist;
        this.genres = genre;
    }

     public  boolean hasGenre (String genre){
        return genres.contains(genre);
    }

    @Override
    public int compareTo(Disk o) {
        return  this.title.compareTo(o.getTitle() );
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public HashSet<String> getGenre() {
        return genres;
    }

    public void setGenre(HashSet<String> genre) {
        this.genres = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disk disk = (Disk) o;
        return Objects.equals(title, disk.title) &&
                Objects.equals(artist, disk.artist) &&
                Objects.equals(genres, disk.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, genres);
    }


}
