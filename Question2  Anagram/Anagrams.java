
public class Anagrams {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str1=sc.nextLine().toLowerCase();
		String str2=sc.nextLine().toLowerCase();
		
		if(str1.length()!=str2.length()) {
			
			System.out.println("length or not equal so these string are not anagram");
		}
		
		else {
			
			char s1[]=str1.toCharArray();
			char s2[]=str2.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			if(Arrays.equals(s1, s2)) {
				System.out.println("Strings are Anagrams");
			}
			
			else {
				System.out.println("Strings are not Anagrams");
			}
		}
		
		