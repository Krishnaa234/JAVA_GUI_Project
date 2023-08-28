package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JButton login, signup, clear;
    JTextField cardtext;
    JPasswordField pintext; //not visible entered number but like * is visible instead
    
    Login() {
        setTitle("ATM");
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); //fetch the image on that address
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT); //get the image i1 to i2 so that it can get scaled or resized
        //can not pass image i2 to JLabel without converting it into ImageIcon
        ImageIcon i3 = new ImageIcon(i2); //image i2 to ImageIcon i3
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100); //custom the size
        add(label); //added label on frame 
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("OSWARD", Font.BOLD, 38));
        text.setBounds(200, 40,400, 40);
        add(text);
        
        JLabel cardno = new JLabel("Card Number:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150,300, 40);
        add(cardno);
        
        cardtext = new JTextField();
        cardtext.setBounds(350, 160, 250, 30);
        cardtext.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardtext);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220,250, 30);
        add(pin);
        
        pintext = new JPasswordField();
        pintext.setBounds(350, 220, 250, 30);
        pintext.setFont(new Font("Arial", Font.BOLD, 14));
        add(pintext);
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this); //to catch the event of the button
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this); //to catch the event of the button
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this); //to catch the event of the button
        add(signup);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480); //frame dimensions are set
        setVisible(true);
        setLocation(350, 200); //display frame at this coordinate
    }
    
    public void actionPerformed(ActionEvent ae){
        //to catch which button is pressed or clicked
        if(ae.getSource() == clear) {
            cardtext.setText("");
            pintext.setText("");
        }
        else if(ae.getSource() == login) {
            Conn conn = new Conn();//establish conn between database
            String cardnumber = cardtext.getText();
            String pinnumber = pintext.getText(); //pin number is not a text field but a password field
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";//DML Data Manupulation query now we'll set the text for database
            try{
                ResultSet rs = conn.s.executeQuery(query); //taking the value if present then in rs
                if(rs.next()) {
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true); //sending pin value in transaction constructor
                } else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        
        }
        else if(ae.getSource() == signup) {
            setVisible(false);
            //now open the sigup frame and close the login frame
            //create object of sigup class and it will be called by constructor after object formation
            new SignupOne().setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new Login(); //anonomous object which calls the constructor after formation 
    }
}