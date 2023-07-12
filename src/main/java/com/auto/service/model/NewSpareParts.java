package com.auto.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewSpareParts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nameOfProduct;

    private String price;

    private String guarantee;

    @ManyToOne
    @JoinColumn(name = "instalation_of_spare_parts_id")
    private InstallationOfSpareParts installationOfSpareParts;

}
