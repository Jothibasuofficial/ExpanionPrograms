public int GetRequiredFlips(int a, int b)
	{
        
        
        int c = a ^ b;
        int count = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            
            if ((c & 1) == 1) 
                count++;
                
            c = c >> 1;
        }
        
        
        return count;
    }