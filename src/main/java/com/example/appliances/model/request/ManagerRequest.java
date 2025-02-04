package com.example.appliances.model.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ManagerRequest {
    String name;
    String surname;
    String patronymic;
    Long filialId;
    String phoneNumber;
}
