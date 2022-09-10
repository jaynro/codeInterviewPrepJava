import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    System.out.println("array:  " + array.toString());
     System.out.println("sequence:  " + sequence.toString());
    if(array == null || array.size( ) ==0)
      return false;

    int[] a = array.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
    int[] s= sequence.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
    // SequencePoniter=0
    int j =0;
    
    //iterate sequence
    for(int i=0; i<a.length; i++){
      if (a[i]==s[j]){
        System.out.println("a[i]:  " +a[i] +"    s[j]:  " +s[j]);
        j++;
      }
      System.out.println("j:  " +j);
      if (j ==s.length )
        return true;            
  

        
    }

    System.out.println("j:  " +j);
    if (j ==s.length )
      return true;    

    //no records found    
    return false;
  }
}


/*
option1
array=[5, 1, 22, 25, 6, -1, 8, 10]
sequence =[1, 6, -1, 10]
true

i  a[i]        [1,      6,      -1,     10]
    [
0   5,          -   
1   1,          ok     
2   22,                -
3   25,                - 
4   6,                 ok
5   -1,                         ok
5   8,                          -
6   10                                  ok - exit
   ]

j// SequencePoniter=0

iterate sequence
  if seq[i]==seq[j]
    j++
  
  if j ==sequence.lenhgt[] -1
    return true

return false





*/
