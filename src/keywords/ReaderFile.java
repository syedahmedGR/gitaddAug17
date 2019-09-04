package keywords;

import java.io.BufferedReader;
import java.io.FileReader;


public class ReaderFile {

    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        // /Users/syedahmed/Documents/fileRead.txt
        // /Users/syedahmed/Documents/QA_Trg/JavaModules/javaprac/fileRead.txt
        String fileName =  "/Users/syedahmed/Documents/QA_Trg/JavaModules/javaprac/" +
                "fileRead.txt";  //"/documents/QA_Trg/Java Modules/javaprac/fileRead";
         //  /Users/syedahmed/Documents/QA_Trg/Java Modules/javaprac/javafiledemo.rtf
        try{
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String data = "";
            while ((data =  br.readLine())!= null) {
            System.out.println(data);
        }
        }catch (Exception ex){
           // ex.printStackTrace();
            System.out.println("File was not found");
        }
        finally {
            try {
                fr.close();
                br.close();
            } catch (Exception ex2){

            }
        }

    }
}
// there is a basic difference between final, finally and finalize ;

