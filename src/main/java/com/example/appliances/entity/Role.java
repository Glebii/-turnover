package com.example.appliances.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table
public class Role extends Audit<String> implements Serializable {
    @Id
    Long id;

    @Column(nullable = false, unique = true)
    @NonFinal
    String name;


    @ManyToMany(fetch = FetchType.EAGER)
    List<Permission> permissions = new ArrayList<>();
}
