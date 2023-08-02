/*
 * It is a special method to intilize the object
 * 
 * Note-it is a non static but behave like static value is same but everytime creates new methode
 */
public class Google {
	int id;
	String name;
	int salary;
	static String cname = "Google";
	
	Google(){
		id=101;
		name="Animesh";
		salary = 765434;
	}
	
	void display() {
		System.out.println(id);
    	System.out.println(name);
    	System.out.println(salary);
    	System.out.println(cname);
	}

	public static void main(String[] args) {
		Google emp1 = new Google();
		emp1.display();
		
		Google emp2 = new Google();
		emp2.display();
		
		Google emp3 = new Google();
		emp3.display();
	}

}
