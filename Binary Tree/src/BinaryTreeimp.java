import java.util.Scanner;

public class BinaryTreeimp {

    private static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left=right=null;
        }
    }
    private Node root;
    public void insert(Scanner sc){
        System.out.println("Enter value for root node :");
        int val=sc.nextInt();
        root=new Node(val);
        insert(root, sc);
    }
    public void insert(Node root, Scanner sc){
        System.out.println("Do you want to enter at the left node" +root.data);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter value for left node"+root.data);
            int val=sc.nextInt();
            root.left=new Node(val);
            insert(root.left, sc);
        }
        System.out.println("Do you want to enter at the right node"+root.data);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("Enter value for right node"+root.data);
            int val=sc.nextInt();
            root.right=new Node(val);
            insert(root.right,sc);
        }
    }
    public void display(){
        display(root,0);
    }
    public void display(Node root, int level){
        if(root == null){
            return;
        }
        display(root.right, level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }

        System.out.println(root.data);

        display(root.left, level + 1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTreeimp tree=new BinaryTreeimp();
        tree.insert(sc);
        tree.display();
    }
}
