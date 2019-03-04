package pobj.tme6;

import java.awt.Color;

public class BoundContext implements IContext{
	
	private int MinX;
	private int MinY;
	private int MaxX;
	private int MaxY;

	public void drawLine(int x1, int y1, int x2, int y2, Color color) {
		if(x1 < MinX) MinX = x1;
		if(x2 < MinX) MinX = x2;
		if(x1 > MaxX) MaxX = x1;
		if(x2 > MaxX) MaxX = x2;
		if(y1 < MinX) MinY = y1;
		if(y2 < MinX) MinY = y2;
		if(y1 > MaxX) MaxY = y1;
		if(y2 > MaxX) MaxY = y2;
	}
	
	public int getMinX() {
		return this.MinX;
	}
	
	public int getMinY() {
		return this.MinY;
	}
	
	public int getMaxX() {
		return this.MaxX;
	}
	
	public int getMaxY() {
		return this.MaxY;
	}

}
