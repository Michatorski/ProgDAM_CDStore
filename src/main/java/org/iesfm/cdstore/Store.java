package org.iesfm.cdstore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Store implements IStore{
    private String name;
    private String adress;
    private HashMap<String ,Disk> catalog;
    private HashMap<String ,Member> members;

    public Store(String name, String adress, HashMap<String, Disk> catalog, HashMap<String, Member> members) {
        this.name = name;
        this.adress = adress;
        this.catalog = catalog;
        this.members = members;
    }

    @Override
    public TreeSet<Disk> getDisks(String genre) {
        TreeSet<Disk> genreDisks = new TreeSet<>();

        for(Disk disk : catalog.values()){
            if(disk.hasGenre(genre)){
                genreDisks.add(disk);
            }
        }
        return genreDisks;
    }

    @Override
    public Disk getDisk(String title) {
        return catalog.get(title);
    }

    @Override
    public HashSet<Member> getMembers(int cp) {
        HashSet<Member> cpMewmbers = new HashSet<>();


        return null;
    }

    @Override
    public  TreeSet<Disk> findAuthorDisks (String artist){
        for(Disk disk : catalog.values()){
            if(disk.getArtist().equals(artist)){
                disk.getArtist();
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public HashMap<String, Disk> getCatalog() {
        return catalog;
    }

    public void setCatalog(HashMap<String, Disk> catalog) {
        this.catalog = catalog;
    }

    public HashMap<String, Member> getMembers() {
        return members;
    }

    public void setMembers(HashMap<String, Member> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(name, store.name) && Objects.equals(adress, store.adress) && Objects.equals(catalog, store.catalog) && Objects.equals(members, store.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adress, catalog, members);
    }
}
