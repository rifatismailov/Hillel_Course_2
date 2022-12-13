package homework.five.two;

public class Robot implements Member {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Robot " + name + " is not Run. He is a robot vacuum cleaner");
    }

    @Override
    public void jump() {
        System.out.println("Robot " + name + " is not Jump. He is a robot vacuum cleaner");
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
