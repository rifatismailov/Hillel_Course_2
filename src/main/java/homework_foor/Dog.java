package homework_foor;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int ran) {
        if (ran < 500) {
            System.out.println(getName() + " пробіг " + ran + " м");
        } else {
            System.out.println(getName() + " не пробіг " + ran + " м дуже богато для собак");
        }
    }

    @Override
    public void swim(int swim) {
        if (swim < 10) {
            System.out.println(getName() + " проплив " + swim + " м");
        } else {
            System.out.println(getName() + " не проплила " + swim + " м вона потонула");
        }
    }

    @Override
    public String getAnimal() {
        return "Dog";
    }
}
