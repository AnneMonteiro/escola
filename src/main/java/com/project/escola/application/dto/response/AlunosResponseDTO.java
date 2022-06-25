package com.project.escola.application.dto.response;

import com.project.escola.domain.entity.AlunosEntity;
import com.project.escola.domain.enums.Turno;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlunosResponseDTO {

    private String nome;

    private Integer idade;

    private String cpf;

    private String telefone;

    private String endereco;

    private Turno turno;

    public AlunosResponseDTO(AlunosEntity alunosEntity) {
        this.nome = alunosEntity.getNome();
        this.idade = alunosEntity.getIdade();
        this.cpf = alunosEntity.getCpf();
        this.telefone = alunosEntity.getTelefone();
        this.endereco = alunosEntity.getEndereco();
        this.turno = alunosEntity.getTurno();
    }
}
