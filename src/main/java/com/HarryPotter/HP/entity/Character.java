package com.HarryPotter.HP.entity;

public class Character {
    protected String name;
    protected String surname;
    protected byte age;
    protected boolean alive;

    public Character(String name, String surname, byte age, boolean alive) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void increaseAge(Character character){
        character.setAge((byte)(character.getAge() + 1));
        System.out.println("Happy birthday!!");
    }

    public void isNotAlive(Character character){
        character.setAlive(false);
        System.out.println("I feel your loss");
    }

    public void isAliveNow(Character character){
        character.setAlive(true);
        System.out.println("It's alive");
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}
