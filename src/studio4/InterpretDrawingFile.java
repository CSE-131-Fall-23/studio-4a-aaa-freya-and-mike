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
		
		String shapeType = in.nextLine();
		
		int redComponent=in.nextInt();
		
		int greenComponent=in.nextInt();
		
		int blueComponent=in.nextInt();
	
		
		boolean isFilled=in.nextBoolean();
		if(shapeType.equals("Rectangle")) 
		
		{double parameterOne=in.nextDouble();
		
		double parameterTwo=in.nextDouble();
		
		double parameterThree=in.nextDouble();
		
		double parameterFour=in.nextDouble();
		
		if(isFilled==true)
		{
			Color color1 = new Color(redComponent,greenComponent,blueComponent);
			StdDraw.setPenColor(color1);
			StdDraw.filledRectangle(parameterOne,parameterTwo,parameterThree,parameterFour);
	
		}
		if(isFilled==false)
		{
			Color color1 = new Color(redComponent,greenComponent,blueComponent);
			StdDraw.setPenColor(color1);
			StdDraw.rectangle(parameterOne,parameterTwo,parameterThree,parameterFour);
		}
		}
		
		
		//StdDraw.setPencolor(Color.PINK);
		//StdDraw.filledRectangle(0.5, 0.5, 1, 1);
	}
}
