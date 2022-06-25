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

    public AlunosEntity( String nome, Integer idade, String cpf, String telefone, String endereco, Turno turno) {
        this.id = getId();
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.turno = turno;
    }

}


