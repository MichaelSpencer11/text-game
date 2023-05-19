package textgame;

import java.util.ArrayList;
import java.util.Scanner;

public class Automaton extends Character {
	
	private int autoStoryCount = 0;
	private boolean following;
	
	public Automaton(String name, String description, Room firstRoom){
		this.name = name;
		this.type = this.typeToString();
		this.description = description;
    	this.hasName = true;
    	this.inventory = new ArrayList<Item>();
    	this.asleep = false;
        this.prone = false;
        this.sitting = false;
        this.standing = true;
        this.currentRoom = firstRoom;
        this.currentRoom.people.add(this);
        
        
        
    }

	public void talk(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello. How can I help you today?");
		System.out.println("Buy");
		System.out.println("Sell");
		String response = sc.nextLine();
		if(response.equalsIgnoreCase("buy")){
			//what can you buy

		}

	}
}
