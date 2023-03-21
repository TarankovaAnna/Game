package ru.netology.domain;

public class Player {
    // protected int id;
    protected String name;
    protected Integer strength;


    public Player(String name, Integer strength) {
        //this.id = id;
        this.name = name;
        this.strength = strength;
    }

//    public int getId() {
//        return id;
//    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Integer getStrength() {
        return strength;
    }

//    public void setStrength(int strength) {
//        this.strength = strength;
//    }
}
