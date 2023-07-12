package com.auto.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner extends User {

    private Long passport;

    private Long driverLicense;

    private String numberOfPhone;

    private String etc;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.REMOVE)
    private List<Order> order;

}
