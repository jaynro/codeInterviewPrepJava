import java.util.*;


/*
https://www.youtube.com/watch?v=gmu0RA5_zxs

ie.
{1,2,3,4,5,6,7} , 3

//reverse  0 to array.lenght -1 --> 0, 6
7,6,5,4,3,2,1

//reverse  0 to array.lenght -1  -k () --> 0 ,3 --> 
4,5,6,7,3,2,1

//reverse  k to array.lenght -1 --> (4,6) 
4,5,6,7,1,2,3

(0,6)  {1,2,3,4,5,6,7}      (0, a.lenght -1) -->(0, 7 -1) ->(0, 6)
(0,3)  {1,2,3,4}            (0, a.lenght -1- k) -->(0, 7 -1 -3) -->(0, 3)
(4,6)  {5,6,7}              (a.lenght -1 -k , a.lenght -1) -->(7 -3, 7-1 ) -->(4, 6)



{1,2,3,4,5,6,7}
reverse all things
    i:       0   1   2   3   4   5   6
    a[i]     7   6   5   4   3   2   1

reverse the first k numbers
    i:       0   1   2   3   4   5   6
    a[i]     5   6   7   4   3   2   1
reverser left overs
    i:       0   1   2   3   4   5   6
    a[i]     5   6   7   1   2   3   41

*/
class Main {
    public static void main(String args[]) {

        System.out.println("case : " 
              //             +  func(  )
                          ); 
        //func(new int[]{1,2,3,4,5,6,7} , 3);    
        
        func(new int[]{1,2,3,4,5,6,7} , 9);                  
    }
    
    public static void func( int[] array, int k ){
        System.out.println("func "  ); 
        //int 
        
        k = k % array.length;
        
        reverse(array, 0,array.length-1 );
        reverse(array, 0,k -1);
        reverse(array, k ,array.length-1);
        
        System.out.println();
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+ ", ");
        }        
        

    }
    
    public static void reverse( int[] array, int start, int end ){
        System.out.println("start: " + start+ "   end:" +end);
        while(start <end){
            int temp= array[start];
            array [start] = array[end];
            array[end] = temp;
            end--;
            start ++;
            
        }

    }

    public static void print(int[] array){
        System.out.println();
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]+ " ");
        }
    }        
    public static void print(List<Integer> list ){
        System.out.println();
        for(int e: list){
            System.out.println(e);
        }
    }    
}
