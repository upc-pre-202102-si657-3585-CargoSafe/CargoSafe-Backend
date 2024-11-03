package com.dynoware.cargosafe.platform.companies.domain.model.queries;

public record GetCompanieByIdQuery(Long id) {
    public GetCompanieByIdQuery {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("The id cannot be null");
        }
    }
}
