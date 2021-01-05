import java.util.ArrayList;

public class HelloWorld {

     public static void main(String args[]) {
         
        ArrayList<String> text = new ArrayList<String>();
        
        text.add("H");
        text.add("e");
        text.add("l");
        text.add("l");
        text.add("o");
        text.add(" ");
        text.add("W");
        text.add("o");
        text.add("r");
        text.add("l");
        text.add("d");
        text.add("!");
        
        for (String theElement: text) {
            System.out.print(theElement);
        }
        
     }
}
