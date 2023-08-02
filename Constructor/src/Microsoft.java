// Parametrized Constructor

public class Microsoft {
	
	int id;
	String name;
	int salary;
	static String cname = "Microsoft";
	
	Microsoft(int id, String name, int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void dispaly() {
		System.out.println(id);
    	System.out.println(name);
    	System.out.println(salary);
    	System.out.println(cname);
	}


	public static void main(String[] args) {
		Microsoft emp1 = new Microsoft(101,"Animesh",89897);
		emp1.dispaly();
		
		Microsoft emp2 = new Microsoft(101,"Ani",898897);
		emp2.dispaly();
		
		Microsoft emp3 = new Microsoft(101,"bearddbaba",892897);
		emp3.dispaly();
	}

}
