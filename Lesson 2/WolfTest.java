public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "Мужской";
        wolf.name = "Фенрир";
        wolf.weight = 60;
        wolf.age = 6;
        wolf.color = "черный";

        System.out.print("Пол: " + wolf.sex + "; кличка: " + wolf.name);
        System.out.print("; вес: " + wolf.weight + "; возраст: " + wolf.age);
        System.out.print("; окрас: " + wolf.color + "\n");

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}