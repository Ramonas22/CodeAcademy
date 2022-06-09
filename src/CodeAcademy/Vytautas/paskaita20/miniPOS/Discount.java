package CodeAcademy.Vytautas.paskaita20.miniPOS;

import lombok.Data;

import java.time.LocalDateTime;

@Data
class Discount {
    private String name;
    private Integer discountPercent;
    private String barCode;
    private LocalDateTime activationDate;
    private LocalDateTime endDate;
}
