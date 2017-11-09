import java.util.*;
public class Answer implements PalindromicPathsInterface {

 List<String> list = new ArrayList<String>();
    
    
     Boolean isPalindrom(String a) {
    		
		for(int i = 0, j = a.length()-1; i<=j; i++, j--) {
			
			if (a.charAt(i) != a.charAt(j)) {
				return false;
			}
		}
    	    	
    	return true;
    }
    
     void pali(String[] input, int row, int col, int i, int j, String s) {
        
        if (i == row && j == col) 
        {
        	s = s+input[i].charAt(j);
        	
        	if (isPalindrom(s))	        	
        		list.add(s);
        }           
        
        if (row < 0 || col < 0)
           return;
        
        //move right
        if (j < col) {            
            pali(input, row, col, i, j+1, s+input[i].charAt(j));
        }           
        //move down 
        if (i < row) {
            pali(input, row, col, i+1, j, s+input[i].charAt(j));
        }
    }

    @Override
	public  String[] findPalindromicPaths(String[] input) {
		
	    if (input.length == 0 || input == null)
	      return null;
	    int row = input.length;
	    int col = input[0].length();
	    	    
	    pali(input, row-1, col-1, 0, 0, "");
	    
	    String[] res = new String[list.size()];
	    int i = 0; 
	    for (String s:list) {
	    	res[i++] = s;
	    	System.out.println(s);
	    }
		
		System.out.println(list.toArray());
		return res;
	}	
	}
