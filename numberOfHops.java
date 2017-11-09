public class Answer implements NumberOfHopsInterface {

	@Override
	public int numberOfHops(int[] A) {
	  

        if (A.length <= 1)
            return 0;
        int maxReach = A[0];
        int step = A[0];
        int numberOfHops = 1;
        for (int i = 1; i < A.length; i++) {
           if (i == A.length - 1)
                return numberOfHops;
            if (i + A[i] > maxReach)
                maxReach = i + A[i];
            step--;
            if (step == 0) {
                numberOfHops++;
                step = maxReach - i;
            } 
        }
        return numberOfHops;
        
        
	}

}
