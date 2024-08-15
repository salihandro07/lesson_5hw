public class Hero {
    private int health;
    private int damage;
    private String power;

    public Hero(int health, int damage, String power) {
        this.health = health;
        this.damage = damage;
        this.power = power;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth(){
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

    public String getPower() {
        return this.power;
    }
}
