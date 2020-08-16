package com.spring.model;

public class Account {
    private Integer id;
    private String accountNumber;
    private String name;
    private String ifscCode;
    private String mobileNumber;

    public Account() {
    }

    public Account(String accountNumber, String name, String ifscCode, String mobileNumber) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.name = name;
        this.ifscCode = ifscCode;
        this.mobileNumber = mobileNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
