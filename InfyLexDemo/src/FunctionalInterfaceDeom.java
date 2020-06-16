
public class FunctionalInterfaceDeom {

	public static void main(String[] args) {
	String s1 = "Lambda";
	String s2 = "Expression";
	
	StringFormatter strValue = (str1,str2)->str1+" "+str2;
	
	StringFormatter strValue1 = (str1,str2)->str1+" - "+str2;
	
	StringFormatter strValue2 = (str1,str2)->str1.toUpperCase()+" "+str2.toUpperCase();
	
	String res = strValue.format(s1, s2);
	String res1 = strValue1.format(s1, s2);
	String res2 = strValue2.format(s1, s2);
	
	System.out.println(res+"\n"+res1+"\n"+res2);
	}

}
