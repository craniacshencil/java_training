import java.util.*;
class StringMethods{
    public static void main(String args[]){
        String s1 = "Babulal";
        System.out.println("length: " + s1.length());
        System.out.println("equals to 'babulal': " + s1.equals("babulal"));
        System.out.println("equals to 'Babulal': " + s1.equals("Babulal"));
        System.out.println("equalsIgnoreCase to 'babulal': " + s1.equalsIgnoreCase("babulal"));
        System.out.println("equalsIgnoreCase to 'Babulal': " + s1.equalsIgnoreCase("Babulal"));
        System.out.println("startsWith 'Babulal': " + s1.startsWith("Babulal"));
        System.out.println("startsWith 'lal': " + s1.startsWith("lal"));
        System.out.println("startsWith 'babu': " + s1.startsWith("Babu"));
        System.out.println("endsWith 'Babulal': " + s1.endsWith("Babulal"));
        System.out.println("endsWith 'lal': " + s1.endsWith("lal"));
        System.out.println("endsWith 'babu': " + s1.endsWith("Babu"));
        System.out.println("indexOf 'B': " + s1.indexOf('B'));
        System.out.println("indexOf 'l': " + s1.indexOf('l'));
        System.out.println("indexOf 'z': " + s1.indexOf('z'));
        System.out.println("lastIndexOf 'B': " + s1.lastIndexOf('B'));
        System.out.println("lastIndexOf 'l': " + s1.lastIndexOf('l'));
        System.out.println("lastIndexOf 'z': " + s1.lastIndexOf('z'));
        System.out.println("toLowerCase: " + s1.toLowerCase());
        System.out.println("toUpperCase: " + s1.toUpperCase());
        System.out.println("replace with 'b' with 'l': " + s1.replace('b', 'l'));
        System.out.println("substring(2): " + s1.substring(2));
        System.out.println("substring(2, 5): " + s1.substring(2, 5));
        System.out.println("charAt(0): " + s1.charAt(0));
        String s2 = " ABCD";
        System.out.println(s2);
        s2 = s2.trim();
        System.out.println(s2);
        byte b[] = s2.getBytes();
        System.out.println("convert to bytes: " + Arrays.toString(b));
        
    }
}
