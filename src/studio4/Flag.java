package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(150, 255, 150);
		StdDraw.filledRectangle(0.5, 0.5, 0.4,0.25);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledEllipse(0.5, 0.5, 0.3,0.15);
		StdDraw.setPenColor(150, 150, 150);
		double [] x = {0.3,0.5,0.7};
		double [] y = {0.4,0.65,0.4};
		StdDraw.filledPolygon(x,y);
	}
}