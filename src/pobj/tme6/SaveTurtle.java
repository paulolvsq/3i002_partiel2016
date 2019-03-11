package pobj.tme6;

<<<<<<< HEAD
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
=======
import java.awt.Color;

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
>>>>>>> 65d314c5cb9b38fc32e6964a10ebdba1d205a264
	}

}
