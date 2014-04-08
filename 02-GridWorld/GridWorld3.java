public class Jumper extends Actor{

    public Jumper(Color col){
	super();
	setColor(col);
    }

    public void act(){
	if(canJump()){
	    jump();
	}else{
	    turn();
	}
    }
    
    public void turn(){
	setDirection(getDirection() + Location.HALF_RIGHT);
    }

    public void jump(){
	Grid g = getGrid();
	if(g == null){
	    return;
	}
	Location current = getLocation();
	Location next = current.getAdjacentLocation(getDirection());
	Location jump = next.getAdjacentLocation(getDirection());
	if(gr.isValid(jump)){
	    moveTo(jumpTarget);
	}else{
	    removeSelfFromGrid();
	}
    }

    public boolean canJump(){
	Grid g = getGrid();
	if(g ==null){
	    return false;
	}
	Location current = getLocation();
	Location next = current.getAdjacentLocation(getDirection());
	if(!g.isValid(next)){
	    return false;
	}
	Actor neighbor - g.get(next);
	if(!(neighbor == null) || (neighbor instance of Rock) 
	   || (neighbor instanceof Flower)){
	    return false;
	}
	
	Location jump - next.getAdjacentLocation(getDirection());
	if(!gr.isValid(jump)){
	    return false;
	}
	Actor target = gr.get(jumpTarget);
	boolean works = ((neighbor == null) || (neighbor instanceof Rock)
			 || (neighbor instanceof Flower));
	return works;
    }
}

public class JumperRunner{
    public static void main(String[]args){
	ActorWorld world - new ActorWorld();
	world.add(new Jumper());
	world.add(new Rock());
	world.add(new Bug());
	world.add(new Flower());
	world.show();
    }
}
