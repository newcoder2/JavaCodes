package App;

import java.io.Console;
import java.io.IOException;

public class trigger {

	public static void main(String[] args) throws IOException {
		
		
		table t = new table();
		project p = new project();
		Console reading = System.console();
			
				
		p.setId(255);
		System.out.println("this is the ID you have sent - " + p.getId());
		p.setRelease("2016/01");
		System.out.println("the id is part of the release - "+p.getRelease());
		p.setComments("No comments for this project");
		System.out.println("Comments - " + p.getComments());
		
		//Random funtion has been added
		
		p.setName("crazy project");
		
		System.out.println(p.getName());
		
		
		System.out.println();
		System.out.println("-----------------------");
		t.byId();
		t.byRelease();
		t.byText();
		
		

	}

}
