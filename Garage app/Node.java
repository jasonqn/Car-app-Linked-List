package question1;

public class Node {
	
	CarDetails carDetails;
	Node next;
		
	public Node(CarDetails carDetails, Node next) {
		this.carDetails = carDetails;
		this.next = null;
	}
	
	public CarDetails getCarDetails() {
		return carDetails;
	}
	
	public void setCarDetails(CarDetails carDetails) {
		this.carDetails = carDetails;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void SetNext(Node next) {
		this.next = next;
	}

	
	
	@Override
	public String toString() {
		return carDetails.toString();
	}
	
	


}
