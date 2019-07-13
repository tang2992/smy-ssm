package com.smy.chapter1.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Integer id;
    private String name;
}
