package com.myfunds.fds.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalesChannel {

    private String cid;
    private String name;
    private String organization;

    private String province;
    private String city;
    private String zip;
    private String address;

    private String phoneNumber;

    private String openHours;

    private BigDecimal longitude;
    private BigDecimal latitude;
}