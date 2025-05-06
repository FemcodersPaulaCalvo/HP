package com.HarryPotter.HP.entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MuggleTest {

    Muggle muggle1 = new Muggle("Frank", "Longbottom", (byte) 45, false,  "Auror", true);

    @Test
    public void nameNewMuggle(){
        assertEquals("Frank", muggle1.getName());
    }

    @Test
    public void surnameNewMuggle() {
        assertEquals("Auror", muggle1.getWork());
    }

    @Test
    public void changeHaveSons() {
        muggle1.setHaveSons(false);
        assertEquals(false, muggle1.getHaveSons());
    }

    @Test
    public void createNewMuggle(){
        Muggle muggle2 = new Muggle("Frank", "Longbottom", (byte) 45, false,  "Auror", true);
        assertEquals(muggle1.toString(), muggle2.toString());
    }
}
