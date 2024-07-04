public class MyTree {
    public static void main(String[] args) throws InterruptedException{
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(38);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(9);
        root.right.left = new TreeNode(25);
        root.right.right = new TreeNode(58);

        root.findValue(38, 0);
    }

}
