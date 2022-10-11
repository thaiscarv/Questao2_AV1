package Questao2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) throws FileNotFoundException {

	        Scanner scanner;
	        Stack stack = new Stack();
	        String assistente1 [] = new String [20];
	        scanner = new Scanner(new File("C:\\Users/Thaís Carvalho/Documents/pilha1.txt"));
	        scanner = new Scanner(new File("C:\\Users/Thaís Carvalho/Documents/pilha2.txt"));
	        scanner = new Scanner(new File("C:\\Users/Thaís Carvalho/Documents/pilha3.txt"));
	        while (scanner.hasNextLine()){
	            stack.push(scanner.nextLine());
	        }
	       
		}
		

	}
