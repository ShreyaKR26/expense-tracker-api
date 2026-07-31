package com.example.expense_tracker_api.service;
import com.example.expense_tracker_api.model.Expense;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpenseService {
 private static final String FILE_NAME = "expenses.json";

    private final ObjectMapper objectMapper;

    public ExpenseService() {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
    }

    private List<Expense> readExpenses() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try {
            return objectMapper.readValue(
                    file,
                    new TypeReference<List<Expense>>() {}
            );
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private void writeExpenses(List<Expense> expenses) {
        try {
            objectMapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File(FILE_NAME), expenses);
        } catch (IOException e) {
            throw new RuntimeException("Error writing expenses to file");
        }
    }

    public Expense addExpense(Expense expense) {
        List<Expense> expenses = readExpenses();

        long nextId = expenses.stream()
                .mapToLong(Expense::getId)
                .max()
                .orElse(0) + 1;

        expense.setId(nextId);

        expenses.add(expense);

        writeExpenses(expenses);

        return expense;
    }

    public List<Expense> getAllExpenses() {
        return readExpenses();
    }

    public List<Expense> getExpensesByCategory(String category) {
        return readExpenses().stream()
                .filter(expense ->
                        expense.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public double getTotalExpenses() {
        return readExpenses().stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public double getTotalByCategory(String category) {
        return readExpenses().stream()
                .filter(expense ->
                        expense.getCategory().equalsIgnoreCase(category))
                .mapToDouble(Expense::getAmount)
                .sum();
    }

    public void deleteExpense(Long id) {
        List<Expense> expenses = readExpenses();

        expenses.removeIf(expense ->
                expense.getId().equals(id));

        writeExpenses(expenses);
    }
    public Expense getExpenseById(Long id) {
    return readExpenses().stream()
            .filter(expense -> expense.getId().equals(id))
            .findFirst()
            .orElse(null);
}
}
