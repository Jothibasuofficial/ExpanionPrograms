public class Answer implements SubStringSameSequenceInterface {
	@Override
	public boolean SubStringSameSequence(String str, String subStr)
	{
		if (str == null || subStr == null)
return false;
		int count = 0;
		int k =0;
		for (int i = 0; i < subStr.length(); i++) {
			for (int j = k; j < str.length(); j++) {
				if (subStr.charAt(i) == str.charAt(j)) {
					k = j + 1;
					count++;
					break;
					}
			}
		}
		if (count == subStr.length()) {
			return true;
		}
		return false;
	}
	public static void main(String [] args)
	{
		Answer a = new Answer();
	  	String str = "Jothi basu";
		String subStr = " ";
		System.out.println(a.SubStringSameSequence(str, subStr));
		
		
	}
}
