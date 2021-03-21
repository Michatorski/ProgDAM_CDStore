package org.iesfm.cdstore;

import org.junit.Assert;
import org.junit.Test;


import java.util.*;


public class StoreTests {

    private Store store;
    private TreeSet<Disk> disks;
    private HashSet<Member> members;
    private LinkedList<Order> orders;

    @Test
    public void getDisksTest (){
        disks = new TreeSet<>();

        HashSet<String> genres = new HashSet<>();
        genres.add("Metal");

        disks.add(new Disk("", "Artista1", genres));
        disks.add(new Disk("", "Artista2", genres));
        disks.add(new Disk("", "Artista3", genres));
        disks.add(new Disk("", "Artista4", new HashSet<>()));

        store = new Store("", "", new HashMap<>(), new HashMap<>());

        TreeSet <Disk> metalDisk = store.getDisks("Metal");

        Set<Disk> expectedMetalDisk = new TreeSet<>();
        disks.add(new Disk("", "Artista1", genres));
        disks.add(new Disk("", "Artista2", genres));
        disks.add(new Disk("", "Artista3", genres));

        Assert.assertEquals(expectedMetalDisk, metalDisk);
    }

    @Test
    public void getDiskTest(){

        //Aun por corregir No se como se hace

    Disk [] disk = new Disk[3];
    HashSet<String> genres = new HashSet<>();

    disk [0] = new Disk("Fields of Verdun", "", genres );
    disk [1] = new Disk("", "", genres );
    disk [1] = new Disk("", "", genres );


        store = new Store("", "", new HashMap<>(), new HashMap<>());


    }

    @Test
    public void getMembersTest(){
        members =  new HashSet<>();

        int cp = 1234;

        members.add(new Member("Name1", "", "", 0, new LinkedList<>()));
        members.add(new Member("Name2", "", "", cp, new LinkedList<>()));
        members.add(new Member("Name3", "", "", 0, new LinkedList<>()));
        members.add(new Member("Name4", "", "", cp, new LinkedList<>()));

        store = new Store("", "", new HashMap<>(), new HashMap<>());

        HashSet<Member> postalCodeFound = store.getMembers(1234);

        Set<Disk> expectedPostalCode = new HashSet<>();
        members.add(new Member("Name2", "", "", cp, new LinkedList<>()));
        members.add(new Member("Name4", "", "", cp, new LinkedList<>()));

        Assert.assertEquals(expectedPostalCode, postalCodeFound);
    }


    @Test
    public void findAuthorDisksTest(){
        disks = new TreeSet<>();


        String artist = "Guns&Roses";

        disks.add(new Disk("", "Guns&Roses", new HashSet<>()));
        disks.add(new Disk("", "Artista2", new HashSet<>()));
        disks.add(new Disk("", "Artista3", new HashSet<>()));

        store = new Store("", "", new HashMap<>(), new HashMap<>());

        TreeSet <Disk> artistFound = store.findAuthorDisks("Guns&Roses");

        Set<Disk> expectedArtist = new TreeSet<>();
        disks.add(new Disk("", "Guns&Roses", new HashSet<>()));

        Assert.assertEquals(expectedArtist, artistFound);

    }

    @Test
    public void getOrderTest(){
        members =  new HashSet<>();

        orders =  new LinkedList<>();

        orders.add(new Order(1, "2021/03/04"));

        String nif = "X";

        members.add(new Member("Name1", "", nif, 0, orders));
        members.add(new Member("Name2", "", "", 0, new LinkedList<>()));
        members.add(new Member("Name3", "", nif, 0, orders));;
        members.add(new Member("Name4", "", "", 0, new LinkedList<>()));

        store = new Store("", "", new HashMap<>(), new HashMap<>());

        LinkedList orderFound = store.getOrder("X");

        LinkedList<Order> expectedOrder = new LinkedList<>();
        members.add(new Member("Name1", "", nif, 0, orders));
        members.add(new Member("Name3", "", nif, 0, orders));
        Assert.assertEquals(expectedOrder, orderFound);
    }


    @Test
    public void getMemberSpendTest(){
       //Aun por descubrir

    }

    @Test
    public void countNumberDisksTest(){

    }

    @Test
    public void removeDiskTest(){

    }

    @Test
    public void insertDiskTest(){

    }
}
