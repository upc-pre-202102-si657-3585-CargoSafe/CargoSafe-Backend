package com.dynoware.cargosafe.platform.trips.domain.services;

import com.dynoware.cargosafe.platform.trips.domain.model.aggregates.Alert;
import com.dynoware.cargosafe.platform.trips.domain.model.queries.GetAlertByIdQuery;
import com.dynoware.cargosafe.platform.trips.domain.model.queries.GetAllAlertQuery;

import java.util.List;
import java.util.Optional;

public interface AlertQueryService {

    Optional<Alert> handle(GetAlertByIdQuery query);

    List<Alert> handle(GetAllAlertQuery query);
}
