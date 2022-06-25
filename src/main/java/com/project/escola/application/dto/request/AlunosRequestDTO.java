package com.project.escola.application.dto.request;

import com.project.escola.domain.enums.Turno;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlunosRequestDTO {

    private String nome;

    private Integer idade;

    private String cpf;

    private String telefone;

    private String endereco;

    private Turno turno;
}
