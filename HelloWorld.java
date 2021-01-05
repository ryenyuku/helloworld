import java.util.ArrayList;

public class HelloWorld {

    public static void main(String args[]) {
        ArrayList<String> text = new ArrayList<String>();
        
        text.add(getH());
        text.add(gete());
        text.add(getl1());
        text.add(getl2());
        text.add(geto());
        text.add(getspace());
        text.add(getW());
        text.add(geto());
        text.add(getr());
        text.add(getl3());
        text.add(getd());
        text.add(getexclamation_mark());
        
        for (String theElement: text) {
            System.out.print(theElement);
        }
    }
    
    public static String getH() {
         return new String("H");
    }
    
    public static String gete() {
         return new String("e");
    }
    
    public static String getl1() {
         return new String("l");
    }
    
    public static String getl2() {
         return new String("l");
    }
    
    public static String geto() {
         return new String("o");
    }
    
    public static String getspace() {
         return new String(" ");
    }
    
    public static String getw() {
         return new String("w");
    }
    
    public static String geto() {
         return new String("o");
    }
    
    public static String getr() {
         return new String("r");
    }
    
    public static String getl3() {
         return new String("l");
    }
    
    public static String getd() {
         return new String("d");
    }
    
    public static String getexclamation_mark() {
         return new String("!");
    }
}
