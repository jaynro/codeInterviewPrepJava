def twoNumberSum(array, targetSum):
    print(*array)
    print('targetSum:'+ str(targetSum))

   
    for i in range( len(array) -1):
        s1=array[i]
        print('i:'+ str(i))
        for j in range( i+1, len(array) ):
            s2=array[j]
            #print('i:'+ str(i)+'   j:'+ str(s2))
            print('       s1:'+ str(s1)+'   s2:'+ str(s2) + '   j:'+ str(j)) 
            if s1+s2 == targetSum:
                return [s1,s2]
    return []


#TODO:
    # why this didn't work?   == for j in range( i+1, len(array) -1 ):
        #Outer loop from zero to penultimate
        #inner loop from second to last
    
#	leftIdx =0
#    rightIdx = len(array) -1
#    array.sort()
#   while leftIdx <=rightIdx:
#        s1=array[leftIdx]
#        s2=array[rightIdx]
#        tempSum = s1 + s2

 #       if tempSum == targetSum:
 #           return [s2, s1]

  #      if tempSum < targetSum:
  #          leftIdx +=1
 #       else:
 #           rightIdx =-1  

