public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }

    public Boolean hasLeft() {
        return this.left != null;
    }

    public Boolean hasRight() {
        return this.right != null;
    }

    public void findValue(int target, int level) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("This node is value: " + this.value + " level: " + level);
        if(this.value != target) {
            System.out.println("Not found");
            if(this.left != null){
                System.out.println("Searching on left of " + this.value);
                this.left.findValue(target, level + 1);
            } 
            else {
                System.out.println("Node value: " + this.value + " does not have a left node");
            }
            if(this.right != null){
                System.out.println("Searching on right of " + this.value);
                this.right.findValue(target, level + 1);
            }
            else {
                System.out.println("Node value: " + this.value + " does not have a right node");
            }
        }
        else if(this.value == target) {
            System.out.println("This node of value: " + this.value + " found at level: " + level);
            return ; 
        }
        else {
            System.out.println("Node not present at this level");
            level++;
        }
    }
}
