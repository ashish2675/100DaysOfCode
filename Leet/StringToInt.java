// My Code
class Solution{
  public static int myAtoi(String s) {
        int x = 0;

        for(int i= 0; i<s.length();i++){
            if(s.charAt(i) == '-' ){
                for (int j = i+1; j<s.length();j++){
                    x = (x*10) - (s.charAt(++i) - 48);
                }
                break;
            }else if(s.charAt(i) == ' ' || s.charAt(i) == 'a' || s.charAt(i) == 'b' || s.charAt(i) == 'c' || s.charAt(i) == 'd' || s.charAt(i) == 'e' || s.charAt(i) == 'f' || s.charAt(i) == 'g' || s.charAt(i) == 'h' || s.charAt(i) == 'i' || s.charAt(i) == 'j' || s.charAt(i) == 'k' || s.charAt(i) == 'l' || s.charAt(i) == 'm' || s.charAt(i) == 'n' || s.charAt(i) == 'o' || s.charAt(i) == 'p' || s.charAt(i) == 'q' || s.charAt(i) == 'r' || s.charAt(i) == 's' || s.charAt(i) == 't' || s.charAt(i) == 'u' || s.charAt(i) == 'v' || s.charAt(i) == 'w' || s.charAt(i) == 'x' || s.charAt(i) == 'y' || s.charAt(i) == 'z' || s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C' || s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F' || s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I' || s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L' || s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O' || s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S' || s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V' || s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z'){
                continue;
            }else if (s.charAt(i) != ' ' || s.charAt(i) != 'a' || s.charAt(i) != 'b' || s.charAt(i) != 'c' || s.charAt(i) != 'd' || s.charAt(i) != 'e' || s.charAt(i) != 'f' || s.charAt(i) != 'g' || s.charAt(i) != 'h' || s.charAt(i) != 'i' || s.charAt(i) != 'j' || s.charAt(i) != 'k' || s.charAt(i) != 'l' || s.charAt(i) != 'm' || s.charAt(i) != 'n' || s.charAt(i) != 'o' || s.charAt(i) != 'p' || s.charAt(i) != 'q' || s.charAt(i) != 'r' || s.charAt(i) != 's' || s.charAt(i) != 't' || s.charAt(i) != 'u' || s.charAt(i) != 'v' || s.charAt(i) != 'w' || s.charAt(i) != 'x' || s.charAt(i) != 'y' || s.charAt(i) != 'z' || s.charAt(i) != 'A' || s.charAt(i) != 'B' || s.charAt(i) != 'C' || s.charAt(i) != 'D' || s.charAt(i) != 'E' || s.charAt(i) != 'F' || s.charAt(i) != 'G' || s.charAt(i) != 'H' || s.charAt(i) != 'I' || s.charAt(i) != 'J' || s.charAt(i) != 'K' || s.charAt(i) != 'L' || s.charAt(i) != 'M' || s.charAt(i) != 'N' || s.charAt(i) != 'O' || s.charAt(i) != 'P' || s.charAt(i) != 'Q' || s.charAt(i) != 'R' || s.charAt(i) != 'S' || s.charAt(i) != 'T' || s.charAt(i) != 'U' || s.charAt(i) != 'V' || s.charAt(i) != 'W' || s.charAt(i) != 'X' || s.charAt(i) != 'Y' || s.charAt(i) != 'Z'){
                x = (x * 10) + (s.charAt(i) - 48);
            }
        }
        return x;
    }
}

// GpT Code
class Solution {
    public static int myAtoi(String s) {
    int x = 0;
    int sign = 1;
    boolean signFound = false;
    boolean digitsFound = false;

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (ch == '-' && !signFound && !digitsFound) {
            sign = -1;
            signFound = true;
        } else if (ch == '+' && !signFound && !digitsFound) {
            signFound = true;
        } else if (Character.isDigit(ch)) {
            digitsFound = true;
            int digit = ch - '0';
            // Check for overflow before updating x
            if (x > Integer.MAX_VALUE / 10 || (x == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            x = x * 10 + digit;
        } else if (ch != ' ' || digitsFound || signFound) {
            break;
        }
    }

    return x * sign;
}
}
