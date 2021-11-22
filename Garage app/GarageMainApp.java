package question1;

public class GarageMainApp {

	public static void main(String[] args) {
		
		CarDetails jason = new CarDetails ("19-D-12", "Jason Quinn", "085X123X123", "Car engine", 100, "Ready for Collection");
		CarDetails niamh = new CarDetails ("19-C-20", "Niamh O'Connell", "085X122C153", "Broken Window", 20, "Ready for Collection");
		CarDetails amy = new CarDetails ("19-B-21", "Amy Slurp", "085X123X123", "Rear Mirror", 80, "Ready for Collection");
		CarDetails conor = new CarDetails ("20-D-19", "Conor Dolan", "085X123X123", "No Wheels", 400, "Ready for Collection");
		CarDetails mick = new CarDetails ("5-K-18", "Mick Nally", "085X123X123", "Blinker light", 500, "Ready for Collection");
	
	GarageMain list = new GarageMain();
	list.add(0,jason);
	list.add(1, mick);
	list.add(2, niamh);
	list.add(3, amy);
	list.add(4, conor);
	
	//list.printList();
	
	//list.remove("19-D-12");
	
	list.printList();
	
	//list.add(0, jason);
	
	//list.printList();
	
	//list.getAverage();
	
	list.size();
	
	//list.isEmpty();
	
	//list.getProblem(amy);
	
	
	
	}
	
	
	
}
