package com.autoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "new_spare_parts")
public class NewSpareParts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameOfProduct;

    private String price;

    private String guarantee;

    @ManyToOne
    @JoinColumn(name = "installationOfSpareParts_id")
    private InstallationOfSpareParts installationOfSpareParts;

}
