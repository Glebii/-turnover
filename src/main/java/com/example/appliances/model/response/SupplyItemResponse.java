package com.example.appliances.model.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SupplyItemResponse {
     Long id;
     ProductResponse product;
//     SupplyResponse supply;
     int quantity;
}
