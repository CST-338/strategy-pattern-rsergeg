package Monsters;
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
    }

    @Override
    public String toString(){
        return "Kobold has : " + super.toString();
    }

}
