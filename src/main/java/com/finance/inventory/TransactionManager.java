package com.finance.inventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.finance.models.Transaction;

public class TransactionManager {

	private List<Transaction> transactions; // Store all transactions
	private Map<String, Double> categoryBudgets; // Store budgets for each category (not used anymore)

	// Constructor
	public TransactionManager() {
		transactions = new ArrayList<>();
		categoryBudgets = new HashMap<>();
	}

	// Method to add a new expense
	public void addExpense(double amount, String description, String category) {
		// write your logic here
	}

	// Method to get the total expenses for a category
	private double getTotalExpensesForCategory(String category) {
		// write your logic here
		return 0;
	}

	// Method to update an existing transaction (expense)
	public void updateTransaction(int index, double amount, String description, String category) {
		// write your logic here
	}

	// Method to remove a transaction (expense)
	public void removeTransaction(int index) {
		// write your logic here
	}

	// Method to get the list of all transactions (expenses)
	public List<Transaction> getAllTransactions() {
		// write your logic here
		return null;
	}

	// Method to get the list of all transactions (expenses) for a specific category
	public List<Transaction> getTransactionsByCategory(String category) {
		// write your logic here
		return null;
	}

	// Method to get the balance (income minus total expenses)
	public double getBalance(double monthlyIncome) {
		// write your logic here
		return 0;
	}

	// Method to generate monthly expenses report
	public String generateMonthlyReport(int month, int year) {
		// write your logic here
		return null;
	}

	// Method to generate expense report by category
	public String generateExpenseByCategoryReport() {
		// write your logic here
		return null;
	}
}
