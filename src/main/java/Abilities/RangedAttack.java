package Abilities;

import Monsters.Monster;

/**
 * Name: R. Sergio Garcia
 * Date: 7/21/2024
 * Explanation: RangedAttack ability
 * attack that implements the Attack interface
 *
 */
public class RangedAttack implements Attack {

    Monster attacker;

    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a ranged attack on " + target;
        System.out.println(message);
        return attacker.getAgility() - target.getAgility();
    }
}
