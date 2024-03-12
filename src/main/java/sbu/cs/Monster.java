package sbu.cs;

public abstract class Monster implements GameObject
{
    private String name;
    private String role;
    private int health;
    private int attackPower;
    private boolean isAlive;

    public Monster(String name, String role, int health, int attackPower, boolean isAlive) {
        this.name = name;
        this.role = role;
        this.health = health;
        this.attackPower = attackPower;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
