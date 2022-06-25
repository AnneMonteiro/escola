package com.project.escola.application.mapper;


import com.project.escola.application.dto.request.AlunosRequestDTO;
import com.project.escola.domain.entity.AlunosEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AlunosToAlunosRequestDTO {

    AlunosRequestDTO modelToRequest(AlunosEntity alunos);
}
