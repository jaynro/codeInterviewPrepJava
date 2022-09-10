import java.util.*;

class Program {

  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int arrayPointer=0;
    int seqPointer=0;
    
    while (arrayPointer < array.size() && seqPointer < sequence.size() ){
      if(array.get(arrayPointer).equals( sequence.get(seqPointer) )){
        seqPointer++;
      }
      arrayPointer ++;
    }
    
    return seqPointer == sequence.size();
  }
  /*
  TODO 
    iterate list using indices:
      array.get(idx_
    using whiles
    how come I missed  iterate conditions on my analysis
    Why  I missed examples that consider boundaries and corner cases?
    When to use  a while or for?
      In general, you should use a for loop when you know how many times the loop should run. 
      If you want the loop to break based on a condition other than the number of times it runs, 
        you should use a while loop.
*/
    
  public static boolean isValidSubsequenceMine(List<Integer> array, List<Integer> sequence) {
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

**************************************

Deeper Analysis
//POSITIVE
//random
array=[1, 22, 6, -1]
sequence =[1, 6, -1]
true

//middle before last
array=[5, 1, 6, -1]
sequence =[1, 6, ]
true

//Last at last
array=[1, 22,  6, ]
sequence =[1, 6, ]
true

//NEGATIVE
//sequence bigger than the array
array=[1, 22,  6, ]
sequence =[1, 6, 11]
true

//base cases
array[] || seq []

solution
      iterate the array and compare pointers with sequence until a match happens

ex 1
array = 1, 22, 6, -1
sequence =[1, 6, -1]
i  a[i]        [1,      6,      -1,     10]
    [
0   1,          T
1   22,                 --
2   6,                  T
3   -1,                          T
   ]


arrayPointer=0
seqPointer=0

while (arrayPointer < array.size() && seqPointer < sequence.size() ){
  if()array.get(arrayPointer).equals( sequence.get(seqPointer) ){
    seqPointer++;
  }
  arrayPointer;
}

return seqPointer == sequence.size() 

*/
