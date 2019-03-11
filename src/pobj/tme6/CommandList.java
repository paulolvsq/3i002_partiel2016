package pobj.tme6;

import java.util.ArrayList;
import java.util.List;

public class CommandList implements ICommand {
<<<<<<< HEAD
	
	private List<ICommand> commands;
	
	public CommandList() {
		commands = new ArrayList<>();
	}

    public void addCommand(ICommand command) {
    	commands.add(command);
    }
	@Override
	public void execute(IColorTurtle turtle) {
		for(ICommand command : commands)
			command.execute(turtle);
	}
=======

	private List<ICommand> conteneur = new ArrayList<ICommand>();
	
	public void addCommand(ICommand command) {
		conteneur.add(command);
	}
	
	public void execute(IColorTurtle turtle) {
		for(ICommand commande : conteneur) {
			commande.execute(turtle);
		}
	}
	
	
>>>>>>> 65d314c5cb9b38fc32e6964a10ebdba1d205a264

}
