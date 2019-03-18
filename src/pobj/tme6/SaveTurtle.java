package pobj.tme6;

import javafx.scene.paint.Color;

public class SaveTurtle implements IColorTurtle {
	
	private CommandList commandes = new CommandList();

	public void move(int length) {
		commandes.addCommand(new CommandMove(length));
	}

	public void turn(int angle) {
		commandes.addCommand(new CommandTurn(angle));
	}

	public void up() {
		commandes.addCommand(new CommandUp());
	}

	public void down() {
		commandes.addCommand(new CommandDown());
	}

	public void setColor(Color color) {
		commandes.addCommand(new CommandSetColor(color));
	}
	
	public CommandList getCommand() {
		return commandes;
	}


}
