import java.util.*;
 
public class CountryCaseChange {
  public static void main(String[] args) {
     List<String> listCountries = Arrays.asList("France", "Germany", "Italy", "Egypt");
     listCountries.sort((String stringArg1, String stringArg2) ->   stringArg1.compareTo(stringArg2));
     
     listCountries.forEach(countryName -> System.out.println(countryName));
     
     /*for (String countryName : listCountries) {
	      System.out.println(countryName);
     }*/
  }
}
