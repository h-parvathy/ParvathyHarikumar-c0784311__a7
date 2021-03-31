package Assignment7;

import javax.swing.*;
import java.util.Locale;
import java.io.*;


public class Bank {
    public static void main(String[] args) {

        User[] user = new User[4];

        user[0] = new User(1,"Parvathy","Harikumar", "PARVATHY_HARIKUMAR", 8000.00);
        user[1] = new User(2,"Harry","Potter", "HARRY_POTTER", 9971.29);
        user[2] = new User(3, "Pepper", "Potts", "PEPPER_POTTS", 9929292.92);
        user[3] = new User(4, "Tony","Stark","TONY_STARK",4492.99);

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

    JFrame choice;
        choice=new JFrame();

        int userId = Integer.parseInt(JOptionPane.showInputDialog(choice, "Enter Your ID:"));
        String userName = JOptionPane.showInputDialog(choice, "Enter Your Username:");
        String pass = JOptionPane.showInputDialog(choice, "Enter Your Password:");
        String cred = userName+"_"+pass;
        System.out.println(cred);
        if ((user[userId].getCredential()).equals(cred)){
            int inputUpdate = JOptionPane.showConfirmDialog(null, "Do you want to add money to your account");
            if(inputUpdate==0){
                double amount = Double.parseDouble(JOptionPane.showInputDialog(choice, "Enter the amount you want to add:"));
                user[userId].update(amount);
                user[userId].display();
                try {
                    String filename = user[userId].firstName+user[userId].lastName+".txt";
                    FileWriter myWriter = new FileWriter(filename);
                    String text= "Name : "+ user[userId].firstName+" " + user[userId].lastName+"\n" +
                            "Current Balance: "+ user[userId].getBalance();
                    myWriter.write(text);
                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
            int inputDebit = JOptionPane.showConfirmDialog(null, "Do you want to draw money to your account");
            if(inputDebit==0){
                double amount = Double.parseDouble(JOptionPane.showInputDialog(choice, "Enter the amount you want to add:"));
                user[userId].reduce(amount);
                user[userId].display();
                try {
                    String filename = user[userId].firstName+user[userId].lastName+".txt";
                    FileWriter myWriter = new FileWriter(filename);
                    String text= "Name : "+ user[userId].firstName+" " + user[userId].lastName+"\n" +
                            "Current Balance: "+ user[userId].getBalance();
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
                    String filename = user[userId].firstName+user[userId].lastName+".txt";
                    FileWriter myWriter = new FileWriter(filename);
                    String text= "Name : "+ user[userId].firstName+" " + user[userId].lastName+"\n" +
                            "Current Balance: "+ user[userId].getBalance();
                    myWriter.write(text);
                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }


        }
        else{
            JFrame f;
            f=new JFrame();
            JOptionPane.showMessageDialog(f,"Error!! Credentials or id wrong!!","Error",JOptionPane.WARNING_MESSAGE);

        }



    }
}
