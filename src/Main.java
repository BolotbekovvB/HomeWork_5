// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}public class Main {
    public static void main(String[] args) {
     Hero mag = new Hero(200,20,"Magical");
        System.out.println("MAG - "+ "HEALTH:" + mag.getHealth() + " , " +
                "DAMAGE: " + mag.getDamage() + " , SUPERPOWER:" + mag.getSuperpower());
        Hero knight = new Hero(350,15);
        System.out.println("KNIGHT - "+ "HEALTH:" + knight.getHealth() + " , " +
                "DAMAGE: " + knight.getDamage());

        System.out.println("---------------");

     Boss boss = new Boss();
     boss.setHealth(1000);
     boss.setDamage(60);
     boss.setProtection("Magical");
        System.out.println("BOSS - " + "HEALTH:" + boss.getHealth() + " , " +
                "DAMAGE:" + boss.getDamage() + " , " + "PROTECTION:" + boss.getProtection());
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("HEALTH:" + createHeroes()[i].getHealth() + " , " + "DAMAGE:" + createHeroes()[i].getDamage() + " , " + "SUPERPOWER:" + createHeroes()[i].getSuperpower());
        }

    }
    public static Hero[] createHeroes() {
        Hero Berserk = new Hero(400,30);
        Hero Golem = new Hero(600,10);
        Hero Vampir = new Hero(300,18,"Vampirism");
        Hero[] heroes = {Berserk,Golem,Vampir};
        return heroes;
    }
}
