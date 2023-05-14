package com.beverageStock.dealer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Dealer")
public class Dealer {

    @Id private int id;
    private String dealerName;
    private String address;
    private String phoneNo;
    private String item;
    private double itemPrice;
    private int quantity;
    private double total;
}
