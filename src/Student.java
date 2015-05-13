
public class Student {
	int id;
	public String firstName;
	public String lastName;
	public String address;
	
	public Student(int id, String firstName, String lastName, String address){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String toString() {
		String s = "Student:"+id+"\nFirst Name: "+ firstName + "\nLast Name:" + lastName + " \nAddress:" + address;
		
		return s;
	}
	
}
