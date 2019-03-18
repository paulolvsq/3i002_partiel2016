package pobj.tme6;

public class CommandMove implements ICommand {

	private int length;

	public CommandMove(int length) {
		this.length = length;
	}
	
	public void execute(IColorTurtle turtle) {
		turtle.move(length);
	}

}
