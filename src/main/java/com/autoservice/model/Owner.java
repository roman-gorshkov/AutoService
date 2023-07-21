package com.autoservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "owner")
public class Owner extends User {

    private Long passport;

    private Long driverLicense;

    private String numberOfPhone;

    private String etc;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.REMOVE)
    private List<Orders> orders;

}
