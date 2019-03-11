package pobj.tme6;

import javafx.scene.paint.Color;

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
}

}
