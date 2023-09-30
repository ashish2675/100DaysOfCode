package advJava;//package advJava;
//
//public class Employee {
//    public static void main(String[] args) {
//
//    }
//}

import java.util.Scanner;
class JBeans implements java.io.Serializable{
    private String name;
    private String dept;
    JBeans(){}
    public void setn(String name, String dept){
        this.name=name;
        this.dept=dept;
    }
    public String getn(){
        return name;
    }
    public String getD(){
        return dept;
    }}
class Employee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        JBeans obj= new JBeans();
        String n=sc.nextLine();
        String d=sc.nextLine();
        obj.setn(n,d);
        System.out.println("Name: "+ obj.getn());
        System.out.println("Department: "+ obj.getD());
    }
}