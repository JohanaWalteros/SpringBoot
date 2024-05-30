package com.riwi.beautySalon.api.dto.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppoinmetnReq {
    @NotBlank(message = "Debe de ingresar fecha y hora")
    @FutureOrPresent(message = "La fecha no puede del pasado")
    private LocalDateTime dataTime;
    @NotNull(message = "La duración es requerida")
    @Min(value = 10, message = "La duración no puede ser menor a 10 min")
    @Max(value = 720, message = "")
    private Integer duration;
    private String comments;
    @NotBlank(message = "Debe de ingresar el ID del cliente")
    @Min(value = 1, message = "El ID debe de ser mayor a cero")
    private long clientId;
    @NotBlank(message = "Debe de ingresar el ID del empleado")
    @Min(value = 1, message = "El ID debe de ser mayor a cero")
    private Long employeeId;
    @NotBlank(message = "Debe de ingresar el ID del servicio")
    @Min(value = 1, message = "El ID debe de ser mayor a cero")
    private Long serviceId; 
}
