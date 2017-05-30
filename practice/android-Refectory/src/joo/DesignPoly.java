package joo;

import joo.NameChecker.CYGNameChacker;
import joo.NameChecker.JGCNameChacker;
import joo.NameChecker.JGSNameChacker;

public class DesignPoly {
	
	
	public static void main(String[] args) {
		ProfessorNameChecker[] nameCheckers = new ProfessorNameChecker[] {
				
				new CYGNameChacker(),
				new JGCNameChacker(),
				new JGSNameChacker()
		};	
		String professorName = "정구철";
		String url = "";
		
		for(ProfessorNameChecker nameChecker: nameCheckers) {
			if(nameChecker.isMatchName(professorName)) {
				url = nameChecker.getUrl();
			}
		}
		accessWebServiceRating(url);
	}
	
	public static void accessWebServiceRating(String url) {
		System.out.println(url);
	}
	
	
}
