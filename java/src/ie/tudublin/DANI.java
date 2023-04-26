package ie.tudublin;

//

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	String[] findword;
	String[] str;

	public String[] findWrd()
	{
		return null;
	}

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() 
	{
		//space key pressed new sonnet created
	

	}


	//creating loadfile() method 
	public void loadfile()
	{
		String w = "";
		String s = "";
		String line = "";


		loadStrings("small.txt"); // Load a text file into a String array
		split(line, ' '); // Split a string into an array of words
		w.replaceAll("[^\\w\\s]",""); // Remove punction characters
		s.toLowerCase(); // Convert a string to lower case 



	}

	public void printModel()
	{
		//must open file so it can load the data inside the text file
		//openfile = open("small.text", "txt");
	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}
