/*
 * Golden rule 1- whenever the global and local variable both are same then this concept is known as DATA SHODWING
 */
public class Microsoft {
	int id;
	String name;
	int salary;
	static String cname = "Microsoft";
	
	void Store(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display() {
		System.out.println(id);
    	System.out.println(name);
    	System.out.println(salary);
    	System.out.println(cname);
	}

	public static void main(String[] args) {
		Microsoft emp1 = new Microsoft();
		emp1.Store(101, "Animesh", 787656);
		emp1.display();
		
		Microsoft emp2 = new Microsoft();
		emp2.Store(102, "Ani", 787656);
		emp2.display();
	}

}
