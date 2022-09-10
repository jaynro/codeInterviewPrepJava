import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

    
    // SequencePoniter=0
    int j =0;
    
    //iterate sequence
    for(int i=0; i<array.length(); i++){
      if (seq[i]==seq[j])
        j++;
  
      if (j ==sequence.lenhgt() -1)
        return true;
        
    }


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