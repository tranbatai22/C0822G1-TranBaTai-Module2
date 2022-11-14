package models;

import java.util.Date;

public class Customer extends Person {
    private int customerCode;
    private String typeOfGuest;
    private String address;

    public Customer(String name, String date, String sex, int CMND, int phone, String email) {
        super(name, date, sex, CMND, phone, email);
    }

    @Override
    public String getInfo() {
        return null;
    }
}