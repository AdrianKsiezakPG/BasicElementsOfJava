package pl.ksiezak.adrian.java.recap.jdbc;

public class Element {
    private int numer;
    private String name;

    public Element(int numer, String name) {
        this.numer = numer;
        this.name = name;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Element{" +
                "numer=" + numer +
                ", name='" + name + '\'' +
                '}';
    }
}
