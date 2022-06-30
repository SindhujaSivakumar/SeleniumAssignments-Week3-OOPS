package week3.day2;

public class Automation extends MultipleLangauge implements Language,TestTool {
	public void java() {
		System.out.println("Java from Automation");
	}
	public void selenium() {
		System.out.println("Selenium from Automation");
	}
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.java();
		auto.selenium();
		auto.python();
	}

}
