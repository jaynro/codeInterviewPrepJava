import java.util.*;

/*
link: https://www.youtube.com/watch?v=2AdzmA1IC1k&t=116s

count[1]: -1; count[3]: 1
count[2]: -1; count[3]: 2
case 3: 3

*/

class Main {
    public static void main(String args[]) {
        //System.out.println("case 1: " +  findJudge(new int [][] {{1,2}, {2,3}},3  ));
        // System.out.println("case 2: " +  findJudge(new int [][] {{1,2}}  ,2 )  );
        System.out.println("case 3: " +  findJudge(new int [][] {{1,3}, {2,3}}  ,3 )  ); 
    }
    
    public static int findJudge( int[][] trustArray, int n ){
        
        // Use the array as a map
        int[] count = new int[n+1];
        
        //iterate every pair from trust array
        for(int[] trustPair: trustArray){
            count[trustPair[0]] --; //Decrease. you can't be a judge
            count[trustPair[1]] ++; // You can be a judge
            
            System.out.println("count["+trustPair[0]+ "]: " + count[trustPair[0]] +
            "; count["+trustPair[1]+ "]: " + count[trustPair[1]]  );        
            
        }
        
        //iterate count array, the one with n-1 is the the judge
        for(int i=1; i<= n;i++){
            //System.out.println("count["+i+"] " + count[i] );
            if(count[i] == n-1) 
                return i;
                
        }
        
        return -1;

    }
}
