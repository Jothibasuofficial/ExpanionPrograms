public class Answer  implements GetMaxAscSequenceLengthInterface{

	public int GetMaxAscSequenceLength(final int[] arr, int arrlen) {
		int count = 0;
		int recount = 0;
		int j = 1;
		for (int i = 0; i < arrlen; i++, j++) {
			if (j < arrlen) {
				if (arr[i] < arr[j]) {
					count = count + 1;

				} else if(arr[i]>=arr[j]){
					if (recount <= count) {
						recount = count;
						count = 0;
					}
					
				}
			}
		}

		if(count<recount)
			return recount;
		else
			return count;

	}

	public static void main(String[] args) {
		Answer obj = new Answer();
		int[] arr = {2,2,2,3,3,3,4,4,4,6,6,6};
		int arrlen = arr.length;

		int recount = obj.GetMaxAscSequenceLength(arr, arrlen);

		System.out.println(recount);
	}
}
