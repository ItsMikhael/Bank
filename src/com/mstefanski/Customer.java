package com.mstefanski;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer() {
        this("Unknown name", 0.0);
    }

    public Customer(String customerName) {
        this(customerName, 0.0);
    }

    public Customer(String customerName, double initialTransaction) {
        this.customerName = customerName;
        this.transactions.add(initialTransaction);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }
}
