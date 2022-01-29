package BankaProjesi2;

import java.util.Scanner;

public class Personel {

    private static Scanner scan;
    String name;
    String departman;
    double price;
    int workHours;
    int kidem;
    String systemUserName;
    String systemPassword;

    public Personel() {
    }

    public Personel(String name, String departman, double price, int workHours, int kidem, String systemUserName, String systemPassword) {
        this.name = name;
        this.departman = departman;
        this.price = price;
        this.workHours = workHours;
        this.kidem = kidem;
        this.systemUserName = systemUserName;
        this.systemPassword = systemPassword;
    }
}
