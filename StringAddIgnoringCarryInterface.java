
public class Answer implements StringAddIgnoringCarryInterface {
	@Override
	public String DoStringAddIgnoringCarry(String num1, String num2)
	{
	if(num1 == null && num2 == null)
        return null;
    if(num1==null)
        return num2;
    if(num2==null)
        return num1;
        
	StringBuilder buf = new StringBuilder();
    for ( int i1 = num1.length() - 1, i2 = num2.length() - 1, carry = 0;
          i1 >= 0 || i2 >= 0 || carry != 0;
          i1--, i2-- ) {
        int digit1 = i1 < 0 ? 0 :
                     Integer.parseInt(Character.toString(num1.charAt(i1)));
        int digit2 = i2 < 0 ? 0 :
                     Integer.parseInt(Character.toString(num2.charAt(i2)));

        int digit = digit1 + digit2 ;
        if (digit > 9) {
            carry = 1;
            digit -= 10;
        } else {
            carry = 0;
        }
    
        buf.append(digit);
    }
    
    String str = buf.reverse().toString();
    
    if (str.contains("0000"))
        return "0";
        
    int firstIndex = 0;
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.charAt(i) != '0') {
            firstIndex = i;
            break;
        }
    }
    
    return str.substring(firstIndex);
    
}
	public static void main(String [] args)
	{
	    Answer a = new Answer();
	 String s1 = "";
        String s2 = "5";
        a.DoStringAddIgnoringCarry(s1, s2);
    }
	
}
