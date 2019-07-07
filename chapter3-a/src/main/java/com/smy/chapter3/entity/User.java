package com.smy.chapter3.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class User implements Serializable {

    private static final long serialVersionUID = 828127845307958831L;

    private Long id;
}
