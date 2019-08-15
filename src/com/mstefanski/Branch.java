package com.mstefanski;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, 2500.0));
            return true;
        }
        return false;
    }



    public Customer findCustomer(String customerName) {
        for(int i=0; i<customers.size(); i++) {
            if(this.customers.get(i).getCustomerName().equals(customerName)) {
                return this.customers.get(i);
            }
        }
        return null;
    }

}
