package org.iesfm.cdstore;




import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
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
        HashSet<Member> myMembers = new HashSet<>();

        for (Member member : members.values()){
            if (member.getCp() == cp){
                myMembers.add(member);
            }
        }
        return myMembers;
    }


    @Override
    public  TreeSet<Disk> findAuthorDisks (String artist){
        TreeSet<Disk> authorDisk = new TreeSet<>();
        for(Disk disk : catalog.values()){
            if(disk.getArtist().equals(artist)){
                authorDisk.add(disk);
            }
        }

        return authorDisk;
    }

    //A corregir
    @Override
    public LinkedList<Order> getOrder(String nif) {
        LinkedList<Order> memberOrder = new LinkedList<>();
        HashSet<Member> members = new HashSet<>();

        for (Member member : members){
            if (member.getNif().equals(nif)){
                member.getOrders();
            }
        }

        return memberOrder;
    }

    //A corregir/comprobar
    @Override
    public HashSet<Member> getMemberSpend(String nif) {
        HashSet<Member> spend = new HashSet<>();
        Order orderPrices = null;

        for (Member member : members.values()){
            if (member.getNif().equals(nif)){
                orderPrices.getPrice();
            }
        }

        return spend;
    }

    @Override
    public int countNumberDisks(String artist) {
        int numbersDisk = 0;

        for(Disk disk : catalog.values()){
            if(disk.getArtist().equals(artist)){
                numbersDisk++;
            }
        }

        return numbersDisk;
    }

    @Override

    public TreeSet<Disk> removeDisk(String title) {
        TreeSet<Disk> removedDisk = new TreeSet<>();
        for(Disk disk : catalog.values()){
            if(disk.getTitle().equals(title)){
                removedDisk.remove(disk);
            }
        }
        return removedDisk;
    }

    @Override
    public TreeSet<Disk> insertDisk( Disk newDisk) {
        TreeSet<Disk> addedDisk = new TreeSet<>();

        addedDisk.add(newDisk);

        return addedDisk;
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
