import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�� �л��� ���� ����Դϱ�? ");
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
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			name = scan.next();
			System.out.print("�л��� ���̸� �Է��ϼ��� : ");
			age = scan.nextInt();
			System.out.print("�л��� Ű�� �Է��ϼ��� : ");
			height = scan.nextInt();
			System.out.print("�л��� �����Ը� �Է��ϼ��� : ");
			weight = scan.nextInt();
			System.out.print("�л��� �й��� �Է��ϼ��� : ");
			studentID = scan.next();
			System.out.print("�л��� �г��� �Է��ϼ��� : ");
			grade = scan.nextInt();
			System.out.print("�л��� ������ �Է��ϼ��� : ");
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