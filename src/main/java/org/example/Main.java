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
        peopleList.add(new People("Oleg",26));
        for(People people:peopleList){
            System.out.println(people);
        }


    }
}