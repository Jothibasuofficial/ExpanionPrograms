public int FindMinimumDistance(String input)
	{
        
	String inputString = input;
	int stringLength = inputString.length();
		int cMin = 0;		
		int dp[][] = new int[stringLength][stringLength];
		
		
		for(int i = 1; i < stringLength; i++) 
			for(int j = 0; j < stringLength-i; j++) 
			{
				int k = j+i;
				
				if ((inputString.charAt(j) == 'a' && inputString.charAt(k) == 'b') ||
					(inputString.charAt(j) == 'b' && inputString.charAt(k) == 'a')) {
					
					dp[j][k] = i+1;						
					cMin = min(i+1, cMin);
					if (cMin == 0)
						cMin = i+1;
				}											
				
			}
		
		return cMin;
	}
static private int min(int a, int b) {

		return a>b?b:a;
	}