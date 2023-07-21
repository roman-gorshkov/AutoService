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
@Table(name = "executor")
public class Executor extends User{

    private String jobTitle;

    @OneToMany(mappedBy = "executor", cascade = CascadeType.REMOVE)
    private List<Orders> orders;
}
