package com.workwell.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "compensations")
public class Compensation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "compensation_id")
    private Long compensationId;

    @Column(name = "uid")
    private Long uid;

    @Column(name = "compensation_type")
    private String compensationType;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "description")
    private String  description;
}
