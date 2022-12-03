package p3;

public class Circle {
    private String name;
    private int radius;
    private int ploshad;

    public Circle (String name, int radius, int ploshad){
        this.name=name;
        this.radius=radius;
        this.ploshad=ploshad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getPloshad() {
        return ploshad;
    }

    public void setPloshad(int ploshad) {
        this.ploshad = ploshad;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Имя ='" + name + '\'' +
                ", Радиус =" + radius +
                ", Площадь =" + ploshad +
                '}';
    }
}
