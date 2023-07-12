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
public class InstallationOfSpareParts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "installation_of_spare_parts", cascade = CascadeType.REMOVE)
    private List<NewSpareParts> newSpareParts;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
