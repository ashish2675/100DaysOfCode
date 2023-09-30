package advJava;

import javax.swing.*;
import java.awt.*;


class SimpleDialog{

    public static void main(String args[]){
        JFrame frame = new JFrame("Main Window");

        JOptionPane.showMessageDialog(frame, "Message for the dialog box goes here.","Error", JOptionPane.ERROR_MESSAGE);

        frame.setSize(350,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class PopupMenuExample extends Frame
{
    PopupMenu popupMenu;
    public PopupMenuExample()
    {
        setLayout(new FlowLayout());
        popupMenu = new PopupMenu();
        popupMenu.add(new MenuItem("Cut"));
        popupMenu.addSeparator();
        popupMenu.add(new MenuItem("Cut"));
        popupMenu.addSeparator();
        popupMenu.add(new MenuItem("paste"));
        add(popupMenu);
        setTitle("PopupMenu in Java Example");
        setSize(300,120);
        setVisible(true);
        popupMenu.show(this,100,100);
    }
}
class PopupMenuJavaExample
{
    public static void main(String[] args)
    {
        PopupMenuExample frame = new PopupMenuExample();
    }
}