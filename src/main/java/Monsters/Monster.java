package Monsters;

import Abilities.*;

import java.util.HashMap;
import java.util.Random;

/**
 * Name: R. Sergio Garcia
 * Date: 7/21/2024
 * Explanation: Monster Class, abstract class for creating monsters
 * defines variables used to create monsters
 * defines toString() that will be used by class that extend Monster Class
 */
public class Monster {
    private Integer maxHP = 10;
    private Integer hp = 0;
    private Integer xp = 10;
    private HashMap<String, Integer> items;
    Integer agility = 10;
    Integer defense = 10;
    Integer strength = 10;
    Attack attack;


    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    @Override
    public String toString() {
        return "hp=" + hp + "/" + maxHP;
    }

    // TODO Class

    // TODO CLass


    public Integer getMaxHP() {
        return maxHP;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getAgility() { return agility; }

    public Integer getDefense() { return defense; }

    public Integer getStrength() { return strength; }


    /**
     * This method returns and integer value between min and max.
     * This is goofy. rand.nextInt(n) returns a number between 0-n
     * to get the value we want, a value between str-masStr,
     * We need to get a random number from maxStr-str and
     * add str back in.
     * @param min an integer
     * @param max a integer
     * @return a random integer between min and max
     */
    Integer getAttribute(Integer min, Integer max) {
        Random rand = new Random();
        if (min > max) {
            Integer temp = min;
            min = max;
            max = temp;
        }
        // returns a random number between min and max inclusive
        return rand.nextInt(max - min) + min;
    }

    /**
     * this method calculates if the target has taken any damage,
     * and determines if the target's hp has fallen below 0.
     * if the damage value is greater than 0, the damage amount is
     * subtracted from the current hp value.
     * @param damage and integer
     * @return false if hp is greater than 0, else true
     */
    boolean takeDamage(Integer damage){
        if (damage > 0){
            if (damage > hp) {
                System.out.println("Oh no! the creature has perished");
            } else {
                System.out.println("The creature was hit for " + damage + " damage");
            }
        }
        hp = hp - damage;
        System.out.println(this.toString());
        return hp <= 0;
    }

    /**
     * This method calls takeDamage() method of the Monster that was passed in.
     * This method, takeDamage() is called with the value returned from the
     * attack method.
     * @param target a Monster type
     * @return result and Integer
     */
    public Integer attackTarget(Monster target){

        Integer damage = this.attack.attack(target);
        target.takeDamage(damage);

        return damage;
    }




}
