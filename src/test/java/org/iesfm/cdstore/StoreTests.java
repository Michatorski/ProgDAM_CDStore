package org.iesfm.cdstore;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StoreTests {

    private Store store;
    private TreeSet<Disk> disks;

    @Test
    public void getDisks (){
        disks = new TreeSet<>();

         HashSet<String> genres = new HashSet<>();
        genres.add("Metal");

        disks.add(new Disk("", "Artista1", new HashSet<>()) );
        disks.add(new Disk("", "Artista2", genres));
        disks.add(new Disk("", "Artista3", new HashSet<>() ) );

        store = new Store("", "", new HashMap<>(), new HashMap<>());

        TreeSet <Disk> metalDisk = store.getDisks("Metal");

        Set<Disk> expectedMetalDisk = new TreeSet<>();
        expectedMetalDisk.add(new Disk("", "Artista2", genres));


        Assert.assertEquals(expectedMetalDisk, metalDisk);

    };
}
