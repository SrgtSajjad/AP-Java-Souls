package sbu.cs.playerClasses;

import sbu.cs.GameObject;
import sbu.cs.Monster;
import sbu.cs.Player;

// Implementing this class is optional
public class Wizard extends Player {
    int mana;
    int healSpellPower;
    int healSpellCost;
    int damageSpellPower;
    int damageSpellCost;

    public Wizard(String name, String role, int health, int attackPower) {
        super(name, "Wizard", 600, 30);
        damageSpellPower = 50;
        healSpellPower = 100;
        healSpellCost = 20;
        damageSpellCost = 5;
        mana = 5;
    }

    public void castHealSpell() {
        if (getHealth() + healSpellPower > 600) {
            setHealth(600);
        } else {
            setHealth(getHealth() + healSpellPower);
        }
        mana -= healSpellCost;
    }

    public void castDamageSpell(GameObject target) {
        target.takeDamage(damageSpellPower);
        mana -= damageSpellCost;
        mana += 10;
    }

    @Override
    public void attack(GameObject target) {
        target.takeDamage(getAttackPower());
        mana += 15;
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
