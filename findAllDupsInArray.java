import java.util.*;
/*
https://www.youtube.com/watch?v=aMsSF1Il3IY


iterate and make the index because they are valid index if you substract 1
use
ex
4 = 3

and make it negative

check if the value it's already negative

i.e.
{1,3,3,}

    a[i]   index      {}
0   1       0         {-1,3,3,}
1   3       2         {-1,3,-3,}
2   3       2         {-1,3,-3,} // add ir


i.e.
{1,3,3,1}

    a[i]   index      {}
0   1       0         {-1,3,3,1}
1   3       2         {-1,3,-3,1}
2   3       2         {-1,3,3,1} // add ir
3.  1       0         {-1,3,-3,1} // add ir

for i=0 to n-1
    idx= a[i]-1
     
    if a[idx] <0
        add. [] to List
    //else    
        a[idx ] = -a[idx ] 


[10,2,5,10,9,1,1,4,3,7]


    a[i]   index      {}
0   10       9      [10,2,5,10,9,1,1,4,3,-7]
1   2        1      [10,2,-5,10,9,1,1,4,3,-7]
2   5        4      [10,2,-5,10,-9,1,1,4,3,-7]
3.  10       9      [10,2,-5,10,-9,1,1,4,3,-7]          add index +1
4   9        8   
5   1        0
6   1        0
7   4        3
8   3        1
9   7         6




*/

class Main {

    
    public static void main(String args[]) {

        System.out.println("main  : " 
        //+  func(  )
        ); 
        print ( func(new int[] {4,3,2,7,8,2,3,1}) );
        print ( func(new int[] {10,2,5,10,9,1,1,4,3,7}) );
        
        
    }
    
    public static void print(List<Integer> list ){
        System.out.println();
        for(int e: list){
            System.out.println(e);
            
        }
    
    }
    
    public static List<Integer> func(int[] nums ){
        //System.out.println("func "  ); 
        Arrays.stream(nums).forEach(num -> System.out.print(num + ", "));
        
        List<Integer> result= new ArrayList<>();
        
        for(int i=0; i< nums.length; i++){
            int idx=Math.abs (nums[i])-1;
            if (nums[idx] <0)
                result.add(idx+1);
            nums[idx] = -nums[idx]    ;
            
        }
        
        
        return result;        

    }
}
