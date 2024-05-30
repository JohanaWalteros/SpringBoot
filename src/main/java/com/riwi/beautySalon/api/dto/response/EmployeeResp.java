package com.riwi.beautySalon.api.dto.response;

import com.riwi.beautySalon.utils.enums.RoleEmployee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeResp {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private RoleEmployee role;
}
