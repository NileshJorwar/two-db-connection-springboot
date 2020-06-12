package com.nilesh.twodbconnectspringboot.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "userclass")
public class UserClass {
    @Id
    private long id;
    private String nameOfUser;

    public UserClass(String nameOfProduct) {
        this.nameOfUser = nameOfProduct;
    }
}
