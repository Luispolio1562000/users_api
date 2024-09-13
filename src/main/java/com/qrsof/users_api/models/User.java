package com.qrsof.users_api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@Table(name = "users")
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {


    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    @Getter
    @Setter
    private Role role;
    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Column(name = "last_name")
    @Getter
    @Setter
    private String lastName;
    @Column(name = "email")
    @Getter
    @Setter
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "password")
    @Getter
    @Setter
    private String password;
    @Column(name = "phone")
    @Getter
    @Setter
    private String phone;
    @Column(name = "birth_day")
    @Getter
    @Setter
    private Date birthDay;


    public User(Long id, String name, String lastName, String email, String password, String phone, Date birthDay) {
        setId(id);
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.birthDay = birthDay;
    }


}
