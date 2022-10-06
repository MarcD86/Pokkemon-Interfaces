import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private static final String type = "grass";

    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "electric" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with leafStorm " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "fire" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with leafStorm " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "water" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with leafStorm " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = enemy.getHp() - 10;
                System.out.println(name.getName() + " attacks with leafStorm " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };

    public void solarBeam(Pokemon name, Pokemon enemy){
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "electric" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with solarBeam " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "fire" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with solarBeam " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "water" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with solarBeam " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with solarBeam " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };

    public void leechSeed(Pokemon name, Pokemon enemy){
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "electric" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with leechSeed " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "fire" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with leechSeed " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "water" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with leechSeed " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with leechSeed " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };

    public void leaveBlade(Pokemon name, Pokemon enemy){
        int damage;
        int exponential;
        switch (enemy.getType()) {
            case "electric" -> {
                exponential = 3;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with leaveBlade " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "fire" -> {
                exponential = 2;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with leaveBlade " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            case "water" -> {
                exponential = 1;
                damage = 10 * exponential;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with leaveBlade " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
            default -> {
                damage = 10;
                enemy.setHp(enemy.getHp() - damage);
                System.out.println(name.getName() + " attacks with leaveBlade " + enemy.getName());
                System.out.println(enemy.getName() + " has now a hp of " + enemy.getHp());
            }
        }
    };



}