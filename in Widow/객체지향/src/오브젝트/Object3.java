package 오브젝트;

class Student{
	String name;
	Student(String name) {
		this.name = name;
	}
	public boolean equals(Student ob) {
		Student s =  ob;
		return this.name == s.name;
	}
}
class Object3 {

	public static void main(String[] args) {

		Student s1 = new Student("Name");
		Student s2 = new Student("Name");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		

	}

}
