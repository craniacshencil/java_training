import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class complexType {
    static HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String quitText= "quit";
        String inText;
        String row;
        while(true) {
            System.out.println("Enter key: ");
            inText = sc.next();
            if(quitText.equals(inText)) break;
            addRow(inText);
            row = inText;
            while(true){
                System.out.println("Enter column value: ");
                inText = sc.next();
                if(quitText.equals(inText)) break;
                addColumnEntry(row , inText);
            }
        }
        showMap();
    }

    static void addRow(String rowKey) {
        hm.put(rowKey, new ArrayList<String>());
    }

    static void addColumnEntry(String rowKey, String entry) {
        hm.get(rowKey).add(entry);
    }

    static void showMap() {
        for(String key: hm.keySet()){
            System.out.printf(key + "\t|");
            ArrayList<String> values = hm.get(key);
            values.forEach(
                (v) -> System.out.printf(v + "\t|")
            );
            System.out.println();
            System.out.println("--------------------------------------------------------");
        }
    }

}
