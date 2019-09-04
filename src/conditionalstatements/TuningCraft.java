package conditionalstatements;

public class TuningCraft {

    public static void main(String[] args) {

        String modelName = "Extravagant"; int modelYear = 1999;
        if ( ((modelName=="Extravagant") && (modelYear>=1999 && modelYear<=2002) ) || ( (modelName=="Guzzler") && (modelYear>=2004 && modelYear<=2007 )) ) {
            System.out.println("RECALL");
        }
    }
}
