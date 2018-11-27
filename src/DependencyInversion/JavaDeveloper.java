package DependencyInversion;

public class JavaDeveloper implements Developer{

	public void writeJavaCode() {
		System.out.println("Ich schreibe Java Code.");
	}

	@Override
	public void develop() {
		writeJavaCode();
		
	}
}
