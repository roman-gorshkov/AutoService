package com.auto.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeOfWork {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String workType;

    private String price;

    private String deadLine;

    private String guarantee;

    @ManyToOne
    @JoinColumn(name = "order_services_id")
    private OrderServices orderServices;

}
