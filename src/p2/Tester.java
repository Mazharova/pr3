package p2;

public class Tester {
    public static void main(String[] args) {
        Shape nape = new Shape("krug", "orange", 12);
        System.out.println(nape.getName());
        System.out.println(nape.toString());
        nape.setColor("green");
        System.out.println(nape.getColor());
        System.out.println(nape.getSize());

        Ball mall = new Ball("myach", 34);
        System.out.println(mall.getName());
        System.out.println(mall.getSize());
        System.out.println(mall.toString());

        Book muk = new Book("Prestuplenie i nakazanie", "blue", 204);
        System.out.println(muk.toString());

        Dog sok = new Dog("Druzhok",12);
        System.out.println(sok.toString());
    }
}
