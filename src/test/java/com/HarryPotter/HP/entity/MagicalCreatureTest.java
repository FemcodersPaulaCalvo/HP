package com.HarryPotter.HP.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MagicalCreatureTest {

    MagicalCreatures magicalCreature1;
    MagicalCreatures magicalCreature2;

    @BeforeEach
    void setup() {
        ArrayList<String> abilities = new ArrayList<>();
        abilities.add("Draining happiness");
        abilities.add("Dementor's Kiss (soul extraction)");

        magicalCreature1 = new MagicalCreatures(
                "Dementor",
                "",
                (byte) 0,
                false,
                MagicalCreatures.classification.Murderous,
                true,
                abilities,
                MagicalCreatures.diet.Carnivore,
                false,
                "A shadowy, cloaked creature that feeds on happiness and hope, leaving cold and despair in its wake."
        );

        magicalCreature2 = new MagicalCreatures(
                "Dementor",
                "",
                (byte) 0,
                false,
                MagicalCreatures.classification.Murderous,
                true,
                abilities,
                MagicalCreatures.diet.Carnivore,
                false,
                "A shadowy, cloaked creature that feeds on happiness and hope, leaving cold and despair in its wake."
        );
    }

    @Test
    void nameMagicalCreature() {
        assertEquals("Dementor", magicalCreature1.getName());
    }

    @Test
    void creatureDescriptionMagicalCreature() {
        assertEquals("A shadowy, cloaked creature that feeds on happiness and hope, leaving cold and despair in its wake.", magicalCreature1.getCreatureDescription());
    }

    @Test
    void changeCreature() {
        magicalCreature1.setSurname("Azkaban");
        assertEquals("Azkaban", magicalCreature1.getSurname());
    }

    @Test
    void createNewMagicalCreatures() {
        assertEquals(magicalCreature1.toString(), magicalCreature2.toString());
    }

}