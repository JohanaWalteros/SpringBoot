package com.riwi.beautySalon.api.dto.request;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ServiceReq {
    @NotBlank(message = "Debe de ingresar un nombre")
    @Size(
        min = 1, 
        max = 100, 
        message = "El nombre debe de tener entre 0 y 100 caracteres")
    private String name;
    private String description;
    @NotBlank(message = "El precio es requerido")
    @DecimalMin(
        value = "0,01",
        message = "El valor del servicio debe de ser mayor a cero"
    )
    private BigDecimal price;
}
