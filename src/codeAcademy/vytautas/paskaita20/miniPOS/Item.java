package codeAcademy.vytautas.paskaita20.miniPOS;

import lombok.Data;

import java.math.BigDecimal;

@Data
class Item {
    private String name;
    private String barCode;
    private BigDecimal price;
}
