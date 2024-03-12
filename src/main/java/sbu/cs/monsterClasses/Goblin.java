package sbu.cs.monsterClasses;

import sbu.cs.GameObject;
import sbu.cs.Player;
import sbu.cs.Monster;


public class Goblin extends Monster {


    public Goblin(String name, String role, int health, int attackPower, boolean isAlive) {
        super(name, "Goblin", 500, 40, true);

    }

    @Override
    public void attack(GameObject target) {
        target.takeDamage(getAttackPower());

        System.out.println(getName() + " attacked the " + ((Player) target).getRole() + " \"" + ((Player) target).getName() + "\"");
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    @Override
    public void die() {
        if (getHealth() <= 0) {
            System.out.println(getName() + " the " + getRole() + " was killed");
        }
    }
}
