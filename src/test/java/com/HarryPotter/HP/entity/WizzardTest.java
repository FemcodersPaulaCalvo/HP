package com.HarryPotter.HP.entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.HarryPotter.HP.entity.Wizard.lineage.*;
import static com.HarryPotter.HP.entity.Wizard.level.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class WizzardTest {

    Wizard wizard1 = new Wizard("Harry", "Potter", (byte) 11, true, "Griffindor", (byte) 1, Pureblood, "phoenix feather", new String[]{
            "Wingardium Leviosa",
            "Lumos",
            "Alohomora"
    }, Novice);

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
        Wizard wizard2 = new Wizard("Harry", "Potter", (byte) 11, true, "Griffindor", (byte) 1, Pureblood, "phoenix feather", new String[]{
                "Wingardium Leviosa",
                "Lumos",
                "Alohomora"
        }, Novice);

        assertEquals(wizard1.toString(), wizard2.toString());
    }

}
