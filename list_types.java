package p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class list_types {
	public static void main(String[] args) {
		String ANSI_RESET = "\u001B[0m";
		String ANSI_RED = "\u001B[31m";
	    String ANSI_GREEN = "\u001B[32m";
	    String ANSI_YELLOW = "\u001B[33m";
	    String ANSI_BLUE = "\u001B[34m";
	    String ANSI_PURPLE = "\u001B[35m";
	    String ANSI_CYAN = "\u001B[36m";
	    String ANSI_WHITE = "\u001B[37m";
	    System.out.println(ANSI_RED + "This text is red!");
        System.out.println(ANSI_GREEN + "This text is green!");
        System.out.println(ANSI_YELLOW + "This text is yellow!");
        System.out.println(ANSI_BLUE + "This text is blue!");
        System.out.println(ANSI_PURPLE + "This text is purple!" );
        System.out.println(ANSI_CYAN + "This text is cyan!");
        System.out.println(ANSI_WHITE + "This text is white!");
        String colors[]= {"\u001B[31m","\u001B[32m","\u001B[33m",
        		"\u001B[34m","\u001B[35m","\u001B[37m","\u001B[9m"};
        Thread t=new Thread();
        for(String s:colors) {
        	t.sleep(90);
        	System.out.print(s+"		");
        }
	}
} 
public class ColorfulText {
    // ANSI escape codes for resetting and setting RGB colors
    public static final String RESET = "\u001B[0m";

    // Method to generate ANSI escape code for RGB colors
    public static String getRGBColor(int r, int g, int b) {
        return String.format("\u001B[38;2;%d;%d;%dm", r, g, b);
    }

    public static void main(String[] args) {
        // Example RGB values
        int red = 255;
        int green = 100;
        int blue = 50;

        // Generate the ANSI escape code for the given RGB values
        String rgbColor = getRGBColor(red, green, blue);

        // Print the colorful text
        System.out.println(rgbColor + "This is colorful text!" + RESET);
    }
}

