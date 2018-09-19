/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{
	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
				
		//  Try other methods here:​
		
		String upperCase = sample.toUpperCase();
		System.out.println ("sample.toLowerUppercase() = " + upperCase);
		System.out.println ("After toUppercaseCase(), sample = " + sample);
			
		
		System.out.println(sample.charAt(5));
		
		int notFoundPsn = sample.indexOf("slow"); 
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		
		//experiment with compareTo
		
		String example1 = "U";
		String example2 = "p";
		System.out.println(example1.compareTo(example2));
		//origianl part is where you start 
		
		//experiment with substring
		String starter = "start middle end";
		System.out.println(starter.substring(10, starter.length())); 
		//starts at letter at that position and goes to end
		//overloaded method = programmed twice 
		//upperbound is noninclusive 
		int psn1 = starter.indexOf("middle");
		System.out.println(starter.substring(psn1, psn1+6));
	}
}
