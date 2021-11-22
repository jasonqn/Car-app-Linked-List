package question1;

public interface List {

	public int size();
	public boolean isEmpty();
	public int getAverage();
	public void add(int index, CarDetails carDetails);
	public String remove(String registration);
	String getProblem(CarDetails problem);
	public void printList();
	
	
}
