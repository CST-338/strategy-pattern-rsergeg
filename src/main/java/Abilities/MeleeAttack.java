package Abilities;

import Monsters.*;

/**
 * Name: R. Sergio Garcia
 * Date: 7/21/2024
 * Explanation: MeleeAttack ability
 * attack that implements the Attack interface
 *
 */
public class MeleeAttack implements Attack {

    Monster attacker;

    public MeleeAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return null;
    }
}

