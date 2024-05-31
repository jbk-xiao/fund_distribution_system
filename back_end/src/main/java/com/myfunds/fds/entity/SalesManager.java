package com.myfunds.fds.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalesManager {
    private String mid;
    private String name;
    private String mail;
    private String lid;
    private String team;
    private String leader;

    private Integer channelNum;
    private Integer visitNum;
}
