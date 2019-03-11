package pobj.tme6;

<<<<<<< HEAD
import javafx.scene.paint.Color;
=======
import java.awt.Color;
>>>>>>> 65d314c5cb9b38fc32e6964a10ebdba1d205a264

public class ContextTurtle extends ColorTurtle implements IColorTurtle {
	
	private IContext t;
	
	public ContextTurtle(IContext t) {
		this.t = t;
	}
	
	public void drawLine(int x1, int y1, int x2, int y2, Color color) {
		t.drawLine(x1, y1, x2, y2, color);
	}
	
	public void draw(int x1, int y1, int x2, int y2, Color color) {
		this.drawLine(x1, y1, x2, y2, color);
<<<<<<< HEAD
}
=======
	}
>>>>>>> 65d314c5cb9b38fc32e6964a10ebdba1d205a264

}
