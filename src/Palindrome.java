
public class Palindrome {
	
	public static boolean isPalindrome(String s) throws InvalidCharacterException
	{
		int len =s.length();
		if(len==0)
			throw new NullPointerException("Parameter Type cannot be null");
		int i=0;
		len=len-1;
		for(i=0;i<=len/2;i++)
		{
			
			if(!isValidCharacter(s.charAt(i)) || !isValidCharacter(s.charAt(len-i)))
				throw new InvalidCharacterException();
			
			if(s.charAt(i)!=s.charAt(len-i))
				return false;
		}
		
		return true;
	}
	
	public static boolean isValidCharacter(char c) throws InvalidCharacterException
	{
		String punctutations = ".,:;!()[]-{}\"?/'";
		if(punctutations.contains(Character.toString(c)))
		return false;
			
		return true;
		
	}

	public static void main(String[] args) throws InvalidCharacterException  {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindrome("@/a/@"));
	}

}
