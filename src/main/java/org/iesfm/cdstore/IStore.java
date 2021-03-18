package org.iesfm.cdstore;

import java.util.HashSet;
import java.util.TreeSet;

public interface IStore {

     TreeSet<Disk> getDisks (String genre);
     Disk getDisk(String title);
     HashSet<Member> getMembers (int cp);

     TreeSet<Disk> findAuthorDisks(String artist);
}
