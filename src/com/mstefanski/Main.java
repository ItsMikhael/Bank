package com.mstefanski;

public class Main {

    public static void main(String[] args) {

        Bank myBank = new Bank("Mikhaels Bank");
        System.out.println("Bank's name: " + myBank.getBankName());

        Branch branch = new Branch("First");
        myBank.addBranch(branch);
        System.out.println("Bank's name: " + myBank.getBankName() + " branch: " + branch.getBranchName());

        Customer customer = new Customer("Michal Stefanski");
        myBank.addCustomer(branch, "Dan Padalecki", 250.0);
        System.out.println(myBank.getBankName() + " branch " + branch.getBranchName() + " customers: ");
        myBank.showBranchesCustomers(branch);

    }
}
