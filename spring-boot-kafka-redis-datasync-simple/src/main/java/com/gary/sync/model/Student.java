package com.gary.sync.model;

import lombok.Data;

import java.io.Serializable;

/**
 * student
 * @author
 */
@Data
public class Student implements Serializable {
    private Long id;

    private String name;

    private Integer age;

    private static final long serialVersionUID = 1L;
}
