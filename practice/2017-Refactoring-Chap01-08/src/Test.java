import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Test {

	public static void test(String newResult){
		String result = "";
		try(Scanner in = new Scanner(new File("result.txt"))){
			while(in.hasNextLine()){
				result += in.nextLine()+"\n";
			}
		} 
		catch (FileNotFoundException e) {
			System.exit(0);
		}
		String[] resultLines = result.split("\\n");
		String[] newResultLines = newResult.split("\\n");
		boolean compFlag = true;
		for(int i=0; i<resultLines.length; i++){
			if(!resultLines[i].equals(newResultLines[i])){
				System.out.printf("라인 %d: %s\n%s\n", i, resultLines[i], newResultLines[i]);
				compFlag = false;
			}
		}
		if(compFlag) System.out.println("이상 무");
	}
	
	public static void main(String[] args) {
		Customer sangjin = new Customer("김상진");
		sangjin.addRental(new Rental(new Movie("마스터", Movie.PriceCode.REGULAR),2));
		sangjin.addRental(new Rental(new Movie("모아나", Movie.PriceCode.CHILDRENS),2));
		sangjin.addRental(new Rental(new Movie("프리즌", Movie.PriceCode.NEW_RELEASE),2));
		test(sangjin.statement());
	}
}
