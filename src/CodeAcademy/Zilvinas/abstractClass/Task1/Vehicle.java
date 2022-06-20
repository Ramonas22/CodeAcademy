package CodeAcademy.Zilvinas.abstractClass.Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class Vehicle {
    private LocalDate registrationDate;
    private String color;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    abstract void drive();

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = LocalDate.parse(registrationDate.toString(), formatter);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
