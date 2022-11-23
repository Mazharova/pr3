package p2;

public class Dog {
    private String klichka;
    private int vozrast;
    public Dog (String klichka, int vozrast){
        this.klichka=klichka;
        this.vozrast=vozrast;
    }

    public String getKlichka() {
        return klichka;
    }

    public void setKlichka(String klichka) {
        this.klichka = klichka;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
    }
    public void newAge(){
        vozrast*=7;

    }


    @Override
    public String toString() {
        return "Dog{" +
                "Кличка ='" + klichka + '\'' +
                ", Возраст=" + vozrast +'\'' +
                ", Возраст в человеческих годах=" + vozrast*7 +
                '}';
    }
}
