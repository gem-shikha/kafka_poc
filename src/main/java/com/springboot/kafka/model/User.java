package com.springboot.kafka.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private String name;
    private String dept;
    private Long salary;

}
