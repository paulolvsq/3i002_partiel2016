package pobj.tme6;

import java.awt.Color;

public class CommandSetColor implements ICommand {
	
	private Color color;
	
	public CommandSetColor(Color color) {
		this.color = color;
	}
	
	public void execute(IColorTurtle turtle) {
		turtle.setColor(color);
	}

}
