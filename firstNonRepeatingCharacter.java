import java.util.*;

/*
https://www.youtube.com/watch?v=5co5Gvp_-S0

aaabccc ->b

abcbad ->c

i.e.
abcbad ->c

a   [{a:1}]
b   [{a:1},{b:1}]
c   [{a:1},{b:1},,{b:1}]
b   [{a:1},{b:2},,{c:1}]
a   2
d   1


a   a:2
b   b:2





*/


class Main {
    public static void main(String args[]) {

        
        System.out.println("case : "   +  func3("abcbad"  )    ); 
        System.out.println("case : "   +  func3("aaabcccdeef"  )    ); 
    }
 

    public static char func3( String s){   
        for(int i=0; i <s.length(); i++){
            if(s.indexOf(s.charAt(i)  ) == s.lastIndexOf(s.charAt(i) )  )
                return s.charAt(i);
        }    
        return ' ';     
    }     
    public static char func2( String s){   
        int[] char_counts = new int[26]; // Highlight
        
        for(char c: s.toCharArray())  
            char_counts[c-'a']++;    // Highlight
        
        for(int c: char_counts)
            System.out.println(c);
        
        for(char c: s.toCharArray())  
            if(char_counts[c-'a'] ==1) return c;   
            
        return ' ';      
    }    
    public static char func( String s){
        //System.out.println("func "  ); 
		char myChar = ' ';  // empty char value
        
        Map<Character,Integer> charMap = new HashMap<>(); // Highlight
        
        for(int i=0; i <s.length(); i++){  // Highlight
            char c = s.charAt(i);
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c) +1);
            }else{
                charMap.put(c, 1);
            }
        }
        
        System.out.println(charMap);
        for(int i=0; i <s.length(); i++){
            char c = s.charAt(i);
            if(charMap.get(c) ==1 )
                return c;

        }        
        
        return ' ';        

    }
    
    public static void print(List<Integer> list ){
        System.out.println();
        for(int e: list){
            System.out.println(e);
            
        }
    
    }    
}
