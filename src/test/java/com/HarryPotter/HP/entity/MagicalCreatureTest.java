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
}
