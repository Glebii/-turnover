package com.example.appliances.model.response;

import com.example.appliances.entity.Image;
import com.example.appliances.entity.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductResponse {
    UUID id;
    String name;
    Double price;
    String code;
    String description;
    ProductCategoryResponse productCategory;
    Status status;
    BrandResponse brand;
    ProducingCountryResponse producingCountry;
    List<String> photoPaths;
}
