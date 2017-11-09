public class Answer implements ThreeNumberSumInterface {
	//@Override
	public boolean ThreeNumberSum(final int [] arr, int arrlen, int magicNumber)
	{
			
		for (int i = 0; i < arrlen - 2; i++) {
			for (int j= i+1; j < arrlen - 1; j++) {
				for (int k = i+2; k < arrlen; k++) {
					if ((arr[i] + arr[j] + arr[k] == magicNumber) 
							&& i != j && j != k && i != k) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String [] args)
	{
	
		Answer a = new Answer();
		int [] arr = {0, 5 , 8, 10, 9, 15};
		int magicNumber = 17;
		int arrLength = arr.length;
		
		System.out.println(a.ThreeNumberSum(arr, arrLength, magicNumber));
	}
}
