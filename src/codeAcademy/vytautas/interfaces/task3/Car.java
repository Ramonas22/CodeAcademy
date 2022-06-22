package codeAcademy.vytautas.interfaces.task3;

import org.jetbrains.annotations.NotNull;

class Car implements Comparable<Car>{
    private final String mark;
    private final Integer yearOfManufacture;

    Car(String mark, Integer yearOfManufacture){
        this.mark = mark;
        this.yearOfManufacture = yearOfManufacture;
    }


   /* @Override
    public int compareTo(@NotNull Car o) {
        if(mark.equalsIgnoreCase(o.mark)){
            return 0;
            // < 0 pagal ABC , > 0 nuo galo
        }else if(mark.compareToIgnoreCase(o.mark) < 0){
            return -1;
        }else {
            return 1;
        }
    }
    */
    @Override
    public int compareTo(@NotNull Car o) {
        if(yearOfManufacture.equals(o.yearOfManufacture)){
            return 0;
        }else if(yearOfManufacture > o.yearOfManufacture){
            return 1;
        }else {
            return -1;
        }
    }

    public String getMark() {
        return mark;
    }

    public Integer getYearOfManufacture() {
        return yearOfManufacture;
    }
}

