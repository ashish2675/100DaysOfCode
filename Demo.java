package advJava;

import java.awt.*;
import java.awt.event.*;


// import java.

class Demo extends Frame implements ActionListener{
    Button b1, b2, b3, b4;
    TextField t1, t2;
    Demo(){
        b1 = new Button("Green");
        b2 = new Button("Red");
        b3 = new Button("Yellow");
        b4 = new Button("Close");
        setSize(200, 200);
        setVisible(true);
        t1 = new TextField();
        t2 = new TextField();
        setBackground(Color.BLUE);
        setLayout(new FlowLayout());
        add(b1);add(b2);add(b3);add(b4);add(t1);add(t2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            setBackground(Color.GREEN);
        }else if (e.getSource() == b2){
            setBackground(Color.RED);
        }else if(e.getSource() ==b3){
            setBackground(Color.YELLOW);
        }else if(e.getSource() == b4){
            dispose();
        }
    }

    public static void main(String[]args){
        Demo obj = new Demo();
    }
}