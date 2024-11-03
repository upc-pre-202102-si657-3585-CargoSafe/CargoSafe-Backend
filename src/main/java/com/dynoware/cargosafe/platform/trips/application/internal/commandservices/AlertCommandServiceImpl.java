package com.dynoware.cargosafe.platform.trips.application.internal.commandservices;

import com.dynoware.cargosafe.platform.trips.domain.model.aggregates.Alert;
import com.dynoware.cargosafe.platform.trips.domain.model.commands.CreateAlertCommand;
import com.dynoware.cargosafe.platform.trips.domain.services.AlertCommandService;
import com.dynoware.cargosafe.platform.trips.infrastructure.persistence.jpa.AlertRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlertCommandServiceImpl implements AlertCommandService {

    private final AlertRepository alertRepository;

    public AlertCommandServiceImpl(AlertRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    public Optional<Alert> handle(CreateAlertCommand command) {
        var alert = new Alert(command);
        alertRepository.save(alert);
        return Optional.of(alert);
    }
}

