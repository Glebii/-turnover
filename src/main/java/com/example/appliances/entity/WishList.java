package com.example.appliances.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

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
public class WishList extends Audit<String> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Boolean isServed;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    Storage storage;

    @OneToMany(mappedBy = "wishList", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WishListItem> wishListItems = new ArrayList<>();
}
