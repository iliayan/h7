public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean isNew;

    // Конструктор №1
    public Car(String brand, String model, int year, double price, boolean isNew) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isNew = isNew;
    }

    // Конструктор №2 (задаємо деякі значення за замовчуванням)
    public Car(String brand, String model) {
        this(brand, model, 0, 0.0, false);
    }

    // Гетери і сетери
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    // Метод toString для виведення інформації про об'єкт
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }
}