package com.riwi.beautySalon.api.dto.request;

import jakarta.validation.constraints.Email;
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
public class ClientReq {
    @NotBlank(message = "Debe de ingresar un nombre")
    @Size(
        min = 1, 
        max = 100, 
        message = "El nombre debe de tener entre 0 y 100 caracteres")
    private String firstName;
    @NotBlank(message = "Debe de ingresar un apellido")
    @Size(
        min = 1, 
        max = 100, 
        message = "El apellido debe de tener entre 0 y 100 caracteres")
    private String lastName;
    @Size(
        min = 10, 
        max = 20,
        message = "El número telefonico debe tener entre 10 y 20 caracteres")
    private String phone;
    @Email(message = "El email no es valido")
    @Size(
        min = 5, 
        max = 100,
        message = "El email debe tener entre 5 y 100 caracteres"
    )
    private String email;

}
