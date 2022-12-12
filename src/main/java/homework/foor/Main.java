package homework.foor;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Dog("Бобик"), new Cat("мурка"), new Animal("Лошадь"),
                new Animal("Корова"), new Animal("Баран"), new Dog("Рекс")
        };
        int anim = 0;
        int dog = 0;
        int cat = 0;
        for (Animal animal : animals) {
            if (animal.getAnimal().equals("Animal")) {
                anim++;
                animal.run(230);
                animal.swim(15);
                System.out.println();
            }
            if (animal.getAnimal().equals("Dog")) {
                dog++;
                animal.run(250);
                animal.swim(8);
                System.out.println();
            }
            if (animal.getAnimal().equals("Cat")) {
                cat++;
                animal.run(210);
                animal.swim(5);
                System.out.println();
            }
        }
        System.out.println("кількість собак " + dog);
        System.out.println("кількість кошек " + cat);
        System.out.println("кількість інших тварин " + anim);
    }
}
