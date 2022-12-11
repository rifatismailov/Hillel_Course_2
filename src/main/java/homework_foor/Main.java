package homework_foor;

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
                animal.Ran(230);
                animal.Swim(15);
                System.out.println();
            }
            if (animal.getAnimal().equals("Dog")) {
                dog++;
                animal.Ran(250);
                animal.Swim(8);
                System.out.println();
            }
            if (animal.getAnimal().equals("Cat")) {
                cat++;
                animal.Ran(210);
                animal.Swim(5);
                System.out.println();
            }
        }
        System.out.println("кількість собак " + dog);
        System.out.println("кількість кошек " + cat);
        System.out.println("кількість інших тварин " + anim);
    }
}
