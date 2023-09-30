package advJava;

interface Client{
    void webDesign();
    void webDevelop();
}
abstract class Raj implements Client{
    @Override
    public void webDesign(){
        System.out.println("Green button, menu bar , exit");
    }
}
class Rahul extends Raj{
    @Override
    public void webDevelop(){
        System.out.println("Html, CSS, JavaScript");
    }
}
class Checking {
    public static void main(String[] args) {
        Rahul r = new Rahul();
        r.webDesign();
        r.webDevelop();
    }
}
