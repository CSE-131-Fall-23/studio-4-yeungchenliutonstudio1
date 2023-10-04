package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shape = in.next();

		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();

		Color color = new Color(red,green, blue);
		StdDraw.setPenColor(color);

		boolean isFilled = in.nextBoolean();

		//		double x = in.nextDouble();
		//		double y = in.nextDouble();
		//		double halfWidth = in.nextDouble();
		//		double halfHeight = in.nextDouble();

		//String shapeType, int redComponent, int greenComponent, int blueComponent, boolean isFilled


		if(shape.equals("triangle")) 
		{			
			double[] x = new double[3];
			double[] y = new double[3];

			for(int i = 0; i < x.length; i++) {
				x[i] = in.nextDouble();
				y[i] = in.nextDouble();
			}
			StdDraw.filledPolygon(x,y);
		}



		//		if(isFilled)
		//		{
		//			StdDraw.filledRectangle(x,y,halfWidth,halfHeight);
		//		}
		//		else {
		//			StdDraw.rectangle(x,y,halfWidth,halfHeight);
		//		}
	}
}
