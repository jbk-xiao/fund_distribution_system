package com.myfunds.fds.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalesLeader {
    private String lid;
    private String name;
    private String mail;
    private String team;
}
