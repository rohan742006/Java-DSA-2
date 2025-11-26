import java.util.*;
public class height {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int sum_nodes(Node root){
        int sum=0;
        if(root==null){
            return 0;
        }
        int lc=sum_nodes(root.left);
        int rc=sum_nodes(root.right);
        sum=lc+rc+root.data;
        return sum;
    }
    public static int count_nodes(Node root){
        if(root==null){
            return 0;
        }
        int lc=count_nodes(root.left);
        int rc=count_nodes(root.right);
        return (lc+rc)+1;
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(height(root));
        System.out.println(count_nodes(root));
        System.out.println(sum_nodes(root));
    }
}
