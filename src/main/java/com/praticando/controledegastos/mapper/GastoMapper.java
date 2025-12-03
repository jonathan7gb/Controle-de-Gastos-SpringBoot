package com.praticando.controledegastos.mapper;

import com.praticando.controledegastos.dto.GastoRequestDTO;
import com.praticando.controledegastos.dto.GastoResponseDTO;
import com.praticando.controledegastos.entity.CategoriaGasto;
import com.praticando.controledegastos.entity.Gasto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GastoMapper {

    Gasto toEntity(GastoRequestDTO gastoRequestDTO, CategoriaGasto categoriaGasto);

    @Mapping(source = "categoria.nome_categoria", target = "nome_categoria")
    GastoResponseDTO toResponse(Gasto gasto);
}
