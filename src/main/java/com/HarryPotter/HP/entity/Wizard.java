package com.HarryPotter.HP.entity;

import java.util.Arrays;

public class Wizard extends Character {

    protected String houseHogwarts;
    protected byte courseHogwarts;
    protected enum lineage {
        Pureblood, HalfBlood, MuggleBorn
    }

    protected lineage bloodLineage ;
    protected String wandCore;
    protected String[] spells;
    protected enum level {
        Novice, Intermediate, Advanced, Powerful
    }
    protected level magicLevel;

    public Wizard(String name, String surname, byte age, boolean alive, String houseHogwarts, byte courseHogwarts, lineage bloodLineage, String wandCore, String[] spells, level magicLevel) {
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

    public String[] getSpells() {
        return spells;
    }

    public void setSpells(String[] spells) {
        this.spells = spells;
    }

    public level getMagicLevel() {
        return magicLevel;
    }

    public void setMagicLevel(level magicLevel) {
        this.magicLevel = magicLevel;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "houseHogwarts='" + houseHogwarts + '\'' +
                ", courseHogwarts=" + courseHogwarts +
                ", bloodLineage=" + bloodLineage +
                ", wandCore='" + wandCore + '\'' +
                ", spells=" + Arrays.toString(spells) +
                ", magicLevel=" + magicLevel +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}
