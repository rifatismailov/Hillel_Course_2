package homework_foor;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void Ran(int ran) {
        if (ran < 200) {
            System.out.println(getName() + " пробіг " + ran + " м");
        } else {
            System.out.println(getName() + " не пробіг " + ran + " м дуже богато для котів");
        }
    }

    @Override
    public void Swim(int swim) {
        System.out.println(getName() + " не вміє плавати ");

    }

    @Override
    public String getAnimal() {
        return "Cat";
    }
}
