package p2;

public class Priut {
    public static void main(String[] args) {
        System.out.println("У нас в приюте живут:");
        PriutDogsNames Zaselenie = new PriutDogsNames("Vasya");
        System.out.println(Zaselenie.toString());
        Zaselenie.setName("Druzhok");
        System.out.println(Zaselenie.toString());
        Zaselenie.setName("Tim");
        System.out.println(Zaselenie.toString());
    }
}
