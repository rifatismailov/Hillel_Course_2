package homework.five.two;

public class Robot implements Member {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run(int size) {
        System.out.println("Robot " + name + " is not Run. he will walk " + size + " m. He is a robot vacuum cleaner");
    }

    @Override
    public void jump(int size) {
        System.out.println("Robot " + name + " is not Jump. " + size + "m is very high for him. He is a robot vacuum cleaner");
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
