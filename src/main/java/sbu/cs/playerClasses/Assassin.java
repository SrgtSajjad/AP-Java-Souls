package sbu.cs.playerClasses;

import sbu.cs.GameObject;
import sbu.cs.Player;

public class Assassin extends Player
{
    public Assassin(String name, String role, int health, int attackPower) {
        super(name, role, health, attackPower);
        setRole("Assassin");
    }


    @Override
    public void attack(GameObject target) {

    }

    @Override
    public void takeDamage(int damage) {

    }

    @Override
    public void die() {

    }
}

