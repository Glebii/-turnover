package com.example.appliances.model.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderResponse {
    Long id;

    String name;

    List<OrderItemResponse> orderItems;
    UserResponse user;
//    SystemStatus status;
    String comment;
    Date dateDelivery;
    String address;
    String phoneNumber;

    Double totalAmount;

    Date creationDate;

}
