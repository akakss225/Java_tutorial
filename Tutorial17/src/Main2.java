import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("총 학생의 수는 몇명입니까? ");
		int num = scan.nextInt();
		Student[] students = new Student[num];
		
		for(int i = 0; i < num; i++)
		{
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double GPA;
			System.out.print("학생의 이름을 입력하세요 : ");
			name = scan.next();
			System.out.print("학생의 나이를 입력하세요 : ");
			age = scan.nextInt();
			System.out.print("학생의 키를 입력하세요 : ");
			height = scan.nextInt();
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = scan.nextInt();
			System.out.print("학생의 학번을 입력하세요 : ");
			studentID = scan.next();
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = scan.nextInt();
			System.out.print("학생의 학점을 입력하세요 : ");
			GPA = scan.nextDouble();
			students[i] = new Student(name, age, height, weight, studentID, grade, GPA);
		}
		
		for(int i = 0; i < num; i++)
		{
			students[i].show();
		}
		scan.close();
 
	}

}
