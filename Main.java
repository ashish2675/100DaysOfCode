package advJava;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.UnknownHostException;
//import java.net.URL;
//
//public class Main {
//    public static void main(String[] args) throws Exception {
////        URL url = new URL("http", "hostman", 80, "index.html");
////        URL url = new URL("http://hostman:80/index.html");
//        URL url = new URL("jar:http://hostname/my.jar!/");
//        System.out.println("" + url);
//    }
//}


// important code
//public class Main{
//    public static void main(String[] args) {
//        try{
//            Socket socket = new Socket("192.2.1.168", 23);
//        }catch(UnknownHostException e){
//            System.out.println(e);
//        }catch (IOException e2){
//            System.out.println(e2);
//        }
//    }
//}

// 3rd code
//public class Main{
//    public static void main(String[] args) throws Exception {
//
//        Socket s = new Socket("127.0.0.1", 0);
//        System.out.println(s.getPort());
//    }
//}
public class Main extends Thread {
    public static void main(String[] args) {
        Main obj = new Main();
//        Thread thread = new Thread();
        obj.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}