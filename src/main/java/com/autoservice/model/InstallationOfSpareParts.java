package com.autoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "installation_of_new_spare_parts")
public class InstallationOfSpareParts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "installationOfSpareParts", cascade = CascadeType.REMOVE)
    private List<NewSpareParts> newSpareParts;

    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;

}
