package com.dynoware.cargosafe.platform.trips.application.internal.commandservices;

import com.dynoware.cargosafe.platform.trips.domain.model.aggregates.Expense;
import com.dynoware.cargosafe.platform.trips.domain.model.commands.CreateExpenseCommand;
import com.dynoware.cargosafe.platform.trips.domain.services.ExpenseCommandService;
import com.dynoware.cargosafe.platform.trips.infrastructure.persistence.jpa.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExpenseCommandServiceImpl implements ExpenseCommandService {
    private final ExpenseRepository expenseRepository;

    public ExpenseCommandServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Optional<Expense> handle (CreateExpenseCommand command) {
        var expense = new Expense(command);
        expenseRepository.save(expense);
        return Optional.of(expense);
    }
}
