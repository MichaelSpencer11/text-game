package textgame.regions;

import textgame.Room;
import textgame.World;

public class TsiporimTown extends Region {

    public Room nLink;

    public TsiporimTown(){}

    public TsiporimTown(World world){
        Room inFrontOfHome = new Room("town", "Peregrine street in front of home", "The street in front of your home. It extends to the east and terminates to the west with a view of the forest.", null,null,null,null,null,null,null,null,null,null );
        Room ParkNW = new Room("grass", "Park with a footpath", "A park with a footpath and trees defies the constant rain. You can see a pond to the southeast.", inFrontOfHome, null,null,null,null,null,null,null,null,null);
        Room ParkN = new Room("grass", "Park with a footpath", "A park with a footpath circles around a delicately surfaced pond. The rain jabbers the ground in sheety layers.", null,null,null,null,null,null, null, ParkNW,null,null );
        Room ParkNE = new Room("grass","Park with a footpath","The northeast corner of the park. There is a restroom here.",null,null,null,null,null,null,ParkN,null,null,null);
        Room ParkE = new Room("grass", "Park with a footpath", "The end of the park that runs along Main street.",ParkNE,null,null,null,null,null,null,ParkN,null,null);
        Room ParkSE = new Room("grass","Park with a footpath","The southeast section of the park. There is a new looking tennis court here.", ParkE,null,null,null,null,null,null,null,null,null);
        Room ParkS = new Room("grass", "Park with a footpath", "As the path curves around, you can see that there are less trees in this area.", null,ParkE,ParkSE,null,null,null,null,null,null,null);
        Room ParkSW = new Room("grass", "Park with a footpath","Southwest end of the park. There are more trees in this area.",null,null,ParkS,null,null,null,null,null,null,null);
        Room ParkW = new Room("grass","Park with a footpath","At his part of the park there is a little gazebo with some benches in it.",ParkNW,ParkN,null,null,ParkSW,null,null,null,null,null);
        Room ParkMiddle = new Room("grass","Park with a pond", "A pond is here and there are a few ducks coasting in the water and dipping their heads.",ParkN,ParkNE,ParkE,ParkSE,ParkS,ParkSW,ParkW,ParkNW,null,null);


        nLink = inFrontOfHome;
    }

    public Room getNLink(){
        return nLink;
    }
}
