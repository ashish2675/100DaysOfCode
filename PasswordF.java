package advJava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PasswordF extends JFrame {
    JLabel l1;
    JPasswordField k1;
    JComboBox cb;
    JTextArea a1;
    JPanel jp;
    PasswordF(){
        setSize(400,400);
        setBackground(Color.BLUE);
        setVisible(true);
        a1 = new JTextArea(5,10);
        jp = new JPanel();
        String Country[] = {"USA", "India", "Japan", "Pakistan"};
        cb = new JComboBox(Country);
        l1 = new JLabel("Enter the password");
        k1 = new JPasswordField();
        setLayout(new FlowLayout());
        add(l1);add(k1);add(jp);jp.add(a1);add(cb);
    }
    public static void main(String args[]){
        PasswordF obj = new PasswordF();
    }
}
