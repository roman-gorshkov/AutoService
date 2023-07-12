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
public class OrderServices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "order_services", cascade = CascadeType.REMOVE)
    private List<TypeOfWork> typeOfWorks;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;



}
