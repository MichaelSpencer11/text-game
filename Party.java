package textgame;

import java.util.ArrayList;
import java.util.List;

public class Party {
    protected String leaderName;
    protected String partyName;
    protected ArrayList<Character> partyList;
    protected List<Character> globalCharacterList;

    public Party(String name, List<Character> globalCharacterList){
        this.partyName = name;
        this.globalCharacterList = globalCharacterList;
    }

    public static void createParty(String name){
        Party party = new Party(name, World.getGlobalCharacterList());
        
        System.out.println("Party " + party.partyName + " was created.");
        
    }

    public void addMember(String name){
        for(Character c : World.getGlobalCharacterList()){
            if(name.equals(c.name)){
                partyList.add(c);
                System.out.println("Character " + c.name + " was added to the party.");
            }
        }
    }

    public void listMembers(){
        System.out.println("List of party members:");
        for (Character c : partyList){
            System.out.println(c.name + " : " + c.job + " : " + c.job.level);
        }
    }

}
