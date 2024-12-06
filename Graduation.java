package graduation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Graduation extends Frame implements ActionListener
{
    Frame f1=new Frame ("Home page");
    Frame f2=new Frame ("Login page");
    Label name=new  Label ("User Name");
    Label pass=new Label ("Password");
    TextField tname=new TextField();
    TextField tpass=new TextField();
    Button sub=new Button("login");
  
    Graduation()
    {
        f1.setLayout (null);
        f1.setBounds (100,100,500,400);
        f1.setVisible(true);
        f2.setLayout (null);
        f2.setBounds (100,100,500,400);
        name.setBounds (100,100,100,30);
        pass.setBounds(100,150,100,30);
        tname.setBounds (210,100,100,30);
        tpass.setBounds(210,150,100,30);
       sub.setBounds (210,220,100,30);
        f1.add(name);
        f1.add (pass);
        f1.add(tname);
        f1.add(tpass);
        f1.add(sub);
        sub.addActionListener(this);
    } 

    public static void main(String[] args)
    {
       Graduation g=new Graduation();
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if (tname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter user name");
        }
        else if(tpass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter password");
        }
        else if(tname.getText().contains("X TEAM") && tpass.getText().contains("ABCM"))
        {
                    JOptionPane.showMessageDialog(null, "Login Successful");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "wrong user name or password!!!","Message",JOptionPane.ERROR_MESSAGE);
        }
    }
}