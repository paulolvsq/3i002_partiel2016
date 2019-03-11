package pobj.tme6;

<<<<<<< HEAD
import javafx.scene.paint.Color;
=======
import java.awt.Color;
>>>>>>> 65d314c5cb9b38fc32e6964a10ebdba1d205a264

public class CommandSetColor implements ICommand {
	
	private Color color;
	
	public CommandSetColor(Color color) {
		this.color = color;
	}
<<<<<<< HEAD

	@Override
=======
	
>>>>>>> 65d314c5cb9b38fc32e6964a10ebdba1d205a264
	public void execute(IColorTurtle turtle) {
		turtle.setColor(color);
	}

}
