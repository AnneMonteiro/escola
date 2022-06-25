package com.project.escola.application.service;

import com.project.escola.application.dto.request.AlunosRequestDTO;
import com.project.escola.application.dto.response.AlunosResponseDTO;
import com.project.escola.application.exception.CpfJaCadastradoException;
import com.project.escola.application.port.AlunosRepository;
import com.project.escola.domain.entity.AlunosEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlunosService {

    @Autowired
    private AlunosRepository alunosRepository;

    public AlunosService(AlunosRepository alunosRepository){
        this.alunosRepository = alunosRepository;
    }

    public ResponseEntity<AlunosResponseDTO> salvarAluno(AlunosRequestDTO alunosRequestDTO) {
        Optional<AlunosEntity> testecpf = alunosRepository.findByCpf(alunosRequestDTO.getCpf());
        if (testecpf.isPresent()){
        throw new CpfJaCadastradoException("CPF já cadastrado no sistema", alunosRequestDTO.getCpf());

        }else {
            AlunosEntity alunosEntity = new AlunosEntity (alunosRequestDTO.getNome(),
                    alunosRequestDTO.getIdade(),
                    alunosRequestDTO.getCpf(),
                    alunosRequestDTO.getEndereco(),
                    alunosRequestDTO.getTelefone(),
                    alunosRequestDTO.getTurno());
            alunosRepository.save(alunosEntity);
            return ResponseEntity.ok().body(new AlunosResponseDTO(alunosEntity));
        }
    }
}
