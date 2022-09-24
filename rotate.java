import java.util.*;

/*
https://www.youtube.com/watch?v=SA867FvqHrM

     0  1   2
0    1, 2,  3
1    4, 5,  6
2    7, 8,  9

Steps:
1.Diagonal
    1,4,7
    2,5,8
    3,6,9

2.columns
    7,4,1
    8,5,2
    9,6,3

Diagonal
     0  1   2
0    1, 2,  3
1    4, 5,  6
2    7, 8,  9

i
     0  1   2  -- j
0    1, 2,  3
1    4, 5,  6
2    7, 8,  9






*/



class Main {
    public static void main(String args[]) {
        
        int[][]  matrix = new int[][]  { {1,2,3}, {4,5,6}, {7,8,9} }; 

        System.out.println("case : " +  rotate( matrix )); 
    }
    
    public static int rotate(int[][] matrix ){
        //System.out.println("func "  ); 
        int n =matrix.length;
        for(int i=0; i < n; i++){
            for(int j=i; j < n; j++){
                //System.out.println("B: matrix["+i+"]["+j+ "]: " + matrix[i][j] );
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i] = temp;
                
                //System.out.println("A: matrix["+i+"]["+j+ "]: " + matrix[i][j]          +    "   matrix["+j+"]["+i+ "]: " + matrix[j][i]                ); 
            
            }            
        }
        
        for(int i=0; i < n; i++){
            for(int j=0; j < n/2; j++){
                //System.out.println("B: matrix["+i+"]["+j+ "]: " + matrix[i][j] );
                int temp = matrix[i][j];
                matrix[i][j]= matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
                
                System.out.println("A: matrix["+i+"]["+j+ "]: " + matrix[i][j]  
            +    "   matrix["+i+"]["+(n-1-j) +"]: " + matrix[i][n-1-i]
                 ); 
            
            }            
        }        
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                System.out.print(matrix[i][j]+ "  " );
            }
            System.out.println();
        }                
        
        return -1;        

    }
}   
