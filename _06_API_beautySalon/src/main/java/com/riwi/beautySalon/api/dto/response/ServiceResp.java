package com.riwi.beautySalon.api.dto.response;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceResp {
    private long id;
    private String name;
    private String description; 
    private BigDecimal price; 
}
