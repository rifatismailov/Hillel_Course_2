package homework_foor;

/**
 * 1. Створити порожній проект в IntelliJ
 * 2. Створити класи Собака та Кіт з успадкуванням від класу Тварини.
 * 3. Всі тварини можуть бігти та плисти. Як параметр кожному методу передається довжина перешкоди.
 * Результатом виконання дії буде друк у консоль. (Наприклад, dogBobik.run(150); -> 'Бобік пробіг 150 м');
 * 4. Кожна тварина має обмеження на дії (біг: кіт 200 м., собака 500 м.; плавання: кіт не вміє плавати, собака 10 м.).
 * 5. * Додати підрахунок створених котів, собак та тварин.
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(int ran) {
        System.out.println(name + " пробіг " + ran + " м");
    }

    public void swim(int swim) {
        System.out.println(name + " проплив " + swim + " м");

    }

    public String getAnimal() {
        return "Animal";
    }

}
