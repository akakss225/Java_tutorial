import java.util.Scanner;
import java.util.StringTokenizer;

public class 예제 {

	public static void main(String[] args) {
	    
Scanner sc = new Scanner(System.in);
        
        //연월일을 문자열로 입력받기
        String date = sc.nextLine();
        
        //"."로 구분해서 문자열을 잘라줌
        StringTokenizer token = new StringTokenizer(date,".");
        
        //길이 3의 int보관 배열 선언
        int [] arr = new int[3];
        
        int i = 0;  
        while(token.hasMoreTokens()) {
        //입력문자열을 int배열에 넣기위해 int로 형변환해줌
        arr[i] = Integer.parseInt(token.nextToken());
            i+=1;
        }
        
        String year = String.format("%04d", arr[0]);
        //월일을 한자리수로 입력했기때문에 %02d
        String month = String.format("%02d", arr[1]);
        String day = String.format("%02d", arr[2]);
        
        System.out.print(year+"."+month+"."+day);
    }
}
