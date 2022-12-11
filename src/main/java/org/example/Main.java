package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello My friends" +
                "\n"+
                "How old are You?");
        List<People> peopleList=new ArrayList<>();
        peopleList.add(new People("Rifat",32));
        peopleList.add(new People("Max",33));
        peopleList.add(new People("Lesia",28));
        peopleList.add(new People("Inna",25));
        peopleList.add(new People("Nadia",26));
        peopleList.add(new People("Andriy",26));
        peopleList.add(new People("Slavik",26));
        peopleList.add(new People("Vlad",26));
        peopleList.add(new People("Oleg",26));
        peopleList.add(new People("Voldemar",26));
        peopleList.add(new People("Alisa",26));
        peopleList.add(new People("Konan",26));
        peopleList.add(new People("Yorik",26));
        peopleList.add(new People("Rifat",26));
        peopleList.add(new People("Abba",26));
        peopleList.add(new People("Stuart",26));
        peopleList.add(new People("Lara",26));
        peopleList.add(new People("Emili",26));
        peopleList.add(new People("Barbara",26));
        peopleList.add(new People("Abba",26));
        peopleList.add(new People("Sem",26));
        peopleList.add(new People("Ahmed",26));
        peopleList.add(new People("Abraham",26));
        peopleList.add(new People("Esma",26));
        for(People people:peopleList){
            System.out.println(people);
        }


    }
}