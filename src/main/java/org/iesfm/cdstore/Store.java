package org.iesfm.cdstore;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Store implements IStore{
    private String name;
    private String adress;
    private TreeSet <Disk> catalog;
    private TreeSet<Member> members;

    public Store(String name, String adress, TreeSet<Disk> catalog, TreeSet<Member> members) {
        this.name = name;
        this.adress = adress;
        this.catalog = catalog;
        this.members = members;
    }

    @Override
    public TreeSet<Disk> getDisks(String genre) {
        TreeSet<Disk> genreDisks = new TreeSet<>();

        for(Disk disk : genreDisks){
            if(disk.hasGenre(genre)){
                genreDisks.add(disk);
            }
        }
        return null;
    }

    @Override
    public HashSet<Member> getMembers(int cp) {
        HashSet<Member> cpMewmbers = new HashSet<>();


        return null;
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

    public TreeSet<Disk> getCatalog() {
        return catalog;
    }

    public void setCatalog(TreeSet<Disk> catalog) {
        this.catalog = catalog;
    }

    public TreeSet<Member> getMembers() {
        return members;
    }

    public void setMembers(TreeSet<Member> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(name, store.name) &&
                Objects.equals(adress, store.adress) &&
                Objects.equals(catalog, store.catalog) &&
                Objects.equals(members, store.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adress, catalog, members);
    }


}
