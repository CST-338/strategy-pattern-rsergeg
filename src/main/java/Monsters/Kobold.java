package Monsters;

import Abilities.*;

import java.util.HashMap;

/**
 * Name: R. Sergio Garcia
 * Date: 7/21/2024
 * Explanation: Kobold Class that extends Monster Class
 * implements a monster called Kobold from Monster class
 */
public class Kobold extends Monster {
    public Kobold(int maxHP, int xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);

        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new RangedAttack(this);

        strength = super.getAttribute(strength, maxStr);
        defense = super.getAttribute(defense, maxDef);
        agility = super.getAttribute(agility, maxAgi);
    }


    @Override
    public String toString(){
        return "Monster.Kobold has : " + super.toString();
    }

}
