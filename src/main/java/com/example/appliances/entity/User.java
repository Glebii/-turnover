package com.example.appliances.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "use")
public class User extends Audit<String> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, unique = true)
    String pin;
    @Column(nullable = false)
    String surname;
    @Column(nullable = false)
    String name;
    @Column
    String patronymic;
    @Column
    String position;

    @ManyToMany
    @JoinTable(name = "use_organizations",
            joinColumns = @JoinColumn(name = "use_id"),
            inverseJoinColumns = @JoinColumn(name = "organizations_id"))
    List<Filial> filials;
    @Column(nullable = false)
    String phone;
    String email;
    @Column(nullable = false)
    String password;
    @ManyToMany(fetch = FetchType.EAGER)
    List<Role> roles;
    @Column(columnDefinition = "boolean default true")
    Boolean isActive;



    public String getFIO() {
        if (this.patronymic == null)
            return this.surname + " " + this.name;
        else
            return this.surname + " " + this.name + " " + this.patronymic;
    }

}
