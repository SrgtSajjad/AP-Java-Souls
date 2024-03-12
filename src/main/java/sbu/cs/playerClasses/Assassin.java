package sbu.cs.playerClasses;

import sbu.cs.GameObject;
import sbu.cs.Monster;
import sbu.cs.Player;

public class Assassin extends Player {
    boolean isInvisible;
    int criticalMultiplier;

    public Assassin(String name, String role, int health, int attackPower, boolean isInvisible, int criticalMultiplier) {
        super(name, "Assassin", 1000, 50);

        this.isInvisible = false;
        this.criticalMultiplier = 4;
    }

    @Override
    public void attack(GameObject target) {
        if (isInvisible) {
            target.takeDamage(getAttackPower() * criticalMultiplier);
            isInvisible = false;
        } else
            target.takeDamage(getAttackPower());

        System.out.println(getName() + " attacked the " + ((Monster) target).getRole() + " \"" + ((Monster) target).getName() + "\"");
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
