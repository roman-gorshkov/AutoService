package com.auto.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Automobile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String markOfAutomobile;

    private String licensePlate;

    private String technicalPassport;

    private String colorAuto;

    private Integer yearOfIncrease;

    private String numberOfEngine;

    private String VINNumber;

    private String etc;

    @OneToOne(fetch = FetchType.LAZY)
    private Order order;

}
