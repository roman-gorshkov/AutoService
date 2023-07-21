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
@Table(name = "order_services")
public class OrderServices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "orderServices", cascade = CascadeType.REMOVE)
    private List<TypeOfWork> typeOfWorks;

    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;



}
