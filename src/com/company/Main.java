package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> ListA = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (ListA.size() < 5){
            System.out.println("Введите топ 5 любимых книг");
            ListA.add(scan.nextLine());
        }

        Iterator<String> iterator = ListA.iterator();
        while (iterator.hasNext()){
        String it = iterator.next();
            System.out.println(it);
        }
        System.out.println("___________");

        ArrayList<String> ListB = new ArrayList<>();
        Scanner scanTwo = new Scanner(System.in);
        while (ListB.size() < 5){
            System.out.println("Введите топ 5 любимых персонажей из книг");
            ListB.add(scanTwo.nextLine());
        }
        iterator = ListB.iterator();
        while (iterator.hasNext()){
            String it = iterator.next();
            System.out.println(it);
        }

        System.out.println("______________-");
        System.out.println("Объединение их в общий список");

        ArrayList<String> ListC = new ArrayList<>(10);
        ListC.addAll(ListA);
        ListC.add(1, ListB.get(4));
        ListC.add(3, ListB.get(3));
        ListC.add(5, ListB.get(2));
        ListC.add(7, ListB.get(1));
        ListC.add(9, ListB.get(0));

        iterator = ListC.iterator();
        while (iterator.hasNext()){
            String it = iterator.next();
            System.out.println(it);
        }

        System.out.println("___________");
        System.out.println("Сортировка по длине букв");
        Collections.sort(ListC, new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                if (string1.length() > string2.length()){
                    return 1;
                } else if(string1.length() < string2.length()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        iterator = ListC.iterator();
        while (iterator.hasNext()){
            String it = iterator.next();
            System.out.println(it);
        }

    }
}
