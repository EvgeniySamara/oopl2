import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Cat cat4 = new Cat("Barsik", 5);
        Cat cat1 = new Cat("Tom", 15);
        Cat cat2 = new Cat("Kot", 25);
        Cat cat3 = new Cat("Koshak", 25);
        Plate plate = new Plate(50);
        plate.info();
        // cat1.eat(plate);
        // plate.info();
        // System.out.println(cat1.getHungry());

        ArrayList<Cat> catlist  = new ArrayList<>();
        catlist.add(cat4);
        catlist.add(cat1);
        catlist.add(cat2);
        catlist.add(cat3);

        for (Cat cat : catlist) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println("Остаток");
        plate.info();
        System.out.println();
        System.out.println("пробуем добавить отрицательное количество еды");
        plate.setFood(-10);
        plate.info();
        System.out.println("пробуем добавить еды");
        plate.setFood(50);
        plate.info();

    }
}