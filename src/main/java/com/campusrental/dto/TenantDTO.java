package com.campusrental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TenantDTO {
    private String name;
    private String email;
    private String phoneNumber;
}
