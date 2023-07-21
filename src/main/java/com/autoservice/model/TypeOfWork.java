package com.autoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "type_of_work")
public class TypeOfWork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workType;

    private String price;

    private String deadLine;

    private String guarantee;

    @ManyToOne
    @JoinColumn(name = "orderServices_id")
    private OrderServices orderServices;

}
