package com.HarryPotter.HP.entity;

import java.util.ArrayList;

public class Wizard extends Character {

    protected String houseHogwarts;
    protected byte courseHogwarts;
    public enum lineage {
        Pureblood, HalfBlood, MuggleBorn
    }

    protected lineage bloodLineage ;
    protected String wandCore;
    protected ArrayList<String> spells;
    public enum level {
        Novice, Intermediate, Advanced, Powerful
    }
    protected level magicLevel;

    public Wizard(String name, String surname, byte age, boolean alive, String houseHogwarts, byte courseHogwarts, lineage bloodLineage, String wandCore, ArrayList<String> spells, level magicLevel) {
        super(name, surname, age, alive);
        this.houseHogwarts = houseHogwarts;
        this.courseHogwarts = courseHogwarts;
        this.bloodLineage = bloodLineage;
        this.wandCore = wandCore;
        this.spells = spells;
        this.magicLevel = magicLevel;
    }

    public String getHouseHogwarts() {
        return houseHogwarts;
    }


    public byte getCourseHogwarts() {
        return courseHogwarts;
    }

    public void setCourseHogwarts(byte courseHogwarts) {
        this.courseHogwarts = courseHogwarts;
    }

    public lineage getBloodLineage() {
        return bloodLineage;
    }

    public String getWandCore() {
        return wandCore;
    }

    public ArrayList<String> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<String> spells) {
        this.spells = spells;
    }

    public level getMagicLevel() {
        return magicLevel;
    }

    public void setMagicLevel(level magicLevel) {
        this.magicLevel = magicLevel;
    }

    public void listAllSpells(){
        ArrayList<String> listSpells = this.spells;
        System.out.println("Spells list");
        for(String spell : listSpells){
            System.out.println("· " + spell);
        }
    }

    public void addSpell(String newSpell){
        ArrayList<String> listSpells = this.getSpells();
        boolean alreadyExists = listSpells.contains(newSpell.toLowerCase());
        if(!alreadyExists){
            listSpells.add(newSpell.toLowerCase());} else {
            System.out.println("This spell is already added");
        }
    }

    public void removeSpell(String spell){
        ArrayList<String> listSpells = this.getSpells();
        boolean alreadyExists = listSpells.contains(spell.toLowerCase());
        if(alreadyExists){
            listSpells.remove(listSpells.indexOf(spell.toLowerCase()));} else {
            System.out.println("This spell does not exist");
        }
    }


    @Override
    public String toString() {
        return "Wizard{" +
                "houseHogwarts='" + houseHogwarts + '\'' +
                ", courseHogwarts=" + courseHogwarts +
                ", bloodLineage=" + bloodLineage +
                ", wandCore='" + wandCore + '\'' +
                ", spells=" + spells.toString() +
                ", magicLevel=" + magicLevel +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}
