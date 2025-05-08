package com.HarryPotter.HP.entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MagicalCreatureTest {
    MagicalCreatures magicalCreature1 = new MagicalCreatures(
            "Dementor",
            "",
            (byte) 0,
            false,
            MagicalCreatures.classification.Murderous,
            true,
            new String[]{"Draining happiness", "Dementor's Kiss (soul extraction)"},
            MagicalCreatures.diet.Carnivore,
            false,
            "A shadowy, cloaked creature that feeds on happiness and hope, leaving cold and despair in its wake."
    );

    @Test
    public void nameMagicalCreature() {
        assertEquals("Dementor", magicalCreature1.getName());
    }

    @Test
    public void creatureDescriptionMagicalCreature(){
        assertEquals("A shadowy, cloaked creature that feeds on happiness and hope, leaving cold and despair in its wake.", magicalCreature1.getCreatureDescription());
    }

    @Test
    public void changeCreature(){
        magicalCreature1.setSurname("Azkaban");
        assertEquals("Azkaban", magicalCreature1.getSurname());
    }

    @Test
    public void createNewMagicalCreatures(){
        MagicalCreatures magicalCreature2 = new MagicalCreatures(
                "Dementor",
                "",
                (byte) 0,
                false,
                MagicalCreatures.classification.Murderous,
                true,
                new String[]{"Draining happiness", "Dementor's Kiss (soul extraction)"},
                MagicalCreatures.diet.Carnivore,
                false,
                "A shadowy, cloaked creature that feeds on happiness and hope, leaving cold and despair in its wake."
        );

        assertEquals(magicalCreature1.toString(), magicalCreature2.toString());
    }
}
