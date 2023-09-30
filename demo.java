import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class demo {
    // to handle exceptions include throws
    public static void main(String[] args)
    {
        List listOfStrings = new ArrayList<String>();

        BufferedReader bf = null;
        try {
            bf = new BufferedReader(
                    new FileReader("D:\\DSA\\wordFinder\\src\\res\\sample.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("");
        }

        if(bf != null) {
            String line = null;
            try {
                line = bf.readLine();
                while (line != null) {
                    listOfStrings.add(line);
                    line = bf.readLine();
                }
            } catch (IOException e) {
                System.out.println("");
            }
        }

        if(bf !=null) {
            try {
                bf.close();
            } catch (IOException e) {
                System.out.println("");
            }
        }

        //String[] array = listOfStrings.toArray(new String[0]);

        System.out.println(listOfStrings);

//        for (String str : listOfStrings) {
//            System.out.println(str);
//        }
    }
}