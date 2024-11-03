package com.dynoware.cargosafe.platform.companies.domain.model.commands;

public record DeleteCompanieCommand(Long id) {
    public DeleteCompanieCommand {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Companie ID is required");
        }
    }
}
