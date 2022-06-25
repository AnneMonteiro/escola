package com.project.escola.application.mapper;

import com.project.escola.application.dto.response.AlunosResponseDTO;
import com.project.escola.domain.entity.AlunosEntity;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface AlunosToAlunosResponseDTO {

    AlunosResponseDTO modelToResponse(AlunosEntity alunos);
}
