package com.example.anketaj;

public class User {

    public String name;
    public String surname;
    public String age;
    public String other;


    public User(String name, String surname, String age, String other) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.other = other;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setAge(String age){
        this.age = age;
    }

    public void setOther(String other){
        this.other = other;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getAge(){
        return this.age;
    }

    public String getOther(){
        return this.other;
    }
}
