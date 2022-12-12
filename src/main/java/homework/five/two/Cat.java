package homework.five.two;

public class Cat implements Member {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int size) {
        if (size < 1000) {
            System.out.println("Cat " + name + " will Run " + size + " m");
        } else {
            System.out.println("Cat " + name + " won't Run. He will get tired of running very far.");
        }
    }

    @Override
    public void jump(int size) {
        if (size < 2) {
            System.out.println("Cat " + name + " will Jump " + size + " m");
        } else {
            System.out.println("Cat " + name + " won't Jump " + size + "m is very high for him.");
        }
    }

    @Override
    public void overcome(Obstacle obstacle, int size) {
        switch (obstacle) {
            case Wall -> {
                System.out.print("Obstacle " + obstacle.name() + " -> ");
                jump(size);
            }
            case RunningTrack -> {
                System.out.print("Obstacle " + obstacle.name() + " -> ");
                run(size);
            }
        }
    }
}
