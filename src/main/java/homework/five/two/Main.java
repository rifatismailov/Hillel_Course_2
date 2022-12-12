package homework.five.two;

public class Main {
    public static void main(String[] args) {
        Member[] members = new Member[]{new People("Bob"), new Cat("Murzik"), new Robot("R2 D2")};
        for (Member member : members) {
            member.overcome(Obstacle.Wall, 2);
            member.overcome(Obstacle.RunningTrack, 2000);
            System.out.println();
        }
    }
}
