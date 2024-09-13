package com.qrsof.users_api.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name="permission")
@NoArgsConstructor
@AllArgsConstructor
public class Permission extends BaseEntity {

    @Column(name= "name_role")
    @Getter
    @Setter
    private String namePermission;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonProperty("role_id")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    @Getter @Setter
    private Role role;

    @Override
    public String toString() {
        return "Permission{" +
                "namePermission='" + namePermission + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permission that = (Permission) o;
        return Objects.equals(namePermission, that.namePermission) && Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePermission, role);
    }
}
