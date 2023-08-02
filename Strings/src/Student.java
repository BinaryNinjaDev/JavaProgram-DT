//New Program
class Student {
	String str;
	Student(String str){
		this.str=str;
	}
	public String toString() {
		return str;
	}
	public boolean equals(Student str) {
		if(this.str==str.str) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		Student d1 = new Student("Good Morning");
		Student d2 = new Student("Good Morning");
		if(d1.equals(d2)) {
			System.out.println("both are same");
		}else {
			System.out.println("not same");
		}

	}

}
