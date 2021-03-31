package Assignment7;

import javax.swing.*;

// Has user actions like updating, withdraw, check balance.
// Child of Account
public class User extends Account {
//    private float amount;

    public User(int id, String firstName, String lastName, String credential, double balance) {
        super(id, firstName, lastName, credential, balance);
//        this.amount = amount;
    }

//    public float getAmount() {
//        return amount;
//    }
//
//    public void setAmount(float amount) {
//        this.amount = amount;
//    }

    public void update(double amount){
        setBalance(getBalance()+amount);
        System.out.println(amount+ " has been credited to your account.\n"+
                "Your current balance is: \n\t "+ getBalance());
        JFrame f;
        f=new JFrame();
        JOptionPane.showMessageDialog(f,amount+ " has been credited to your account.\n"+
                "Your current balance is: \n\t "+ getBalance());
    }

    public void reduce(double amount){
        setBalance(getBalance()-amount);
        System.out.println(amount+ " has been debited from your account.\n"+
                "Your current balance is: \n\t "+ getBalance());
        JFrame f;
        f=new JFrame();
        JOptionPane.showMessageDialog(f,amount+ " has been debited from your account.\n"+
                "Your current balance is: \n\t "+ getBalance());
    }

    public void display(){
        System.out.println("The current balance is: \n\t "+ getBalance());
        JFrame f;
        f=new JFrame();
        JOptionPane.showMessageDialog(f,"Name : "+firstName+" "+lastName+"\n"+
                        "CUrrent Balance:" + getBalance()
                ,"Account Details",JOptionPane.WARNING_MESSAGE);

    }

}
