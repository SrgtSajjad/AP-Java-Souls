package sbu.cs.playerClasses;

import sbu.cs.GameObject;
import sbu.cs.Monster;
import sbu.cs.Player;

public class Knight extends Player {

    int armor;

    public Knight(String name) {
        super(name, "Knight", 1000, 100);
        armor = 5;
    }

    @Override
    public void attack(GameObject target) {
        target.takeDamage(getAttackPower());

        System.out.println(getName() + " attacked the " + ((Monster) target).getRole() + " \"" + ((Monster) target).getName() + "\"");
    }

    @Override
    public void takeDamage(int damage) {
        if (armor > 0) {
            setHealth(getHealth() - damage / armor);
            armor -= 1;
        } else
            setHealth(getHealth() - damage);
    }

    @Override
    public void die() {
        if (getHealth() <= 0) {
            System.out.println(getName() + " the " + getRole() + " was killed");
        }
    }
}
