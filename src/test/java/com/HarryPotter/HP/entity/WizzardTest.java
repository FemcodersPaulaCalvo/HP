package com.HarryPotter.HP.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static com.HarryPotter.HP.entity.Wizard.lineage.*;
import static com.HarryPotter.HP.entity.Wizard.level.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WizzardTest {

    Wizard wizard1;
    Wizard wizard2;

    @BeforeEach
    void setUp() {
        ArrayList<String> spells = new ArrayList<>();
        spells.add("Wingardium Leviosa");
        spells.add("Lumos");
        spells.add("Alohomora");

        wizard1 = new Wizard("Harry", "Potter", (byte) 11, true, "Griffindor", (byte) 1, Pureblood, "phoenix feather", spells, Novice);
        wizard2 = new Wizard("Harry", "Potter", (byte) 11, true, "Griffindor", (byte) 1, Pureblood, "phoenix feather", spells, Novice);
    }

    @Test
    public void nameNewWizard() {
        assertEquals("Harry", wizard1.getName());
    }

    @Test
    public void bloodLinageNewWizard() {
        assertEquals(Pureblood, wizard1.getBloodLineage());
    }

    @Test
    public void chageAge() {
        wizard1.setAge((byte)12);
        assertEquals((byte)12, wizard1.getAge());
    }

    @Test
    public void createNewWizzard(){
                assertEquals(wizard1.toString(), wizard2.toString());
    }

}
