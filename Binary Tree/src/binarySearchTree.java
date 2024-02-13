

public class binarySearchTree {
    private static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data=data;
            left = right = null;
        }
    }

    private Node root;
    public binarySearchTree(){
        root=null;
    }
        public Node insert(Node node, int data){
            if(node==null){
                node=new Node(data);
                return node;
            }
            if(data <= node.data){
                node.left=insert(node.left, data);
            }
            else if(data >= node.data){
                node.right=insert(node.right, data);
            }
            return node;
        }
        public Node search(Node node, int data){
            if(node==null){
                return null;
            }
            if(node.data==data){
                return node;
            }
            if(data <= node.data){
                return  search(node.left, data);
            }
            else{
                return search(node.right, data);
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

    public static void main(String[] args){
                binarySearchTree tree = new binarySearchTree();
                tree.root = tree.insert(tree.root, 40);
                tree.insert(tree.root, 30);
                tree.insert(tree.root, 60);
                tree.insert(tree.root, 45);
                tree.insert(tree.root, 10);
                tree.display();
            }
}
