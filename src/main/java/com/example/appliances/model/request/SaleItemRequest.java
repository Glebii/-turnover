package com.example.appliances.model.request;

import com.example.appliances.entity.Product;
import com.example.appliances.entity.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SaleItemRequest {
    String name;

    Long productId;


//    Long saleId;
LocalDateTime schedule;
    Integer quantity;
    Long clientId;

    Double totalPrice;

    Integer numberNakladnoy;
    String address;
//    Long userId;




}