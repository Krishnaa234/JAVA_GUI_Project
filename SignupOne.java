package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*; //import the random class
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JDateChooser dateChooser;
    JTextField nameText, fnameText, emailText, addressText, cityText, stateText, pinText;
    JLabel formno, personalDeatils, name, fname, dob, gender, email, address, city, state, pincode;
    JButton next;
    JRadioButton otherG, otherM, unmarried, married, male, female; 
    
    SignupOne() {
        //default layout is center alligned
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L + 1000L); //get a long number but makes it short by mode % and addition 1000L and get absolute to neglect -ve number
        
        formno = new JLabel("APPLICATION FORM NO." + random); //a random number
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        personalDeatils = new JLabel("Page 1: Personal Deatils"); //a random number
        personalDeatils.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDeatils.setBounds(280, 80, 400, 30);
        add(personalDeatils);
        
        name = new JLabel("Name: "); //a random number
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        nameText = new JTextField();
        nameText.setFont(new Font("Raleway", Font.BOLD, 20));
        nameText.setBounds(300, 140, 400, 30);
        add(nameText);
        
        fname = new JLabel("Father's Name: "); //a random number
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        fnameText = new JTextField();
        fnameText.setFont(new Font("Raleway", Font.BOLD, 20));
        fnameText.setBounds(300, 190, 400, 30);
        add(fnameText);
        
        dob = new JLabel("Date of Birth: "); //a random number
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);
        
        gender = new JLabel("Gender: "); //a random number
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.white);
        add(female);
        
        otherG = new JRadioButton("Other");
        otherG.setBounds(630, 290, 120, 30);
        otherG.setBackground(Color.white);
        add(otherG);
        
        ButtonGroup genderGroup = new ButtonGroup(); //so that only one button is checked between the male and female and other buttons
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(otherG);
        
        email = new JLabel("Email Address: "); //a random number
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        emailText = new JTextField();
        emailText.setFont(new Font("Raleway", Font.BOLD, 20));
        emailText.setBounds(300, 340, 400, 30);
        add(emailText);
        
        JLabel marital = new JLabel("Marital Status: "); //a random number
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.white);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        otherM = new JRadioButton("Other");
        otherM.setBounds(630, 390, 100, 30);
        otherM.setBackground(Color.white);
        add(otherM);
        
        ButtonGroup marriage = new ButtonGroup(); //so that only one button is checked between the married unmarried and other buttons
        marriage.add(married);
        marriage.add(unmarried);
        marriage.add(otherM);
        
        address = new JLabel("Address: "); //a random number
        address.setFont(new Font("Raleway", Font.BOLD, 22));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        addressText = new JTextField();
        addressText.setFont(new Font("Raleway", Font.BOLD, 20));
        addressText.setBounds(300, 440, 400, 30);
        add(addressText);
        
        city = new JLabel("City: "); //a random number
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        cityText = new JTextField();
        cityText.setFont(new Font("Raleway", Font.BOLD, 20));
        cityText.setBounds(300, 490, 400, 30);
        add(cityText);
        
        state = new JLabel("State: "); //a random number
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        stateText = new JTextField();
        stateText.setFont(new Font("Raleway", Font.BOLD, 20));
        stateText.setBounds(300, 540, 400, 30);
        add(stateText);
        
        pincode = new JLabel("PIN Code: "); //a random number
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        pinText = new JTextField();
        pinText.setFont(new Font("Raleway", Font.BOLD, 20));
        pinText.setBounds(300, 590, 400, 30);
        add(pinText);
        
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random; //long value to string
        String name = nameText.getText(); //get the value of nameText field
        String fname = fnameText.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else {
            gender = "Other";
        }
        
        String email = emailText.getText();
        String marital = null;
        if(married.isSelected()) {
            marital = "Married";
        } else if(unmarried.isSelected()) {
            marital = "Unmarried";
        } else {
            marital = "Other";
        }
        
        String address = addressText.getText();
        String city = cityText.getText();
        String state = stateText.getText();
        String pin = pinText.getText();
        
        try{
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } else if(fname.equals("")) {
                JOptionPane.showMessageDialog(null, "Father's name is required");
            } else if(dob.equals("")) {
                JOptionPane.showMessageDialog(null, "Date of Birth is required");
            } else if(gender.equals("")) {
                JOptionPane.showMessageDialog(null, "Gender is required");
            } else if(email.equals("")) {
                JOptionPane.showMessageDialog(null, "Email is required");
            } else if(marital.equals("")) {
                JOptionPane.showMessageDialog(null, "Marital status is required");
            } else if(address.equals("")) {
                JOptionPane.showMessageDialog(null, "Adderss is required");
            } else if(city.equals("")) {
                JOptionPane.showMessageDialog(null, "City is required");
            } else if(state.equals("")) {
                JOptionPane.showMessageDialog(null, "State is required");
            } else if(pin.equals("")) {
                JOptionPane.showMessageDialog(null, "PIN is required");
            } else {
                //for adding data to mysql
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                //queru command "insert into table_row_name values(nin + mmo + ....);
                c.s.executeUpdate(query); //runs query on mysql
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true); //created SignupTwo class object and visibility true with formnpo variable
                //using formno as the primary key to corelate signupone and signuptwo
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        new SignupOne();
    }
}