package CodeAcademy.Vytautas.paskaita20.miniPOS;

import lombok.Data;

@Data
class Client {
    private String name;
    private String surname;
    private Float code;
    private genders gender;
    enum genders {
        MALE,
        FEMALE,
    }
}
