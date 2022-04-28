package com.crud.crudbook.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Vendor")
@Table(name = "Vendor")
@Data
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer number;
    private Integer address;
}
