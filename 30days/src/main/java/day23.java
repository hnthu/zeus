import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*Sample Input

6
3
5
4
7
2
1
Sample Output

3 2 5 1 4 7*/
public class day23 {
    private static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
    static void levelOrder(Node root){
        //Write your code here
        Queue<Node> q = new LinkedList<Node>();
        if(root != null) {
            q.add(root);
            while(!q.isEmpty()) {
                Node n = q.poll();
                System.out.print(n.data+" ");
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
            }
        }
    }
}
