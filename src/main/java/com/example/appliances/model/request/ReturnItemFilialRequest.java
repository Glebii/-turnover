package com.example.appliances.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReturnItemFilialRequest {
    private UUID productId;
    private int quantity;
}
