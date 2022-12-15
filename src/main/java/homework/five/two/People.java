package homework.five.two;

public class People implements Member {
    private String name;
    Obstacle obstacle;

    public People(String name) {
        this.name = name;
    }

    @Override
    public void run(int size) {
        if (size < 3000) {
            System.out.println("People " + name + " will Run " + size + " m");
        } else {
            System.out.println("People " + name + " won't Run. He will get tired of running very far.");
        }
    }

    @Override
    public void jump(int size) {
        if (size < 3) {
            System.out.println("People " + name + " will Jump " + size + " m");
        } else {
            System.out.println("People " + name + " won't Jump " + size + "m is very high for him.");
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
