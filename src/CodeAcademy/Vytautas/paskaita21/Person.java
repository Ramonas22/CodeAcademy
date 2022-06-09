package CodeAcademy.Vytautas.paskaita21;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Person {
    private String name;
    private String surname;
    private int birthdate;
    private double height;

    static void showAtributes(Person person){
        System.out.printf("\nName %s surname %s , age %d, height %.2fm", person.getName(), person.getSurname(), person.getBirthdate(), person.getHeight() );
    }
}
