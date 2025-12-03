package com.praticando.controledegastos.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GastoRequestDTO {

    private Long id_categoria;
    private String descricao;
    private double valor;
    private LocalDate data;
}
