package homework_foor;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{ new Dog("Бобик"), new Cat("мурка"),new Animal("Лошадь"),
                new Animal("Корова"),new Animal("Баран"),new Dog("Рекс")
        };
        int anim=0;
        int dog=0;
        int cat=0;
        for (Animal animal:animals){
            animal.Ran(150);
            animal.Swim(5);

            if(animal.getAnimal().equals("Animal")){
                anim++;
            }
            if(animal.getAnimal().equals("Dog")){
                dog++;
            }
            if(animal.getAnimal().equals("Cat")){
                cat++;
            }
        }
        System.out.println("кількість собак "+dog);
        System.out.println("кількість кошек "+cat);
        System.out.println("кількість інших тварин "+anim);
    }
}
