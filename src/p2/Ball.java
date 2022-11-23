package p2;

public class Ball {
    private String name;
    private int size;
    public Ball (String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return ("Имя:"+ name +'\n'+
                "Размер:" + size + '\n');
    }
}
