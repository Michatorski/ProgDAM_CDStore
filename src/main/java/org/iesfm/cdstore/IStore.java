package org.iesfm.cdstore;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;


public interface IStore {
     /**
      * Devuelve disco en base del genero ordenado alfabeticamente.
      * @param genre
      * @return disk
      */
     TreeSet<Disk> getDisks (String genre);


     /**
      * Devuelve los socios de un código postal, sin orden optimizados para su búsqueda.
      * @param cp
      * @return member
      */
     HashSet<Member> getMembers (int cp);

     /**
      * Devuelve disco en base del titulo.
      * @param title
      * @return disk
      */
     Disk getDisk(String title);

     /**
      * Devuelve los discos de un artista ordenados por título.
      * @param artist
      * @return disk
      */
     TreeSet<Disk> findAuthorDisks(String artist);

     /**
      * Devuelve los pedidos de un socio dado su NIF.
      * @param nif
      * @return order
      */
     LinkedList<Order> getOrder (String nif);

     /**
      * Devuelve cuánto se ha gastado un socio en total dado su NIF.
      * @param nif
      * @return order price
      */
     HashSet<Member> getMemberSpend (String nif);

     /**
      * Devuelve el número de discos de un artista.
      * @param author
      * @return numero de discos
      */
     int countNumberDisks (String author);

     /**
      * Un método que elimine un disco dado su título.
      * @param title
      * @return
      */
     TreeSet<Disk> removeDisk (String title);

     /**
      * Un método que inserte un nuevo disco.
      * @return
      */
     TreeSet<Disk> insertDisk (Disk newDisk);



}
