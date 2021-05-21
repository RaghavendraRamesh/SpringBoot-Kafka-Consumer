package com.dhrti.springbootkafkaconsumer.dto;

import lombok.Data;

@Data
public class CasesInfo {
    private final String country;
    private final String totalCases;
    private final String newCases;
    private final String totalDeaths;
    private final String newDeaths;
    private final String totalRecovered;
    private final String activeCases;
}
