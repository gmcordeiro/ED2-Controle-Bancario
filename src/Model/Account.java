/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Aluno
 */
public class Account {
    private int id;
    private String name;
    private String account;
    private String agency;
    private double balance;
    
    public Account(){
        this.id = 0;
        this.name = "";
        this.account = "";
        this.agency = "";
        this.balance = 0.00;
    }

    public Account(String name, String account, String agency, double balance) {
        this.id = 0;
        this.name = name;
        this.account = account;
        this.agency = agency;
        this.balance = balance;
    }
    
    
}
