public char FindFirstNonRepeatedCharacter(String inputString,Map<Character, Integer> inputMap)

 {  
     
        if(inputString==null)
		          return ' ';
        int i,length ;
        Character c ;
        length= inputString.length(); 
        for (i=0;i < length;i++)
        {
            c=inputString.charAt(i);
            if(inputMap.containsKey(c))
            {
        
                inputMap.put(  c ,  inputMap.get(c) +1 );
            }
            else
            {
                inputMap.put( c , 1 ) ;
            }
        }
        
        for (i =0 ; i < length ; i++ )
        {
            c= inputString.charAt(i);
            if( inputMap.get(c)  == 1 )
            return c;
        }
        
      return ' '; 
    }