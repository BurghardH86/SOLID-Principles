package DependencyInversion;

public class SoftwareProject {

	public static void main(String[] args) {
		JavaDeveloper backendDev = new JavaDeveloper();
		JavaScriptDeveloper frontendDev = new JavaScriptDeveloper();
		
		backendDev.writeJavaCode();
		frontendDev.writeJavaScriptCode();

	}

}
