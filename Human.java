package p3;

public class Human {
    private int head;
    private int leg;
    private int hand;

    public Human (int head, int leg, int hand){
        this.head=head;
        this.leg=leg;
        this.hand=hand;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Голова='" + head + '\'' +
                ", Рука='" + hand + '\'' +
                ", Нога=" + leg +
                '}';
    }
}