package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) 
	{
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledSquare(1.0, 1.0, 1.0);

		StdDraw.setPenColor(Color.GRAY);
		StdDraw.filledCircle(.5, .5, .25);

		double[] x = {0.25, 0.3, 0.45};
		double[] y = {0.52, 0.87, 0.73};
		StdDraw.filledPolygon(x, y);
		
		double[] a = { 0.45, 0.7, 0.75};
		double[] b = { 0.52, 0.87, 0.53};
		StdDraw.filledPolygon(a,b);
		
		StdDraw.setPenColor(Color.WHITE);
		// left whiskers
		StdDraw.line(0.1, 0.6, 0.3, 0.55);
		StdDraw.line(0.1, 0.50, 0.3, 0.50);
		
		// right whiskers
		StdDraw.line(0.7, 0.55, 0.9, 0.6);
		StdDraw.line(0.7, 0.50, 0.9, 0.50);
	}

}
