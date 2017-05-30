package joo;

public abstract class AbstractProfessorNameChecker implements ProfessorNameChecker {
	protected String NAME;
	protected String URL;

	@Override
	public boolean isMatchName(String name) {
		return name.equals(NAME);
	}

	@Override
	public String getUrl() {
		return "http://jhy753.dothome.co.kr/avgCalculater.php?professorName=" + URL;
	}
	
	
	

}
