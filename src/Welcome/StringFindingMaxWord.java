package Welcome;

public class StringFindingMaxWord {

    public static void main(String[] args) {

        String longSentence = "The quick brown fox jumped over lazy dog";

        System.out.println( findLargestWord(longSentence));

    }

    public static String findLargestWord(String sentence){

        String[] words = sentence.split( " ");
        String largestWord ="";
        for(int i=0; i< words.length; i++){
            if ( largestWord.length() < words[i].length() ){
                largestWord = words[i];
            }
        }
        return largestWord;
    }
}
