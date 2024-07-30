/**
 * Name: R. Sergio Garcia
 * Date: 7/21/2024
 * Explanation: Driver class for Strategy HW03
 * Makes calls to Monster, Imp and Kobold classes
 */
import Monsters.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        HashMap<String, Integer> items = new HashMap<>();
        items.put("gold", 5);
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(1, 5, items));

        for (Monster m : monsters) {
            System.out.println(m);
        }

    }
}
