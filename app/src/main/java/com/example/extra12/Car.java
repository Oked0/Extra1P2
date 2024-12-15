package com.example.extra12;

// Класс, реализующий интерфейс
public class Car implements Moveable {
    private String brand;
    private int year;

    // Конструктор
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Реализация метода интерфейса
    @Override
    public void go() {
        System.out.println("Car is moving...");
    }

    // Метод для получения строки с информацией о машине
    public String getInfo() {
        return "Brand: " + brand + ", Year: " + year;
    }
}
