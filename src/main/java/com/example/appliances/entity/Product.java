package com.example.appliances.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product extends Audit<String> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    Double price;

    String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    Status status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    ProductCategory productCategory;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn
    Image image;

}
