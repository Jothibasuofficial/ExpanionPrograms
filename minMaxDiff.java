public int minMaxDiff(int[] chocolates, int students) {
            
           
	    if(chocolates == null || chocolates.length == 0 || students == 0) {	
	        return 0;	     
	        }
	        
	         
	        Arrays.sort(chocolates);
            int n=students;
	        int m = chocolates.length;
	        if(m < n)
	        {
	   
	            return -1;
            }
	        int minDiff = chocolates[m-1];     
	        int first = 0;
	        int last = 0;
	        int diff = 0;
	        for(int i = 0; i + n - 1 < m; i++) {
	            diff = chocolates[i+n-1] - chocolates[i];
	            if(diff < minDiff) {
	                minDiff = diff;
                first = i;
                    last = i+n-1;
	            }	        	   
	    }
	      return (chocolates[last] - chocolates[first]);
	
	
        }