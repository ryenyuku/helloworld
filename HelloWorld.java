import java.util.ArrayList;

public class HelloWorld {

    public static void main(String args[]) {
        ArrayList<String> text = new ArrayList<String>();
        
        text.add(getH());
        text.add(getE());
        text.add(getL1());
        text.add(getL2());
        text.add(getO());
        text.add(getBlank());
        text.add(getW());
        text.add(getO2());
        text.add(getR());
        text.add(getL3());
        text.add(getD());
        text.add(getEnd());
        
        for (String theElement: text) {
            System.out.print(theElement);
        }
    }
    
    public static String getH() {
         return "H";
    }
    
    public static String getE() {
         return "e";
    }
    
    public static String getL1() {
         return "l";
    }
    
    public static String getL2() {
         return "l";
    }
    
    public static String getO() {
         return "o";
    }
    
    public static String getBlank() {
         return " ";
    }
    
    public static String getW() {
         return "W";
    }
    
    public static String getO2() {
         return "o";
    }
    
    public static String getR() {
         return "r";
    }
    
    public static String getL3() {
         return "l";
    }
    
    public static String getD() {
         return "d";
    }
    
    public static String getEnd() {
         return "!";
    }
}
