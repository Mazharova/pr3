package p2;

public class Shape {
    private String name;
    private String color;
    private int size;
    public Shape (String name, String color, int size){
        this.name=name;
        this.color=color;
        this.size=size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
         this.color=color;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size=size;
    }
    @Override
    public String toString() {
        return ("Имя: " + name +'\n' +
                "Цвет:" + color +'\n' +
                "Размер:" + size );
    }
}
