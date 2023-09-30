package strings;

public class Stream {
    public static void main(String[] args) {
//        skip("", "baccdah");
//        System.out.println(skip("baccdah"));
        System.out.println(skipApple("baccappledah"));
        System.out.println(skipAppNotApple("baccappledah"));

    }



    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }

    static String skip(String up){
        if(up.isEmpty()){
//            System.out.println(p);
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip( up.substring(1));
        }else{
           return ch + skip(up.substring(1));
        }
    }
    static String skipApple(String up){
        if(up.isEmpty()){
//            System.out.println(p);
            return"";
        }

        char ch = up.charAt(0);

        if(up.startsWith("apple")){
            return skipApple( up.substring(5));
        }else{
            return up.charAt(0) + skipApple( up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        if(up.isEmpty()){
//            System.out.println(p);
            return"";
        }

        char ch = up.charAt(0);

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipApple( up.substring(3));
        }else{
            return up.charAt(0) + skipApple( up.substring(1));
        }
    }
}
