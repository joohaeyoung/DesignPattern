package joo.NameChecker;

import joo.ProfessorNameChecker;

public class CYGNameChacker implements ProfessorNameChecker {


	@Override
	public boolean isMatchName(String name) {
		return name.equals("최영규");
	}

	@Override
	public String getUrl() {
		return "http://jhy753.dothome.co.kr/avgCalculater.php?professorName=cyg";
	}


}
