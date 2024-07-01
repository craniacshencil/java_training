public class menuPoper {
    menuItem items[] = {
        new menuItem(1, "Dosa", 20.2f),
        new menuItem(2, "Vada", 30.5f),
        new menuItem(3, "Pizza", 150f),
        new menuItem(4, "Momo", 65.8f),
    };

    public String getMenu() {
        String retStr = "";
        for(menuItem item : items) {
            retStr += "Item No:" + item.itemNum + "\t|" + item.name + "\t|" + item.price + "\n";
        }
        return retStr;
    }

    public void getNameAndPrice(int id) {
        boolean itemFound = false;
        for(menuItem item : items) {
            if(item.itemNum == id) {
                System.out.println("Name: " + item.name + "\nPrice:" + item.price);
            }
        }
        if(!itemFound){
                System.out.println("id not present");
        }
    }
}

class menuItem {
    public int itemNum;
    public String name;
    public float price;

    menuItem(int itemNum, String name, float price) {
        this.itemNum = itemNum;
        this.name = name;
        this.price = price;
    }
}
