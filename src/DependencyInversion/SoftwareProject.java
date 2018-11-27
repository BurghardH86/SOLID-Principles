package DependencyInversion;

import java.util.List;

public class SoftwareProject {

	private List<Developer> developers;
	
	public SoftwareProject(List<Developer> developers) {
		this.developers = developers;
	}
	
	public static void main(String[] args) {
		
		
		Developer backendDev = new JavaDeveloper();
		Developer frontendDev = new JavaScriptDeveloper();
		
		backendDev.develop();
		frontendDev.develop();

	}

}
