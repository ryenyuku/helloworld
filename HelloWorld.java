import java.util.*;

public class HelloWorld {

    public static void main(String args[]) {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        
        ArrayList<Object> text = new ArrayList<>();
        
        Map<Long, String> charMap = new HashMap<>();
        long idBucket = 0;

        charMap.put(idBucket++, getH());
        charMap.put(idBucket++, getE());
        charMap.put(idBucket++, getL1());
        charMap.put(idBucket++, getL2());
        charMap.put(idBucket++, getO());
        charMap.put(idBucket++, getBlank());
        charMap.put(idBucket++, getW());
        charMap.put(idBucket++, getO2());
        charMap.put(idBucket++, getR());
        charMap.put(idBucket++, getL3());
        charMap.put(idBucket++, getD());
        charMap.put(idBucket, getEnd());
        
        for (long ab = 0; ab <= idBucket; ab++) {
            text.add(charMap.get(ab));
        }
        
        Collections.reverse(text);
        Collections.reverse(text);
        Collections.reverse(text);
        Collections.reverse(text);
        Collections.reverse(text);
        Collections.reverse(text);
        Collections.reverse(text);
        Collections.reverse(text);
        Collections.reverse(text);
        Collections.reverse(text);
        
        ArrayList<Object> aaaaaaaaaaa = new ArrayList<>(text);
        text.clear();
        Collections.reverse(aaaaaaaaaaa);
        Collections.reverse(aaaaaaaaaaa);
        Collections.reverse(aaaaaaaaaaa);
        Collections.reverse(aaaaaaaaaaa);
        Collections.reverse(aaaaaaaaaaa);
        Collections.reverse(aaaaaaaaaaa);
        Collections.reverse(aaaaaaaaaaa);
        Collections.reverse(aaaaaaaaaaa);
        text.addAll(aaaaaaaaaaa);
        
        if (true) if (true) if (true) if (true) if (true) if (true) if (true) if (true) if (true) if (true) if (true) if (true) if (true) {
            for (long j = 0; j < text.size(); j++) {
                long h = 1;
                while((h == 1) == true) {
                    System.out.print((String)((String)((String)((String)text.get((int)j)))));
                    h = 0;
                }
            }
        }
    }
    
    public static String getH() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
         return (String)((Object)"H");
    }
    
    public static String getE() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
         return (String)((Object)"e");
    }
    
    public static String getL1() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
         return (String)((Object)"l");
    }
    
    public static String getL2() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
         return (String)((Object)"l");
    }
    
    public static String getO() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
         return (String)((Object)"o");
    }
    
    public static String getBlank() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
         return (String)((Object)" ");
    }
    
    public static String getW() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
         return (String)((Object)"W");
    }
    
    public static String getO2() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
         return (String)((Object)"o");
    }
    
    public static String getR() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
         return (String)((Object)"r");
    }
    
    public static String getL3() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
         return (String)((Object)"l");
    }
    
    public static String getD() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
         return (String)((Object)"d");
    }
    
    public static String getEnd() {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
         return (String)((Object)"!");
    }
}
