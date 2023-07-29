package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*; //import the random class

public class SignupOne extends JFrame{
    SignupOne() {
        //default layout is center alligned
        setLayout(null);
        
        Random ran = new Random();
        long random = Math.abs(ran.nextLong() % 9000L + 1000L); //get a long number but makes it short by mode % and addition 1000L and get absolute to neglect -ve number
        
        JLabel formno = new JLabel("APPLICATION FORM NO." + random); //a random number
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    public static void main(String args[]) {
        new SignupOne();
    }
}
