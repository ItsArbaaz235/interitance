package com.company;

class animal{
    public String name;
    public int age;
    public String color;

     animal(){             // this had not worked.
         System.out.println("constructor");
    }

    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public void setColor(String c){
        color = c;
    }
    public String getColor(){
        return color;
    }
    public void setage(int a){
        age = a;
    }
    public int getage(){
        return age;
    }
}

class Derived extends animal{

    public  void bark(){
        System.out.println("dog is barking...");
    }

}

public class Main {

    public static void main(String[] args) {
        animal dog = new animal();
        dog.setage(6);
        dog.setname("bella");
        dog.setColor("black");
        System.out.println(dog.getage()+dog.getColor()+dog.getname());
        Derived d = new Derived();
        d.bark();
        d.setname("red");
        System.out.println(d.getname());



    }
}
