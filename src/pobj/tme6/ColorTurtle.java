package pobj.tme6;

import javafx.scene.paint.Color;

public class ColorTurtle extends Turtle implements IColorTurtle {
	
	@SuppressWarnings("unused")
	private Color color;
	
	public ColorTurtle() {
		super();
		color = Color.BLACK;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void move(int length) {
		int newX = this.x + (int)(length*Math.sin(angle*Math.PI / 180.));
		int newY = this.y + (int)(length*Math.cos(angle*Math.PI / 180.));
		if(this.crayonUp == false) draw(this.x, this.y, newX, newY, color);
		this.x = newX;
		this.y = newY;
	}
	
	public void draw(int x1, int y1, int x2, int y2, Color color) {
		System.out.println(x1+" "+y1+" "+x2+" "+y2+" "+color.toString());
	}

}
