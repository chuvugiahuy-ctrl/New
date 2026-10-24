
package Test;

public class Computer {
    private int number;
    private String manufacturer;
    private int year;
    private double price;
    public Computer() {
        number = 0;
        manufacturer = "Unknown";
        year = 0;
        price = 0.0;
    }
    // 1
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        }
    }
    // 2
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        if (manufacturer != null && !manufacturer.trim().isEmpty()) {
            this.manufacturer = manufacturer;
        }
    }
    // 3
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        }
    }
    // 4
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
    // 5
    public void displayInfo() {
        System.out.println("Computer Number: " + number);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}
