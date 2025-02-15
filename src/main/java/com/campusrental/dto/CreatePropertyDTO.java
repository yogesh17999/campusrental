package com.campusrental.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePropertyDTO {

    private String address;
    private String eirCode;
    private int capacity;
    private double rentalCost;
    private List<TenantDTO> tenants;
}
