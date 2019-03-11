package pobj.tme6;

public class CommandMove implements ICommand {
<<<<<<< HEAD

	private int length;
	
=======
	
	private int length;

>>>>>>> 65d314c5cb9b38fc32e6964a10ebdba1d205a264
	public CommandMove(int length) {
		this.length = length;
	}
	
<<<<<<< HEAD
	@Override
	public void execute(IColorTurtle turtle) {
		turtle.move(length);
	}

=======
	public void execute(IColorTurtle turtle) {
		turtle.move(length);
	}
>>>>>>> 65d314c5cb9b38fc32e6964a10ebdba1d205a264
}
