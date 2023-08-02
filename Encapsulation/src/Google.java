//Hiding of data is known as Encapsulation

//Encapsulation
/*
 * class
 * object
 * static data member
 * Non static data Member
 * this
 * constructor
 * default
 * non parametrized
 * data Shadowing
 */

class Google {
	int id; // non-static data member
	String name;
	int salary;
    static String Cname ="google";
    
    void store(int id1, String name1, int salary1) {
    	id = id1;
    	name = name1;
    	salary = salary1;
    }
    
    void display() {
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(salary);
    	System.out.println(Cname);
    }

	public static void main(String[] args) {
		Google emp1 = new Google();
		emp1.store(101, "Animesh", 787878);
		emp1.display();
		
		Google emp2 = new Google();
		emp2.store(102, "Ani", 787878);
		emp2.display();

		Google emp3 = new Google();
		emp3.store(103, "beardbab", 787878);
		emp3.display();
		
	}

}
