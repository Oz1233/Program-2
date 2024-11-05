/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author Oleh
 */
public class Mavenproject4 {

    public static void main(String[] args) {
    Person name = new Person("Oleh",27);
    name.displayInfo();
    
    Person city = new Person("Berlin");
    city.displayInfo();
    }
}
class Person{
    String name;
    int age;
    String city;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    Person(String city){
        this.city = city;
    }
    void displayInfo(){
        System.out.printf("Name: %s Age: %d City: %s\n", name, age, city);
    }
}
