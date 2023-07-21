package com.autoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "automobile")
public class Automobile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String markOfAutomobile;

    private String licensePlate;

    private String technicalPassport;

    private String colorAuto;

    private Integer yearOfIncrease;

    private String numberOfEngine;

    private String vINNumber;

    private String etc;

    @OneToOne(fetch = FetchType.LAZY)
    private Orders orders;

}
