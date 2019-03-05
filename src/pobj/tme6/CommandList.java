package pobj.tme6;

import java.util.ArrayList;
import java.util.List;

public class CommandList implements ICommand {

	private List<ICommand> conteneur = new ArrayList<ICommand>();
	
	public void addCommand(ICommand command) {
		conteneur.add(command);
	}
	
	public void execute(IColorTurtle turtle) {
		for(ICommand commande : conteneur) {
			commande.execute(turtle);
		}
	}
	
	

}
