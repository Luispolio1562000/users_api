package com.qrsof.users_api.models;

import jakarta.persistence.*;

import java.util.Date;

//Se determina como clase madre.
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    protected Long id;
    @Column(columnDefinition = "DATE", nullable = false, updatable = false)
    protected Date createdDate;
    @Column(columnDefinition = "DATE", nullable = false, updatable = false)
    protected Date updatedDate;

    @PrePersist
    protected void onCreate() {
        updatedDate = new Date();
        if (createdDate == null) {
            createdDate = new Date();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
