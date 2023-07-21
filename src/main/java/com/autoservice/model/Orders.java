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
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToOne(fetch = FetchType.LAZY)
    private Automobile automobile;

    @ManyToOne
    @JoinColumn(name = "executor_id")
    private Executor executor;

    @OneToMany(mappedBy = "orders", cascade = CascadeType.REMOVE)
    private List<OrderServices> orderServices;

    private String receiptDate;

    private String etc;

}
