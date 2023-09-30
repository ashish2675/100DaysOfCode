import java.util.*;

class weightedSubstring{

    static int distinctSubString(String P, String Q,
                                 int K, int N)
    {

        HashSet<String> S = new HashSet<String>();


        for (int i = 0; i < N; ++i) {

            int sum = 0;


            String s = "";

            for (int j = i; j < N; ++j) {


                int pos = P.charAt(j) - 'a';


                sum += Q.charAt(pos) - '0';


                s += P.charAt(j);


                if (sum <= K) {
                    S.add(s);
                }

                else {
                    break;
                }
            }
        }


        return S.size();
    }


    public static void main(String[] args)
    {
        String P = "abcde";
        String Q = "12345678912345678912345678";
        int K = 6;
        int N = P.length();

        System.out.print(distinctSubString(P, Q, K, N));
    }
}

