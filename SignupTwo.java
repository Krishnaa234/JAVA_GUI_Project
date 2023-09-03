package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField aadhar, pan ;
    JLabel additionalDeatils, city, name, fname, dob, gender, email, address, state, pincode;
    JButton next;
    JRadioButton syes, sno, eno, eyes; 
    JComboBox religion, category, occupation, education, income;
    String formno;
    
    SignupTwo(String formno) {
        this.formno = formno;
        //default layout is center alligned
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
              
        additionalDeatils = new JLabel("Page 2: Additional Deatils"); //a random number
        additionalDeatils.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDeatils.setBounds(280, 80, 400, 30);
        add(additionalDeatils);
        
        name = new JLabel("Religion: "); //a random number
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        //for a drop down menu JComboBox class is used
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
       
        
        fname = new JLabel("Category: "); //a random number
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        String valCategory[] = {"General", "SC", "ST", "OBC", "Others"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        dob = new JLabel("Income: "); //a random number
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String incomeCategory[] = {"NULL", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        gender = new JLabel("Educational "); //a random number
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        email = new JLabel("Qualification: "); //a random number
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        String educationValues[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel marital = new JLabel("Occupation: "); //a random number
        marital.setFont(new Font("Raleway", Font.BOLD, 22));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        
        String occupationValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        address = new JLabel("PAN Number: "); //a random number
        address.setFont(new Font("Raleway", Font.BOLD, 22));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        city = new JLabel("Aadhar Number: "); //a random number
        city.setFont(new Font("Raleway", Font.BOLD, 22));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        state = new JLabel("Senior Citizen: "); //a random number
        state.setFont(new Font("Raleway", Font.BOLD, 22));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup citizengroup = new ButtonGroup();
        citizengroup.add(syes);
        citizengroup.add(sno);
        
        pincode = new JLabel("Existing Account: "); //a random number
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existgroup = new ButtonGroup();
        existgroup.add(eyes);
        existgroup.add(eno);
        
        
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
        String sreligion = (String) religion.getSelectedItem(); //get the selected item from the combo box which return object therefore, typecaste the selected item into string
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        
        String seniorcitizen = null;
        if(syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if(eyes.isSelected()) {
            existingaccount = "Yes";
        } else if(eno.isSelected()) {
            existingaccount = "No";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try{
            //for adding data to mysql
            Conn c = new Conn(); 
            //query command "insert into table_row_name values(nin + mmo + ....)";
            String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+seniorcitizen+"', '"+existingaccount+"', '"+span+"', '"+saadhar+"')";
            c.s.executeUpdate(query); //runs query on mysql
            
            //Signup3 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        new SignupTwo("");
    }
}