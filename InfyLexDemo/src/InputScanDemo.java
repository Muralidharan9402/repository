import java.util.Scanner;

public class InputScanDemo {
	public static void main(String pars[]) {
		Scanner scanInp;
		try(scanInp = new Scanner(System.in)) {	// line 1
			// Input getting using Scanner
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			scanInp.close();	// line 2
		}
	}
}