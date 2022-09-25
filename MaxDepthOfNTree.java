import java.util.*;
/*
https://www.youtube.com/watch?v=TtAflDtqwVg

 Maximum Depth of N-ary Tree |
 
 i.e
 root = [1, null, 3,2,4, null, 5,6]
 output =3

Breath first it's level by level; usually a que

DFS its usually a queue


if there then we found a level


*/

import java.util.*;
class Main {
    
    static class Node{
        public int value;
        public List<Node> children;
        
        public Node(int val){
            this.value = val;
        }

        public Node(int val, List<Node> children){
            this.value = val;
            this.children = children;
        }        
    }
    public static void main(String args[]) {

        Node node5 = new Node(5);
        Node node6 = new Node(6);

        List<Node> children3= new ArrayList<>();
        children3.add(node5);
        children3.add(node6);

        Node node3 = new Node(3,children3);
        Node node2 = new Node(2);
        Node node4 = new Node(4);


        List<Node> children1= new ArrayList<>();
        children1.add(node2);
        children1.add(node3);
        children1.add(node4);

        
        Node root = new Node(1,children1);


        System.out.println("case : " 
                           +  maxDepth(root  )
                          ); 
    }
    
    public static int maxDepth( Node root){
        
        if (root == null) return 0;
        
        System.out.println("Node.value: " +root.value);
        
        int depth=0;

        Queue<Node> queue = new LinkedList();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            System.out.println("size: " +size);
            
                        
            for(int i =0; i<size; i++){
                Node currentNode = queue.poll();
                System.out.println("currentNode: " +currentNode.value);
                for(Node child: currentNode.children){
                    System.out.println("Child.value: " +child.value);
                    queue.offer(child);
                }    
                   
            }
                
            depth++;
            
        }

        return depth;        

    }
    
    public static void print(List<Integer> list ){
        System.out.println();
        for(int e: list){
            System.out.println(e);
            
        }
    
    }    
}
