package homework.five.two;

public class Cat implements Member{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Cat "+name + " is Run");
    }

    @Override
    public void jump() {
        System.out.println("Cat "+name + " is Jump");
    }

    @Override
    public void overcome(Obstacle obstacle) {
        switch (obstacle) {
            case Wall -> {
                System.out.print("Obstacle "+obstacle.name()+" -> ");
                jump();
            }
            case RunningTrack -> {
                System.out.print("Obstacle "+obstacle.name()+" -> ");
                run();
            }
        }
    }
}
