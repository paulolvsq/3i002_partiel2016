package pobj.tme6;

public class Turtle implements ITurtle {
	
	protected int x;
	protected int y;
	protected int angle;
	protected boolean crayonUp;
	
	public Turtle() {
		this.x = 0;
		this.y = 0;
		this.angle = 0;
		crayonUp = false;
	}
	
	public void move(int length) {
		int newX = this.x + (int) (length * Math.sin(angle * Math.PI / 180.));
		int newY = this.y + (int) (length * Math.cos(angle * Math.PI / 180.));
		if(!crayonUp) draw(this.x, this.y, newX, newY);
		this.x = newX;
		this.y = newY;
	}
	
	public void turn(int angle) {
		this.angle += angle;
	}
	
	public void up() {
		this.crayonUp = true;
	}
	
	public void down() {
		this.crayonUp = false;
	}
	
	public void draw(int x1, int y1, int x2, int y2) {
		System.out.println(x1+" "+y1+" "+x2+" "+y2);
	}

}
