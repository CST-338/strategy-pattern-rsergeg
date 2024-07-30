package Monsters;

import Abilities.*;

import java.util.HashMap;

/**
  Name: R. Sergio Garcia
  Date: 7/21/2024
  Explanation: Imp Class that extends Monster Class
  implements a monster called Imp from Monster class
 */
public class Imp extends Monster{

    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);

        strength = super.getAttribute(strength, maxStr);
        defense = super.getAttribute(defense, maxDef);
        agility = super.getAttribute(agility, maxAgi);
    }

    @Override
    public String toString(){
        return "Monster.Imp has : " + super.toString();
    }
}
