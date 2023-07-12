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
public class Order  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToOne(fetch = FetchType.LAZY)
    private Automobile automobile;

    @ManyToOne
    @JoinColumn(name = "executor_id")
    private Executor executor;

    private String receiptDate;

    private String etc;

    @OneToMany(mappedBy = "order_id", cascade = CascadeType.REMOVE)
    private List<OrderServices> orderServices;

}
