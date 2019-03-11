package pobj.tme6;

import javafx.scene.paint.Color;

public class SaveTurtle implements IColorTurtle {
	
	private CommandList commands;

	public SaveTurtle() {
		commands = new CommandList();
	}
	
	@Override
	public void move(int length) {
		commands.addCommand(new CommandMove(length));
	}

	@Override
	public void turn(int angle) {
		commands.addCommand(new CommandTurn(angle));
	}

	@Override
	public void up() {
		commands.addCommand(new CommandUp());
	}

	@Override
	public void down() {
		commands.addCommand(new CommandDown());
	}

	@Override
	public void setColor(Color color) {
		commands.addCommand(new CommandSetColor(color));
	}
	
	public CommandList getCommand() {
		return this.commands;
	}

}
