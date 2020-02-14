package designpatterm.creational.prototype;

public class Movie implements PrototypeCapable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Movie clone() throws CloneNotSupportedException {
        System.out.println("Cloning movie object");
        return (Movie) super.clone();
    }


    @Override
    public java.lang.String toString() {
        return "movie";
    }
}
