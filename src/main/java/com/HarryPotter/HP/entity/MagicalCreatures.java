package com.HarryPotter.HP.entity;

public class MagicalCreatures extends Character {
    protected enum classification {
        Boring, Harmless, Competent, Dangerous, Murderous
    }
    protected classification classificationMinistry;
    protected boolean hasMagicalAbilities;
    protected String[] specificSkills;
    protected enum diet {
        Herbivore, Omnivore, Carnivore, Cannibal
    }
    protected diet dietType;
    protected boolean isRare;
    protected String creatureDescription;

    public MagicalCreatures(String name, String surname, byte age, boolean alive, classification classificationMinistry, boolean hasMagicalAbilities, String[] specificSkills, diet dietType, boolean isRare, String creatureDescription) {
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

    public String[] getSpecificSkills() {
        return specificSkills;
    }

    public void setSpecificSkills(String[] specificSkills) {
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
}
