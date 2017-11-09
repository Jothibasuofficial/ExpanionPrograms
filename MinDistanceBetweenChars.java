public class Answer implements MinDistanceBetweenCharsInterface {
	 @Override
	public int MinDistanceBetweenChars(String str, char startChar, char endChar) {
		int flag1, flag2, flag3 = 0;
		if (str == null)
			return 0;
		char[] stringToCharArray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (stringToCharArray[i] == startChar) {
				flag1 = i;
				for (int j = i+1; j < str.length(); j++) {
					if (stringToCharArray[j] == endChar) {
						flag2 = j;
						if(flag1 == flag2)
						{
							flag3 = 1;
							break;
						}
						flag3 = flag2 - flag1;
						break;
					}

				}
			}
		}

		return flag3;
	}

	public static void main(String[] args) {
		Answer obj = new Answer();
		String str = "Jothi basu";
		char startChar = ' ';
		char endChar = 'o';
		int result = obj.MinDistanceBetweenChars(str, startChar, endChar);
		System.out.println(result);
		
	}
}
