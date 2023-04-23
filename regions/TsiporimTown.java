package textgame.regions;

import textgame.Room;
import textgame.World;

public class TsiporimTown extends Region {

    public Room nLink;

    //Put Rooms here
    

    public TsiporimTown(){}

    public TsiporimTown(World world){
        Room inFrontOfHome = new Room("town", "Peregrine street in front of home", "The street in front of your home. It extends to the east and terminates to the west with a view of the forest.", null,null,null,null,null,null,null,null,null,null );
        
        nLink = inFrontOfHome;
    }

    public Room getNLink(){
        return nLink;
    }
}
