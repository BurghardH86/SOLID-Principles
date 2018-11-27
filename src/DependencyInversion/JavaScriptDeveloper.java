package DependencyInversion;

public class JavaScriptDeveloper implements Developer {

	public void writeJavaScriptCode() {
		System.out.println("Ich schreibe JavaScript Code.");
	}

	@Override
	public void develop() {
		writeJavaScriptCode();
		
	}
}
