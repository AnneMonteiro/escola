package com.project.escola.application.exception;

public class CpfJaCadastradoException extends RuntimeException {

    public CpfJaCadastradoException(String message, String cpf) {
        super(message);
    }
}
