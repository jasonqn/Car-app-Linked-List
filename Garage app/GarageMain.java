package question1;

public class GarageMain implements List {
	
	//represent first and last node in linkedList
	private Node first;
	private Node last;
	
	public GarageMain() {
		first = null;
		last = null;
	}
	
	//checks how many nodes are in the list
	public int size() {
		int size = 0;
		//set new Node current to first, incrementally go through the list +1 so long as current doesn't = null
		Node current = first;
		while(current != null) {
			size++;
			current = current.next;
		}
		//return how many elements are found in linkedList
		return size;
	}
	
	//checks if list is empty
	public boolean isEmpty() {
		return first == null;
	}
	
	//retrieves the average cost for car repairs
	public int getAverage() {
		int sum = 0;
		int answer = 0;
		//checks if linkedList is empty
	    if (!isEmpty()) {
	    	Node node = first;
	    	//increments through linked list adding costs of each node together
	        while (node != null) {
	        	sum = sum + node.carDetails.getCost();
	            node = node.next;
	        }
	        //divides the sum of costs against the size of the linkedList
	        answer = sum / size();
	    }
	    return answer;
	}
	
	//first ensures list isn't overflowing
	public void add(int index, CarDetails carDetails) {
		if(index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}
		//if list is empty then add node making it first and last in the list
		if(index == 0) {
			first = new Node(carDetails, first);
			if(last == null) {
				last = first;
			}
			return;
		}
		//creates new node to traverse through list
		Node current = first;
		for(int j = 1; j <= index -1; j++) {
			current = current.next;
		}
		//create new node "insert" and make it next to current
		Node insert = new Node(carDetails, current.next);
		current.next = insert;
		//if the node after current and insert is null then make insert last in queue
		if(current.next.next == null) {
			last = insert;
		}
	}
	
	public String remove(String registration){
		Node node = this.first;
        int counter = 0;
        while (node.next != null) {
        	if (!node.carDetails.getRegistration().equalsIgnoreCase(registration)) {
        		counter++;
        		node = node.next;
        	}
        	else {
        		break;
        	}
        }
        if(counter == size()) {
        	return "Not Found";
        } 
        else {
        	node = this.first;
        	counter = 1;
        	if(this.first.carDetails.getRegistration().equalsIgnoreCase(registration)) {
        		this.first = first.next;
          }
          else {
        	  while(!node.next.carDetails.getRegistration().equalsIgnoreCase(registration)) {
        		  counter++;
        		  node = node.next;
        	  }
        	  if (counter == size() - 1) {
        		  this.last = node;
        		  this.last.next = null;
        	  }
        	  else {
        		  node.next = node.next.next;
            }
          }
        }
        return "Removed";
	}
	
	//get problem from node
	public String getProblem(CarDetails problem) {
		//create a node to traverse through each node on a while loop
        Node current = first;
        while (current != null && !current.carDetails.equals(problem)) {
            current = current.next;
        }
        //once current isn't null it will look for the status of the inputed car
        if (current != null && current.carDetails.equals(problem))
        return ((CarDetails) current.carDetails).getProblem();
        return null;
    }
	
	//print method
	public void printList() {
		Node current = first;
		while (current != null) {
			System.out.print(current);
			current = current.getNext();
		}
		System.out.println("\n");
	}

	
}
