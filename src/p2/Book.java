package p2;

public class Book {
    private String name;
    private String color;
    private int pages;

    public Book (String name, String color, int pages){
        this.name=name;
        this.color=color;
        this.pages=pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Имя='" + name + '\'' +
                ", Цвет='" + color + '\'' +
                ", Страницы=" + pages +
                '}';
    }
}
