package com.riwi.beautySalon.api.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AppoinmentResp {
    private Long id;
    private LocalDateTime dataTime;
    private Integer duration;
    private String comments;
    private ClientBasicResp client; //Va a mostrar el cliente
    private EmployeeResp employee; //El empleado 
    private ServiceResp service; //El servicio que va a usar
}
