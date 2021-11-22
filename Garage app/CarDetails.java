package question1;

//construct elements that each node will contain, create setters and getters so method can call on them
public class CarDetails {
	private String registration;
	private String ownerName;
	private String contactNumber;
	private String problem;
	private int cost;
	private String status;
	
	public CarDetails(String registration,String ownerName, String contactNumber, String problem, int cost, String status) {
		
		this.registration = registration;
		this.ownerName = ownerName;
		this.contactNumber = contactNumber;
		this.problem = problem;
		this.cost = cost;
		this.status = status;		
	}
	
	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Car Details"+  "\n" +
				"Registration: " + registration + "\n" +
				"Owner Name: " + ownerName + "\n" +
				"Contact Number: " + contactNumber + "\n" +
				"Problem: " + problem + "\n" +
				"Cost: " + cost + "\n" +
				"Status: " + status + "\n" + "\n"; 
				
	}
	
	
}
