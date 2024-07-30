package Monsters;

import java.util.HashMap;

/**
  Name: R. Sergio Garcia
  Date: 7/21/2024
  Explanation: Imp Class that extends Monster Class
  implements a monster called Imp from Monster class
 */
public class Imp extends Monster{

    public Imp(int maxHP, int xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString(){
        return "Imp has : " + super.toString();
    }
}
