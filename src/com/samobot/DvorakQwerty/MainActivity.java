package com.samobot.DvorakQwerty;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class MainActivity {
	
	public static Map<Character, Character> qwertyToDvorak = new HashMap<>(); //maps for conversion to qwerty keyboard on dvorak computer
	public static Map<Character, Character> dvorakToQwerty = new HashMap<>(); //maps for conversion to dvorak keyboard on qwerty computer
	
	public static void populateMaps() {
		
		//qwerty to dvorak
		qwertyToDvorak.put('q', '\'');
		qwertyToDvorak.put('w', ',');
		qwertyToDvorak.put('e', '.');
		qwertyToDvorak.put('r', 'p');
		qwertyToDvorak.put('t', 'y');
		qwertyToDvorak.put('y', 'f');
		qwertyToDvorak.put('u', 'g');
		qwertyToDvorak.put('i', 'c');
		qwertyToDvorak.put('o', 'r');
		qwertyToDvorak.put('p', 'l');
		qwertyToDvorak.put('s', 'o');
		qwertyToDvorak.put('d', 'e');
		qwertyToDvorak.put('f', 'u');
		qwertyToDvorak.put('g', 'i');
		qwertyToDvorak.put('h', 'd');
		qwertyToDvorak.put('j', 'h');
		qwertyToDvorak.put('k', 't');
		qwertyToDvorak.put('l', 'n');
		qwertyToDvorak.put('z', ';');
		qwertyToDvorak.put('x', 'q');
		qwertyToDvorak.put('c', 'j');
		qwertyToDvorak.put('v', 'k');
		qwertyToDvorak.put('b', 'x');
		qwertyToDvorak.put('n', 'b');
		qwertyToDvorak.put(';', 's');
		qwertyToDvorak.put(',', 'w');
		qwertyToDvorak.put('.', 'v');
		qwertyToDvorak.put('/', 'z');
		qwertyToDvorak.put('\'', '-');
		qwertyToDvorak.put('[', '/');
		qwertyToDvorak.put(']', '=');
		qwertyToDvorak.put('-', '[');
		qwertyToDvorak.put('=', ']');
		
		//letters+shift
		qwertyToDvorak.put('Q', '\"');
		qwertyToDvorak.put('W', '<');
		qwertyToDvorak.put('E', '>');
		qwertyToDvorak.put('R', 'P');
		qwertyToDvorak.put('T', 'Y');
		qwertyToDvorak.put('Y', 'F');
		qwertyToDvorak.put('U', 'G');
		qwertyToDvorak.put('I', 'C');
		qwertyToDvorak.put('O', 'R');
		qwertyToDvorak.put('P', 'L');
		qwertyToDvorak.put('S', 'O');
		qwertyToDvorak.put('D', 'E');
		qwertyToDvorak.put('F', 'U');
		qwertyToDvorak.put('G', 'I');
		qwertyToDvorak.put('H', 'D');
		qwertyToDvorak.put('J', 'H');
		qwertyToDvorak.put('K', 'T');
		qwertyToDvorak.put('L', 'N');
		qwertyToDvorak.put('Z', ':');
		qwertyToDvorak.put('X', 'Q');
		qwertyToDvorak.put('C', 'J');
		qwertyToDvorak.put('V', 'K');
		qwertyToDvorak.put('B', 'X');
		qwertyToDvorak.put('N', 'B');
		qwertyToDvorak.put(':', 'S');
		qwertyToDvorak.put('<', 'W');
		qwertyToDvorak.put('>', 'V');
		qwertyToDvorak.put('?', 'Z');
		qwertyToDvorak.put('\"', '_');
		qwertyToDvorak.put('{', '?');
		qwertyToDvorak.put('}', '+');
		qwertyToDvorak.put('_', '{');
		qwertyToDvorak.put('+', '}');
		
		//dvorak to qwerty
		dvorakToQwerty.put('\'', 'q');
		dvorakToQwerty.put(',', 'w');
		dvorakToQwerty.put('.', 'e');
		dvorakToQwerty.put('p', 'r');
		dvorakToQwerty.put('y', 't');
		dvorakToQwerty.put('f', 'y');
		dvorakToQwerty.put('g', 'u');
		dvorakToQwerty.put('c', 'i');
		dvorakToQwerty.put('r', 'o');
		dvorakToQwerty.put('l', 'p');
		dvorakToQwerty.put('o', 's');
		dvorakToQwerty.put('e', 'd');
		dvorakToQwerty.put('u', 'f');
		dvorakToQwerty.put('i', 'g');
		dvorakToQwerty.put('d', 'h');
		dvorakToQwerty.put('h', 'j');
		dvorakToQwerty.put('t', 'k');
		dvorakToQwerty.put('n', 'l');
		dvorakToQwerty.put(';', 'z');
		dvorakToQwerty.put('q', 'x');
		dvorakToQwerty.put('j', 'c');
		dvorakToQwerty.put('k', 'v');
		dvorakToQwerty.put('x', 'b');
		dvorakToQwerty.put('b', 'n');
		dvorakToQwerty.put('s', ';');
		dvorakToQwerty.put('w', ',');
		dvorakToQwerty.put('v', '.');
		dvorakToQwerty.put('z', '/');
		dvorakToQwerty.put('-', '\'');
		dvorakToQwerty.put('/', '[');
		dvorakToQwerty.put('=', ']');
		dvorakToQwerty.put('[', '-');
		dvorakToQwerty.put(']', '=');
		
		//letters+shift
		dvorakToQwerty.put('\"', 'Q');
		dvorakToQwerty.put('<', 'W');
		dvorakToQwerty.put('>', 'E');
		dvorakToQwerty.put('P', 'R');
		dvorakToQwerty.put('Y', 'T');
		dvorakToQwerty.put('F', 'Y');
		dvorakToQwerty.put('G', 'U');
		dvorakToQwerty.put('C', 'I');
		dvorakToQwerty.put('R', 'O');
		dvorakToQwerty.put('L', 'P');
		dvorakToQwerty.put('O', 'S');
		dvorakToQwerty.put('E', 'D');
		dvorakToQwerty.put('U', 'F');
		dvorakToQwerty.put('I', 'G');
		dvorakToQwerty.put('D', 'H');
		dvorakToQwerty.put('H', 'J');
		dvorakToQwerty.put('T', 'K');
		dvorakToQwerty.put('N', 'L');
		dvorakToQwerty.put(':', 'Z');
		dvorakToQwerty.put('Q', 'X');
		dvorakToQwerty.put('J', 'C');
		dvorakToQwerty.put('K', 'V');
		dvorakToQwerty.put('X', 'B');
		dvorakToQwerty.put('B', 'N');
		dvorakToQwerty.put('S', ':');
		dvorakToQwerty.put('W', '<');
		dvorakToQwerty.put('V', '>');
		dvorakToQwerty.put('Z', '?');
		dvorakToQwerty.put('_', '\"');
		dvorakToQwerty.put('?', '{');
		dvorakToQwerty.put('+', '}');
		dvorakToQwerty.put('{', '_');
		dvorakToQwerty.put('}', '+');
		
	}
	
	public static String convertQwerty(String qwerty) {
		
		char[] chars = qwerty.toCharArray(); //convert input text to character array
		
		for(int i=0; i<chars.length; i++) { //cycle through character array and locate the characters in the hash map
			System.out.println(new Character(chars[i])); 
			chars[i] = qwertyToDvorak.getOrDefault(new Character(chars[i]), chars[i]); //set new character to hash map lookup result
		}
		
		System.out.print(qwerty + " : ");
		System.out.println(chars);
		
		return new String(chars);
	}
	
	public static String convertDvorak(String qwerty) { //same as convertQwerty() but in reverse
		
		char[] chars = qwerty.toCharArray();
		
		for(int i=0; i<chars.length; i++) {
			System.out.println(new Character(chars[i]));
			chars[i] = dvorakToQwerty.getOrDefault(new Character(chars[i]), chars[i]);
		}
		
		System.out.print(qwerty + " : ");
		System.out.println(chars);
		
		return new String(chars);
	}

	public static void mainWindow() {
		
		//Create frame and remove layout manager
		JFrame frame = new JFrame("Dvorak-Qwerty Converter");
		frame.setLayout(null);
		
		frame.addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent e) {}
			public void windowIconified(WindowEvent e) {}
			public void windowDeiconified(WindowEvent e) {}
			public void windowDeactivated(WindowEvent e) {}
			public void windowClosing(WindowEvent e) {
				System.exit(0); //Listen for click on X button and terminate program
			}
			public void windowClosed(WindowEvent e) {}
			public void windowActivated(WindowEvent e) {}
		});
		
		//Create main panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		//Create and setup UI elements
		JTextArea ta = new JTextArea();
		JButton convertQwerty = new JButton("Convert to Qwerty");
		JButton convertDvorak = new JButton("Convert to Dvorak");
		
		ta.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED)); //text area border
		ta.setBounds(10, 10, 560, 600); //set size and placement
		
		convertQwerty.addActionListener(new ActionListener() { //button action
			public void actionPerformed(ActionEvent event) {
				ta.setText(convertQwerty(ta.getText())); //set the text to the current text converted
			}	
		});
		convertQwerty.setBounds(10, 620, 275, 60);
		
		convertDvorak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ta.setText(convertDvorak(ta.getText()));
			}
			
		});
		convertDvorak.setBounds(295, 620, 275, 60);
		
		//add items to panel and set main content pane
		panel.add(convertQwerty);
		panel.add(convertDvorak);
		panel.add(ta);
		frame.setContentPane(panel);
		frame.setSize(new Dimension(600, 730)); //window size
		frame.setVisible(true); //finish setup and make window visible
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello Dvorak");
		
		populateMaps(); //populate the maps with conversion data
		
		mainWindow(); //create main window
		
	}
	
}
