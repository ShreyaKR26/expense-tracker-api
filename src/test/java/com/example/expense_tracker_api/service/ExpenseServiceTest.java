package com.example.expense_tracker_api.service;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.expense_tracker_api.model.Expense;
public class ExpenseServiceTest {
 @Test
    void testCreateExpenseObject() {
        Expense expense = new Expense();

        expense.setId(1L);
        expense.setTitle("Lunch");
        expense.setAmount(250.0);
        expense.setCategory("Food");
        expense.setDate(LocalDate.now());

        assertEquals("Lunch", expense.getTitle());
        assertEquals(250, expense.getAmount());
        assertEquals("Food", expense.getCategory());
    }

    @Test
    void testExpenseAmount() {
        Expense expense = new Expense();

        expense.setAmount(500.0);

        assertEquals(500, expense.getAmount());
    }

    @Test
    void testExpenseCategory() {
        Expense expense = new Expense();

        expense.setCategory("Travel");

        assertEquals("Travel", expense.getCategory());
    }

    @Test
    void testExpenseId() {
        Expense expense = new Expense();

        expense.setId(10L);

        assertEquals(10L, expense.getId());
    }

    @Test
    void testExpenseTitle() {
        Expense expense = new Expense();

        expense.setTitle("Movie Ticket");

        assertEquals("Movie Ticket", expense.getTitle());
    }
}
