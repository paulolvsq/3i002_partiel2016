package pobj.tme6;

public class CommandTurn implements ICommand {
	
	private int angle;
	
	public CommandTurn(int angle) {
		this.angle = angle;
	}
<<<<<<< HEAD

	@Override
=======
	
>>>>>>> 65d314c5cb9b38fc32e6964a10ebdba1d205a264
	public void execute(IColorTurtle turtle) {
		turtle.turn(angle);
	}

}
