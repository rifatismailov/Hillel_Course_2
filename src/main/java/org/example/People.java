package org.example;

public class People {
    String name;
    int age;
    public People(String name,int age){
        this.name=name;
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name+" "+age;
    }
}
