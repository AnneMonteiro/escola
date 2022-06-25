package com.project.escola.adapter;

import com.project.escola.application.dto.request.AlunosRequestDTO;
import com.project.escola.application.dto.response.AlunosResponseDTO;
import com.project.escola.application.service.AlunosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Component
@RequestMapping("/alunos")
public class AlunosController {

    @Autowired
    private AlunosService alunosService;

    @PostMapping
    public ResponseEntity<AlunosResponseDTO> salvarAluno(@RequestBody @Valid AlunosRequestDTO alunosRequestDTO) {
        return alunosService.salvarAluno(alunosRequestDTO);
    }
}
