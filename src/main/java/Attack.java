/**
 * Name: R. Sergio Garcia
 * Date: 7/21/2024
 * Explanation: Attack Interface
 * defines attack interface
 * will be implemented by MeleeAttack and RangedAttack classes
 */
public interface Attack extends Ability {

    public default Integer attack(Monster target) {
        return null;
    }
}
