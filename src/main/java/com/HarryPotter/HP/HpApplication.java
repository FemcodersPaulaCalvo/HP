package com.HarryPotter.HP;

import com.HarryPotter.HP.entity.MagicalCreatures;
import com.HarryPotter.HP.entity.Muggle;
import com.HarryPotter.HP.entity.Wizard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

import static com.HarryPotter.HP.entity.Wizard.level.*;
import static com.HarryPotter.HP.entity.Wizard.lineage.*;

@SpringBootApplication
public class HpApplication {

	public static void main(String[] args) {
		SpringApplication.run(HpApplication.class, args);

		Wizard wizard1;
		Wizard wizard2;
		MagicalCreatures magicalCreature1;
		MagicalCreatures magicalCreature2;
		Muggle muggle1;
		Muggle muggle2;

		ArrayList<String> spellsPotter = new ArrayList<>();
		spellsPotter.addAll(Arrays.asList("wingardium leviosa", "alohomora", "lumos"));

		ArrayList<String> spellsHermione = new ArrayList<>();
		spellsHermione.addAll(Arrays.asList("wingardium leviosa", "alohomora", "reparo", "lumos", "nox", "petrificus totalus"));


		wizard1 = new Wizard("Harry", "Potter", (byte) 11, true, "Griffindor", (byte) 1, Pureblood , "Dragon Heartstring", spellsPotter, Novice);

		wizard2 = new Wizard("Hermione",
				"Granger",
				(byte) 11,
				true, "Griffindor", (byte) 1, MuggleBorn, "phoenix feather", spellsHermione, Novice);

		ArrayList<String> abilitiesDementor = new ArrayList<>();
		abilitiesDementor.addAll(Arrays.asList("draining happiness", "dementor's kiss (soul extraction)"));

		ArrayList<String> abilitiesFluffy = new ArrayList<>();
		abilitiesFluffy.addAll(Arrays.asList("three heads", "powerful bite", "guards the sorcerer's stone"));

		magicalCreature1 = new MagicalCreatures(
				"Dementor",
				"",
				(byte) 0,
				false,
				MagicalCreatures.classification.Murderous,
				true,
				abilitiesDementor,
				MagicalCreatures.diet.Carnivore,
				false,
				"A shadowy, cloaked creature that feeds on happiness and hope, leaving cold and despair in its wake."
		);

		magicalCreature2 = new MagicalCreatures(
				"Fluffy",
				"Third floor corridor at Hogwarts",
				(byte) 3,
				true,
				MagicalCreatures.classification.Dangerous,
				true,
				abilitiesFluffy,
				MagicalCreatures.diet.Carnivore,
				false,
				"A giant three-headed dog used to guard the trapdoor leading to the Sorcerer's Stone."
		);

		muggle1 = new Muggle("Vernon", "Dursley", (byte) 47, true, "Director of Grunnings", false);

		muggle2 = new Muggle("Petunia", "Dursley", (byte) 47, true, "Homemaker", true);

		System.out.println(wizard1.toString());
		System.out.println(wizard2.toString());
		System.out.println();
		wizard1.listAllSpells();
		wizard2.listAllSpells();
		System.out.println();
		System.out.println("add spells");
		wizard1.addSpell("Nox");
		wizard2.addSpell("Nox");
		wizard1.listAllSpells();
		wizard2.listAllSpells();
		System.out.println();
		System.out.println("remove spells");
		wizard2.removeSpell("Nox");
		wizard2.removeSpell("Nox");
		wizard1.listAllSpells();
		wizard2.listAllSpells();

		System.out.println();
		System.out.println(magicalCreature1.toString());
		System.out.println(magicalCreature2.toString());
		System.out.println();
		magicalCreature1.listSkills();
		magicalCreature2.listSkills();
		System.out.println();
		System.out.println("add skills");
		magicalCreature1.addSkill("Induce intense cold");
		magicalCreature2.addSkill("Falls asleep to music");
		magicalCreature1.listSkills();
		magicalCreature2.listSkills();
		System.out.println();
		System.out.println("remove skills");
		magicalCreature1.removeSkill("Draining happiness");
		magicalCreature1.removeSkill("Draining happiness");
		magicalCreature1.listSkills();
		magicalCreature2.listSkills();

		System.out.println();
		System.out.println(muggle1.toString());
		System.out.println(muggle2.toString());
		System.out.println();
		muggle1.increaseAge(muggle1);
		muggle2.isAliveNow(muggle2);
		muggle1.isNotAlive(muggle1);
		System.out.println();
		System.out.println(muggle1.toString());
		System.out.println(muggle2.toString());

	}

}
