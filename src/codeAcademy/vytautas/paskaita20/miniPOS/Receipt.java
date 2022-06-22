package codeAcademy.vytautas.paskaita20.miniPOS;

import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;


@Data
class Receipt {
    private String receiptNO;
    private receiptTypes receiptType;
    private paymentStatus paymentStatus;
    private Client client;
    private ArrayList<Item>  items = new ArrayList<>();
    private BigInteger sum;

    Receipt(){
        this.client = new Client();
    }
    enum paymentStatus {
        PAID,
        NOT_PAID
    }
    enum receiptTypes {
        SALE,
        REFUND,
        Z_REPORT
    }
    private LocalDateTime paymentDate ;
}
