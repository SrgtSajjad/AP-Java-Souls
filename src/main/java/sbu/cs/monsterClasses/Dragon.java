package sbu.cs.monsterClasses;

import sbu.cs.GameObject;
import sbu.cs.Monster;
import sbu.cs.Player;

public class Dragon extends Monster {
    int fireDamage;
    int fireCharge;

    public Dragon(String name) {
        super(name, "Dragon", 1000, 50, true);
        setName(name);
        fireDamage = 100;
        fireCharge = 3;
    }

    public void breathFire(GameObject target) {
        target.takeDamage(fireDamage);
        fireCharge = 0;
        System.out.println(getName() + " breathed fire on the " + ((Player) target).getRole() + " \"" + ((Player) target).getName() + "\"");
    }

    @Override
    public void attack(GameObject target) {
        if (fireCharge == 3) {
            breathFire(target);
        } else {
            target.takeDamage(getAttackPower());
            fireCharge++;
            System.out.println(getName() + " attacked the " + ((Player) target).getRole() + " \"" + ((Player) target).getName() + "\"");
        }
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

    }
}

