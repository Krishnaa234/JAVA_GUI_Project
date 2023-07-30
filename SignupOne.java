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
        
        JLabel personalDeatils = new JLabel("Page 1: Personal Deatils"); //a random number
        personalDeatils.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDeatils.setBounds(280, 80, 400, 30);
        add(personalDeatils);
        
        JLabel name = new JLabel("Name: "); //a random number
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        JTextField nameText = new JTextField();
        nameText.setFont(new Font("Raleway", Font.BOLD, 20));
        nameText.setBounds(300, 140, 400, 30);
        add(nameText);
        
        JLabel fname = new JLabel("Father's Name: "); //a random number
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        JTextField fnameText = new JTextField();
        fnameText.setFont(new Font("Raleway", Font.BOLD, 20));
        fnameText.setBounds(300, 190, 400, 30);
        add(fnameText);
        
        JLabel dob = new JLabel("Date of Birth: "); //a random number
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        JLabel gender = new JLabel("Gender: "); //a random number
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        JLabel email = new JLabel("Email Address: "); //a random number
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        JTextField emailText = new JTextField();
        emailText.setFont(new Font("Raleway", Font.BOLD, 20));
        emailText.setBounds(300, 340, 400, 30);
        add(emailText);
        
        JLabel marital = new JLabel("Marital Status: "); //a random number
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        JLabel address = new JLabel("Address: "); //a random number
        address.setFont(new Font("Raleway", Font.BOLD, 22));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        JTextField addressText = new JTextField();
        addressText.setFont(new Font("Raleway", Font.BOLD, 20));
        addressText.setBounds(300, 440, 400, 30);
        add(addressText);
        
        JLabel city = new JLabel("City: "); //a random number
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        JTextField cityText = new JTextField();
        cityText.setFont(new Font("Raleway", Font.BOLD, 20));
        cityText.setBounds(300, 490, 400, 30);
        add(cityText);
        
        JLabel state = new JLabel("State: "); //a random number
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        JTextField stateText = new JTextField();
        stateText.setFont(new Font("Raleway", Font.BOLD, 20));
        stateText.setBounds(300, 540, 400, 30);
        add(stateText);
        
        JLabel pincode = new JLabel("PIN Code: "); //a random number
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        JTextField pinText = new JTextField();
        pinText.setFont(new Font("Raleway", Font.BOLD, 20));
        pinText.setBounds(300, 540, 400, 30);
        add(pinText);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    public static void main(String args[]) {
        new SignupOne();
    }
}
