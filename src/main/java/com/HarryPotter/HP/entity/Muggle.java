package com.HarryPotter.HP.entity;

public class Muggle extends Character {

    protected String work;
    protected Boolean haveSons;

    public Muggle(String name, String surname, byte age, boolean alive, String work, Boolean haveSons) {
        super(name, surname, age, alive);
        this.work = work;
        this.haveSons = haveSons;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Boolean getHaveSons() {
        return haveSons;
    }

    public void setHaveSons(Boolean haveSons) {
        this.haveSons = haveSons;
    }

    @Override
    public String toString() {
        return "Muggle{" +
                "work='" + work + '\'' +
                ", haveSons=" + haveSons +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}
