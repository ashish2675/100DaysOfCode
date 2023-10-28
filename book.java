import java.util.*;
public class Book{
    String title;
    String author;
    String ISBN;
    Book(String t, String a,String I)
    {
        title=t;
        author=a;
        ISBN=I;
    }
    void dis()
    {
        System.out.print(title+"\n"+author+"\n"+ISBN+"\n-------------------\n");
    }
    void rem(Book[] b,int i,int n){
        if(i>=0&& i<n&& b[i]!=null)
        b[i]=null;
        else
        System.out.print("INVALID INDEX\n");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,index,ww=1,j=0,i=0,count=0;
        String x,y,z;
        System.out.print("Enter number of books\n");
        n=sc.nextInt();
        sc.nextLine();
        Book b[]=new Book[n];
        while(ww!=0)
        {
        System.out.print("1.Add\n2.Remove\n3.Display\n");
        int choice=sc.nextInt();
        sc.nextLine();
        if(choice==1){
        System.out.print("Enter title:");
        x=sc.nextLine();
        System.out.print("Enter author:");
        y=sc.nextLine();
        System.out.print("Enter ISBN:");
        z=sc.nextLine();
        b[j]=new Book(x,y,z);
        j++;
        count++;
        }
        else if(choice==2){
            System.out.print("Enter the index of book to remove starting from 0\n");
            index=sc.nextInt();
            if (index<count)
            b[index].rem(b,index,n);
            else
            System.out.println("Already empty");
        }
        else if(choice==3){
        for(i=0;i<n;i++)
        {
            if(b[i]!=null)
            b[i].dis();
            else
            System.out.println("slot "+i+" is Empty\n------------\nPlease  note the next index will remain same  i.e any other book will not be automatically be placed in slot emptied\n-------------\n");
        }
        }
        else
        {
            ww=0;
            System.out.print("INVALID\n");
        }
        }
    }
}
