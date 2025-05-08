package com.HarryPotter.HP.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class MagicalCreatures extends Character {
    protected enum classification {
        Boring, Harmless, Competent, Dangerous, Murderous
    }
    protected classification classificationMinistry;
    protected boolean hasMagicalAbilities;
    protected ArrayList<String> specificSkills;
    protected enum diet {
        Herbivore, Omnivore, Carnivore, Cannibal
    }
    protected diet dietType;
    protected boolean isRare;
    protected String creatureDescription;

    public MagicalCreatures(String name, String surname, byte age, boolean alive, classification classificationMinistry, boolean hasMagicalAbilities, ArrayList<String> specificSkills, diet dietType, boolean isRare, String creatureDescription) {
        super(name, surname, age, alive);
        this.classificationMinistry = classificationMinistry;
        this.hasMagicalAbilities = hasMagicalAbilities;
        this.specificSkills = specificSkills;
        this.dietType = dietType;
        this.isRare = isRare;
        this.creatureDescription = creatureDescription;
    }

    public classification getClassificationMinistry() {
        return classificationMinistry;
    }

    public void setClassificationMinistry(classification classificationMinistry) {
        this.classificationMinistry = classificationMinistry;
    }

    public boolean isHasMagicalAbilities() {
        return hasMagicalAbilities;
    }

    public void setHasMagicalAbilities(boolean hasMagicalAbilities) {
        this.hasMagicalAbilities = hasMagicalAbilities;
    }

    public ArrayList<String> getSpecificSkills() {
        return specificSkills;
    }

    public void setSpecificSkills(ArrayList<String> specificSkills) {
        this.specificSkills = specificSkills;
    }

    public diet getDietType() {
        return dietType;
    }

    public void setDietType(diet dietType) {
        this.dietType = dietType;
    }

    public boolean isRare() {
        return isRare;
    }

    public void setRare(boolean rare) {
        isRare = rare;
    }

    public String getCreatureDescription() {
        return creatureDescription;
    }

    public void setCreatureDescription(String creatureDescription) {
        this.creatureDescription = creatureDescription;
    }

    public void listSkills(){
        ArrayList<String> listSkills = this.getSpecificSkills();
        System.out.println("Skills list:  ");
        for(String skill : listSkills){
            System.out.println("· " + skill);
        }
    }

    public void addSkill(String newSkill){
        ArrayList<String> listSkills = this.getSpecificSkills();
        boolean alreadyExists = listSkills.contains(newSkill.toLowerCase());
        if(!alreadyExists){listSkills.add(newSkill.toLowerCase());} else {
            System.out.println("This ability is already added");
        }
    }

    public void removeSkill(String skill){
        ArrayList<String> listSkills = this.getSpecificSkills();
        boolean alreadyExists = listSkills.contains(skill.toLowerCase());
        if(alreadyExists){listSkills.remove(listSkills.indexOf(skill.toLowerCase()));} else {
            System.out.println("This ability dosen't exist");
        }
    }

    @Override
    public String toString() {
        return "MagicalCreatures{" +
                "classificationMinistry=" + classificationMinistry +
                ", hasMagicalAbilities=" + hasMagicalAbilities +
                ", specificSkills=" + specificSkills +
                ", dietType=" + dietType +
                ", isRare=" + isRare +
                ", creatureDescription='" + creatureDescription + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}
