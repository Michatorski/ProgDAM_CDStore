package org.iesfm.cdstore;

import java.util.HashSet;
import java.util.TreeSet;

public interface IStore {

     TreeSet<Disk> getDisks (String genre);
     HashSet<Member> getMembers (int cp);
}
