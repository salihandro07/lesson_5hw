public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(150);
        boss.setDefenceType("Shield");

        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenceType());


        Hero[] heroes = createHeroes();
        System.out.println("Heroes Information:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() +
                    ", Damage: " + hero.getDamage() +
                    ", Super Power: " + hero.getPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, 65, "Fireball");
        Hero hero2 = new Hero(350, 60);
        Hero hero3 = new Hero(300, 70, "Ice Blast");

        return new Hero[]{hero1, hero2, hero3};
    }
}