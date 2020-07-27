package com.emailapp.model;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int defaultPassLenght=8;
    private int mailBoxCapacity;
    private String alternateEmail;
    private String companyName="peace.com";

    //Setting the constructor
    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        /**
         *set department
         **/
        this.department=setDepartment();

        /**
         *generate random password
         **/
        this.password=getPassword(defaultPassLenght);
        System.out.println("Your Password is:"+this.password);

        /**
         * generate email
         **/
        this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+this.department.toLowerCase()+"."+companyName;
    }

    /**
     * Ask for Department
    **/
    private String setDepartment(){
        System.out.println("New Joinee:"+this.firstName+".\nEnter Department Code\n1.Sales\n2.Development\n3.Accounting\n0.None\nEnter Code:");
        Scanner sc=new Scanner(System.in);
        int code=sc.nextInt();
        switch (code){
            case 1:
                return "Sales";
            case 2:
                return "Dev";
            case 3:
                return "Acct";
            default:
                return "";
        }
    }

    /**
     * Generate Random password
    **/
    private String getPassword(int defaultLength){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[]password=new char[defaultLength];
        for (int i = 0; i <defaultLength ; i++) {
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String showInfo() {
        return "Name:"+this.firstName+
                "\nEmail:"+this.email+
                "\nMailBoxCapacity:"+this.mailBoxCapacity+"mb";
    }
}
