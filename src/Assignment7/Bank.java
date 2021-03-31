package Assignment7;

import javax.swing.*;
import java.util.Locale;
import java.io.*;


public class Bank {
    public static void main(String[] args) {

        User[] user = new User[4]; // Only 4 Users have Account

        //Declaring and Intializing each Account
        user[0] = new User(1,"Parvathy","Harikumar", "PARVATHY_HARIKUMAR", 8000.00);
        user[1] = new User(2,"Harry","Potter", "HARRY_POTTER", 9971.29);
        user[2] = new User(3, "Pepper", "Potts", "PEPPER_POTTS", 9929292.92);
        user[3] = new User(4, "Tony","Stark","TONY_STARK",4492.99);

        //Creating separate text file for each account holder.
        for(int i =0; i<4; i++) {
            try {
                String filename = user[i].firstName+user[i].lastName+".txt";
                FileWriter myWriter = new FileWriter(filename);
                String text= "Name : "+ user[i].firstName+" " + user[i].lastName+"\n" +
                                        "Current Balance: "+ user[i].getBalance();
                myWriter.write(text);
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

        //For dialog box.
    JFrame choice;
        choice=new JFrame();

        int userId = Integer.parseInt(JOptionPane.showInputDialog(choice, "Enter Your ID:"));
        String userName = JOptionPane.showInputDialog(choice, "Enter Your Username:");
        String pass = JOptionPane.showInputDialog(choice, "Enter Your Password:");
        String cred = userName+"_"+pass;
        System.out.println(cred);
        if ((user[userId-1].getCredential()).equals(cred)){
            int inputUpdate = JOptionPane.showConfirmDialog(null, "Do you want to add money to your account");
            if(inputUpdate==0){
                double amount = Double.parseDouble(JOptionPane.showInputDialog(choice, "Enter the amount you want to add:"));
                user[userId-1].update(amount);
                user[userId-1].display();
                try {
                    String filename = user[userId-1].firstName+user[userId].lastName+".txt";
                    FileWriter myWriter = new FileWriter(filename);
                    String text= "Name : "+ user[userId-1].firstName+" " + user[userId].lastName+"\n" +
                            "Current Balance: "+ user[userId-1].getBalance();
                    myWriter.write(text);
                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
            int inputDebit = JOptionPane.showConfirmDialog(null, "Do you want to draw money to your account");
            if(inputDebit==0){
                double amount = Double.parseDouble(JOptionPane.showInputDialog(choice, "Enter the amount you want to withdraw:"));
                user[userId-1].reduce(amount);
                user[userId-1].display();
                try {
                    String filename = user[userId-1].firstName+user[userId-1].lastName+".txt";
                    FileWriter myWriter = new FileWriter(filename);
                    String text= "Name : "+ user[userId-1].firstName+" " + user[userId-1].lastName+"\n" +
                            "Current Balance: "+ user[userId-1].getBalance();
                    myWriter.write(text);
                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
            int inputDisplay = JOptionPane.showConfirmDialog(null, "Do you want to view account details");
            if(inputDisplay==0){
                user[userId].display();
                try {
                    String filename = user[userId-1].firstName+user[userId-1].lastName+".txt";
                    FileWriter myWriter = new FileWriter(filename);
                    String text= "Name : "+ user[userId-1].firstName+" " + user[userId-1].lastName+"\n" +
                            "Current Balance: "+ user[userId-1].getBalance();
                    myWriter.write(text);
                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }


        }
        else{
            // if credentials are wrong
            JFrame f;
            f=new JFrame();
            JOptionPane.showMessageDialog(f,"Error!! Credentials or id wrong!!","Error",JOptionPane.WARNING_MESSAGE);

        }



    }
}
