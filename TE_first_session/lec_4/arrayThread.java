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
        this.changeMade = false;
        Collections.sort(arr, Collections.reverseOrder());
      }
    }
  }

  public void addValue(String newVal) {
    arr.add(newVal);
    this.changeMade = true;
  }
}
