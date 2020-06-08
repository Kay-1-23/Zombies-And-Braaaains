package game;

import edu.monash.fit2099.engine.*;

public class Shotgun extends RangedWeapon {
    final String [] DIRECTIONS = {"North", "North-East", "East", "South-East", "South", "South-West", "West", "North-West"};

    public Shotgun() {
        super("Shotgun", 'G', 20, "bangs");
    }

    @Override
    public Action subMenu(Actor actor, GameMap map, Display display) {
        Actions actions = new Actions();
        for(String direction : DIRECTIONS){
            actions.add(new ShotDirectionAction(this, direction));
        }
        return menu.showMenu(actor, actions, display);
    }

}
