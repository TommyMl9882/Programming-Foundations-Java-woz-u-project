package com.tommymitchell.handson;
import java.util.ArrayList;
import java.util.Scanner;

public class Handson{
	//global Variables
	static ArrayList<Item> itemList;
	static Scanner scan;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize item array
		itemList = new ArrayList<Item>();
		//initialize scanner
		scan = new Scanner(System.in);
		//start$stop variable
		boolean isRunning = true;
		
		do {
		//display menu to user
			displayMenu();
			
		//get users choice
			int userChoice = readChoice();
			
			switch(userChoice) {
			case 1: //add an item
				addMenu();
				String itemAdd = scan.nextLine();
				addItem(itemAdd);
				break;
			case 2: //remove item
				addMenu();
				String itemRemove = scan.nextLine();
				removeItem(itemRemove);
				break;
			case 3: //mark item purchased
				addMenu();
				String itemMark = scan.nextLine();
				markItem(itemMark);
				break;
			case 4: //list out items
				listItems();
				break;
			case 0: //quit
				break;
			default:
				System.out.println("Invalid Input");
				
			}
			
		}while(isRunning);
		
	}
	
	//add item method
	public static void addItem(String add) {
		itemList.add(new Item(add));
	}
	
	//remove item method
	public static void removeItem(String remove) {
		itemList.remove(new Item(remove));
	}
	
	//mark item purchased
	
	public static void markItem(String mark) {
		itemList.toString();
	}
	
	//list out item method
	public static void listItems() {
		System.out.println("--My items--");
		for (int i = 0; i < Item.name(); i++) {
			System.out.println(i + 1 + ". " + Item.getName().toString());
		}
		if (Item.name() == 0) {
			System.out.println("No items found");
		}
	}

	//add menu method
	public static void addMenu() {
		System.out.println("Please enter the item name:");
	}
	
	//main menu display
public static void displayMenu() {
	System.out.println("---Main menu---");
	System.out.println("1. Add an Item");
	System.out.println("2. Remove an item");
	System.out.println("3. Mark item as done");
	System.out.println("4. List out items");
	System.out.println("0. Quit");
	System.out.println("Enter your numeric choice:");
	}

//method to read users input
	public static int readChoice() {
		int result = scan.nextInt();
		scan.nextLine();
		return result;
	}
}
