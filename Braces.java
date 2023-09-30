//package accentureQ;
//
//public class Braces {
//    public static void main(String[] args) {
//        String str = "}}{}}}";
//
//        if (str.length()%2 == 0){
//            for (int i = 0; i < str.length()-1; i++) {
//                if(str.charAt(i) == '{'){
//                    for (int j = str.length()-1; j >= i; j--) {
//                        if (str.charAt(j) == '}') break;
//                    }
//                }
//               else System.out.println("Compilation error");
//
//            }
//            System.out.println("Successful");
//        }
//        else System.out.println("Compilation error");
//    }
//
//
//}


package accentureQ;

public class Braces {
    public static void main(String[] args) {
        String str = "{{}}{";

        if (str.length() % 2 == 0) {
            boolean isProperlyNested = checkProperlyNested(str);
            if (isProperlyNested) {
                System.out.println("Braces are properly nested.");
            } else {
                System.out.println("Braces are not properly nested.");
            }
        } else {
            System.out.println("Compilation error");
        }
    }

    public static boolean checkProperlyNested(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{') {
                count++;
            } else if (str.charAt(i) == '}') {
                count--;
            }
            if (count < 0) {
                return false; // Unmatched closing brace found
            }
        }
        return count == 0; // True if braces are properly nested
    }
}
