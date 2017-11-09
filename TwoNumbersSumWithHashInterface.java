public boolean TwoNumbersSumWithHashInterface(int[] array, int value,
			Map<Integer, Integer> hashMap) {
			    boolean match = false;
			    int arrlen = array.length;
			    int c = 0;
			    for (int i=0;i < arrlen ;i++)
        {
            c = array[i];
            if(hashMap.containsKey(c))
            {
                
                hashMap.put(  c ,  hashMap.get(c) +1 );
            }
            else
            {
                hashMap.put( c , 1 ) ;
            }
        }
        for (int j = 0; j < arrlen - 1; j++) {
			for (int k = j + 1; k < arrlen; k++) {

				if (array[j] + array[k] == value){

					match = true;
					hashMap.put(array[j], array[k]);
					break;
				}
			}
			if (match){
				return true;
			}
		}
		   	
		return false;
	}
