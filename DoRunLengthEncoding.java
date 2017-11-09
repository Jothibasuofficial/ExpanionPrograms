public class Answer implements RunLengthEncodingInterface {
	@Override
	public String DoRunLengthEncoding(String str)
	{	
	if (str == null)
		return null;
		StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < str.length(); i++) {
	        int runLength = 1;
	        while (i + 1 < str.length()
	                && str.charAt(i) == str.charAt(i + 1)) {
	            runLength++;
	            i++;
	        }
	        sb.append(str.charAt(i));
	        if(runLength != 1)
	        sb.append(runLength);
	    }
	    return sb.toString();
	}
	@SuppressWarnings("unused")
	public static void main(String [] args)
	{
	
		Answer a = new Answer();
		String example = null;
	    System.out.println(a.DoRunLengthEncoding(example));

	}
	
}
