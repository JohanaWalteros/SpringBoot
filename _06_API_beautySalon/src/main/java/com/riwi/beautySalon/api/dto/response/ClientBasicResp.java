package com.riwi.beautySalon.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ClientBasicResp {
    private long id;
    private String name; 
    private String lastName; 
    private String phone;
    private String email;
}
