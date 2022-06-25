package com.project.escola.domain.entity;

import com.project.escola.domain.enums.Turno;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "alunos")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlunosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    @Column
    private Integer idade;

    @Column
    private String cpf;

    @Column
    private String telefone;

    @Column
    private String endereco;

    @Column
    private Turno turno;

}


