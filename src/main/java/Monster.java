/**
 * Name: R. Sergio Garcia
 * Date: 7/21/2024
 * Explanation: Monster Class, abstract class for creating monsters
 * defines variables used to create monsters
 * defines toString() that will be used by class that extend Monster Class
 */
import java.util.HashMap;

public class Monster {
    int maxHP = 10;
    int hp = 0;
    int xp = 10;
    HashMap<String, Integer> items;


    public Monster(int maxHP, int xp, HashMap<String, Integer> items) {
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


    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }
}
