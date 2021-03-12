package PT2020.as1.as1Project;
//import javax.swing.text.View;

import controller_package.Controller;
import model_package.Model;
import view_package.View;

public class MVC {
	
	public static void main(String[] args)
	{
		Model model= new Model();
		View view = new View(model);
		Controller controller = new Controller(model, view);
		
		view.setVisible(true);
	}

}
