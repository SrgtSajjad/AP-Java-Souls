package sbu.cs.monsterClasses;

import sbu.cs.GameObject;
import sbu.cs.Player;
import sbu.cs.Monster;


public class Skeleton extends Monster
{
    int deathCount;
    public Skeleton(String name) {
        super(name, "Skeleton", 300, 60, true);
        deathCount = 0;

    }

    public void revive() {
        setAlive(true);
        setHealth(300);
    }

    @Override
    public void attack(GameObject target) {
        target.takeDamage(getAttackPower());

        System.out.println(getName() + " attacked the " + ((Player) target).getRole() + " \"" + ((Player) target).getName() + "\"");
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
        if (getHealth() <= 0) {
            die();
        }
    }

    @Override
    public void die() {
        System.out.println(getName() + " the " + getRole() + " was killed");

        if (!isAlive() && deathCount == 0) {
            revive();
        }
    }
}
