package homework.five.two;

public class People implements Member {
    private String name;
    Obstacle obstacle;

    public People(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("People " + name + " is Run");
    }

    @Override
    public void jump() {
        System.out.println("People " + name + " is Jump");
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
