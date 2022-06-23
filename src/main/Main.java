package main;

import org.testng.annotations.Test;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        int [] niz = new int[]{1, 2, 3};

        List mojaLista = new ArrayList();

        mojaLista.add(5);
        mojaLista.add("Pera");
        mojaLista.add(true);

        for (Object u:mojaLista) {
            System.out.println(u);
        }

        List<Integer> intList = new ArrayList(Arrays.asList(niz));
        intList.add(45);
        intList.add(56);
        intList.add(22);
        intList.add(22);
        intList.add(22);
        intList.add(22);
        intList.add(22);
        intList.remove(0);
        System.out.println(intList);

        if (!intList.isEmpty()){
            System.out.println("Lista nije prazna!");
        }else {
            System.out.println("Prazna lista!");
        }


        String[] sNiz = {"pera", "zika", "djura"};
        List<String> strList = new ArrayList<>(Arrays.asList(sNiz));
        System.out.println(strList);

        List list2 = new LinkedList();
        list2.add("djura");

        Set<Integer> intSet = new HashSet<>(intList);
        System.out.println("Int set: " + intSet);

    }



}
