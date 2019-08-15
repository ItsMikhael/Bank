package com.mstefanski;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addBranch(Branch branch) {
        this.branches.add(branch);
    }

    public void addCustomer(Branch branch, String customerName, double initialAmount) {
        int index = this.branches.indexOf(branch);
        this.branches.get(index).addCustomer(customerName, initialAmount);
    }

    public void addTransaction(Branch branch, Customer customer, double transaction) {
        int branchIndex = this.branches.indexOf(branch);
        int customerIndex = this.branches.get(branchIndex).getCustomers().indexOf(customer);
        this.branches.get(branchIndex).getCustomers().get(customerIndex).addTransaction(transaction);
    }

    public void showBranchesCustomers(Branch branch) {
        int index = this.branches.indexOf(branch);
        for(int i=0; i<this.branches.get(index).getCustomers().size(); i++) {
            System.out.println(this.branches.get(index).getCustomers().get(i).getCustomerName());
        }
    }

}
