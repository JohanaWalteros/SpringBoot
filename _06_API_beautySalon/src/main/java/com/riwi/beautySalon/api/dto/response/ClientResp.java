package com.riwi.beautySalon.api.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ClientResp {
    private long id;
    private String name; 
    private String lastName; 
    private String phone;
    private String email;
    private List<AppoinmentBasicResp> appoinments;
}
