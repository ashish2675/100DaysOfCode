package advJava;

import java.util.Scanner;

interface client{
    void input();
    void output();
}
class Raju implements client{

    String name; double sal;
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter Salary");
        sal = sc.nextDouble();

    }
    public void output(){
        System.out.println(name + " " + sal);
    }
}
public class Interface {
    public static void main(String[] args) {
        client c = new Raju();
        c.input();
        c.output();
    }
}


