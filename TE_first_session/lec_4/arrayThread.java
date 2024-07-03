import java.util.ArrayList;
import java.util.Collections;

public class arrayThread extends Thread {
  ArrayList<String> arr = new ArrayList<String>();
  public boolean changeMade = false;

  public void run() {
    arr.add("Red");
    arr.add("Green");
    arr.add("Blue");
    System.out.println(arr);
    while (true) {
      try {
        this.sleep(2000);
      } catch (Exception E) {
      }
      if (this.changeMade) {
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(this.arr);
        this.changeMade = false;
      }
    }
  }

  public void addValue(String newVal) {
    arr.add(newVal);
    this.changeMade = true;
  }
}
