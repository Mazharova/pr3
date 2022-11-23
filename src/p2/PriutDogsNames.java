package p2;

public class PriutDogsNames {
    private String name;

    public PriutDogsNames(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PriutDogsNames{" +
                "Имя собаки ='" + name + '\'' +
                '}';
    }
}