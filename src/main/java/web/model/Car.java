package web.model;

public class Car {
    private String color;
    private String country;
    private int year;

    public Car(String color, String country, int year) {
        this.color = color;
        this.country = country;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                '}';
    }
}
