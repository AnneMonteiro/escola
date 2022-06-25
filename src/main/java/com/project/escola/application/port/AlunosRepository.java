package com.project.escola.application.port;

import com.project.escola.domain.entity.AlunosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlunosRepository extends JpaRepository<AlunosEntity, Integer> {

        Optional<AlunosEntity> findByCpf(String cpf);

}
