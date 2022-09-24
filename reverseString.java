import java.util.*;


/*

https://www.youtube.com/watch?v=CRgXG1vK-wg

i.e
123 ->321

num     reversed    pop     num     reversed
123         0       3        12         3
12          3       2        1          32
1           32      1        0          321

i.e
12345 ->54321

num     reversed    pop     num     reversed
12345       0       5        1234       5
1234        5       4        123        54
123         54      3        12         543
12          543     2        1          5432
1           5432    1        0          5432

reversed  =0
pop

while num !=0
    pop = num % 10      
    num /= 10
    reversed = (reversed * 10) + pop;

*/

class Main {
    public static void main(String args[]) {

        System.out.println("case : " 
                           +  func(  123)
                          ); 
    }
    
    public static int func(int num ){
        //System.out.println("func "  ); 
        int reversed =0;
        int pop;
        
        while(num !=0){
            //System.out.println("B: num: "  + num + " reversed:" +reversed );
            pop = num % 10;
            num /= 10;
            
            System.out.println("pop " + pop + "  num: "+num+ " reversed: " + reversed ); 
            reversed = (reversed * 10) + pop;
            System.out.println("A: num: "  + num + " reversed:" +reversed );
        }
        
        return reversed;        

    }
}
