package textgame;

import java.util.ArrayList;

import textgame.items.*;
import textgame.Item;
import textgame.monsters.*;
import textgame.Party;
import textgame.ConsoleColors;
import textgame.Character;



public class World {
	
	private static ArrayList<Room> globalRoomList = new ArrayList<Room>();
	private static ArrayList<Item> globalItemList = new ArrayList<Item>();
	private static ArrayList<Door> globalDoorList = new ArrayList<Door>();
	private static ArrayList<Character> globalCharacterList = new ArrayList<Character>();
	private static ArrayList<Party> globalPartyList = new ArrayList<Party>();

	public static String aAn(String thing) {
		if(thing.toLowerCase().startsWith("a") ||
		thing.toLowerCase().startsWith("e") ||
		thing.toLowerCase().startsWith("i") ||
		thing.toLowerCase().startsWith("o") ||
		thing.toLowerCase().startsWith("u")) {
		return "an";
		} else return "a";
		}

		public static String capAAn(String thing) {
		if(thing.toLowerCase().startsWith("a") ||
		thing.toLowerCase().startsWith("e") ||
		thing.toLowerCase().startsWith("i") ||
		thing.toLowerCase().startsWith("o") ||
		thing.toLowerCase().startsWith("u")){
		return "An";
		} else return "A";
		}
		
		public static void setAllRoomsUnchecked() {
			
		}

		public static void setTimeout(Runnable runnable, int delay){
			new Thread(() -> {
				try {
					Thread.sleep(delay);
					runnable.run();
				}
				catch (Exception e){
					System.err.println(e);
				}
			}).start();
		}
		


		//this creates the world and begins the game. This is where you will place all the things to go in the world.
		public void createWorld() {

			
			    
		        Room room = new Room("interior", "Your room","This is your room. Your twin size bed is against one wall. Your desk is against another. There is a black computer monitor, a keyboard and a mouse on the desk.", null, null, null, null, null, null, null, null, null, null);
		        Bed yourBed = new Bed("bed", "A basic twin four post bed. It is a little squeaky but pretty comfortable.", room);
		        Room playerCloset = new Room("interior", "Your closet","Your walk-in closet. There are clothes hanging up in the closet and some on the floor neatly placed under the racks.", null, null, room, null, null, null, null, null, null, null);
		        Door closetDoor = new Door("east", "locked", playerCloset);
		        Key closetDoorKey = new Key("closet door key", "A small door key", closetDoor, playerCloset);
		        Room hallwayStairs = new Room("interior", "The hallway stairs","The upstairs hallway in your home. There is a stairway here that goes down.", room, null, null,null,null,null,null,null,null,null);
		        Room hallway = new Room("interior", "A hallway","The upstairs hallway in your house. There is a bannister next to the staircase and a way to the bathroom and your parents' room.", null, null, null, null, null, null, hallwayStairs, null, null, null);
		        Room bathroom = new Room("interior", "A bathroom" ,"The upstairs bathroom in your house. There is a large garden tub, a toilet and a sink. The room is decorated in floral drapes and leafy brown towels.", null, null, null, null, hallway, null, null, null, null, null);
		        Room parentsRoom = new Room("interior", "Your parents' room","Your parents' master bedroom. There is a king size bed with end tables and a dresser.", null, null, null, null, null, null, hallway, null, null, null);
		        Room stairway = new Room("interior", "A stairway", "The bottom of the stairway at your house. The stairs are carpeted with a thick woolish material and are alternating tan and brown. The kitchen is to the north and the living room is to the east.", null, null, null, null, null, null, null, null, hallwayStairs, null);
		        Room kitchen = new Room("interior", "The kitchen", "The kitchen looks modern, with muted colors for cabinets and a slate grey backsplash. There is also a kitchen island. The dining room is to the east and the stairway is to the south.", null, null, null, null, stairway, null, null, null, null, null);
		        Room livingRoom = new Room("interior", "The living room", "The living room feels very comfortable, with couches and pillows and blankets. Potted plants line the walls and windows. There is a lot of light in the room. ", null, null, null, null, null, null, stairway, null, null, null);
		        Room diningRoom = new Room("interior", "The dining room", "An oakwood dinner table is in the center of the room, surrounded by four folding chairs.", null, null, null, null, livingRoom, null, kitchen, null, null, null );
		        Room garage = new Room("interior", "The garage", "The family car is in here, as well as some storage containers.", null, null, null, null, null, null, livingRoom, null, null, null);
		        Room frontLawn = new Room("grass", "The front Lawn", "The lawn is overgrown and looks like it hasn't been taken care of in ages.", livingRoom, null, null, null, null, null, null, null, null, null);
		        
		        //Item practiceStaff = new Weapon("wooden staff", "A wooden practice staff. It has a few nicks and cuts in it and is quite worn.", "The staff feels as heavy as a metal staff in your hand, but it is still made out of wood.", playerCloset);
		        //Item practicesword = new Weapon("wooden sword", "A wooden practice sword. It has a few nicks and cuts in it and is quite worn.", "The sword feels as heavy as a metal sword in your hand, but it is still made out of wood.", playerCloset);
		        Desk desk = new Desk("desk", "Your wooden desk in your room. It has a few nicks in the finish but is very sturdy.", room);
		        Character player = new Character(room);
				player.homePoint = room;
		        Character familiar = new Familiar("Someone is standing or floating here, it is very hard to see them, they are almost not there but you know that there is definitely a presence here.", room, player);
		        Character automaton = new Automaton("An ordinary looking automaton with mechanical limbs and a rudimentary programmed action stack. It is currently sitting in a corner non-functionally." , room);
				Monster Leafer = new Leafer(room);
		        System.out.println(ConsoleColors.CYAN + "Hello, welcome. Please 'look' or 'l' to look around the room. 'Take' some items and 'equip', 'unequip', and 'drop' them. Type 'help' to get some." + ConsoleColors.RESET );
		        Input input = new Input(player);
		        input.input();
}
		
		public World(){}

		public ArrayList<Room> getGlobalRoomList(){
			return globalRoomList;
		}
		
		public ArrayList<Item> getGlobalItemList(){
			return globalItemList;
		}
		
		public ArrayList<Door> getGlobalDoorList() {
			return globalDoorList;
		}

		public static ArrayList<Character> getGlobalCharacterList(){
			return globalCharacterList;
		}

		public static ArrayList<Party> getGlobalPartyList(){
			return globalPartyList;
		}
		
		public static void addRoomToGlobalRoomList(Room room) {
			globalRoomList.add(room);
		}
		
		public static void addItemToGlobalItemList(Item item) {
			globalItemList.add(item);
		}
		
		public static void addDoorToGlobalDoorList(Door door) {
			globalDoorList.add(door);
		}
		
}		
