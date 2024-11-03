package com.dynoware.cargosafe.platform.paymentCards.interfaces.rest.transform;

import com.dynoware.cargosafe.platform.paymentCards.domain.model.commands.CreatePaymentCardCommand;
import com.dynoware.cargosafe.platform.paymentCards.interfaces.rest.resources.CreatePaymentCardResource;

public class CreatePaymentCardCommandFromResourceAssembler {
    public static CreatePaymentCardCommand toCommandFromResource(CreatePaymentCardResource resource) {
        return new CreatePaymentCardCommand(resource.cardNumber(), resource.expiryDate(), resource.securityCode());
    }
}
