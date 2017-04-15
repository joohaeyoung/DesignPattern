
public class AddCost {
	
	int addCost ;
	public AddCost(Vehicle.Color color){
			
		switch(color){
		case UNPAINTED:
			addCost= 0;
			break;
		case BLUE:
			addCost = 0;
			break;
		case BLACK:
			addCost = 0;
			break;
		case PERLWHITE:
			addCost = 100000;
			break;
		case WHITE:
			addCost = 0;
			break;
		case SILVER:
			addCost = 0;
			break;
		case GRAY:
			addCost = 0;
			break;
		case RED:
			addCost = 0;
			break;
		default:
			break;	
		}
	}
	
	public int addCost(){
		return addCost;
	}

}
