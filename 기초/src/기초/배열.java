package 기초;

public class 배열 {

	public static void main(String[] args) {

		String[] classGroup = {"최진혁","최유빈","한이람","이고잉"};
		
		for(int i = 0; i <= 3; i++ )
			System.out.println(classGroup[i]);
		//기본 배열
		String[] members = {"최진혁","최유빈","한이람"};
		for(int i = 0; i < members.length; i++)
		{
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}
		//반복문 배열
		String[] memberss = {"최진혁","최유빈","한이람"};
		for(String e : memberss)
		{
			System.out.println(e + "이 상담을 받지 않았습니다.");
		}
		//for-each문 배열
		
		
		
		

	}

}
