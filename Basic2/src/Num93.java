import java.util.Scanner;
import java.util.StringTokenizer;

public class Num93 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        Scanner sc2 = new Scanner(System.in);
        String num2 = sc2.nextLine();
        
        //10개의 무작위로 부른 번호가 들어간 배열 1 3 2 2 5 6 7 4 5 9
        String [] arr = num2.split(" ");
                
        int total[] = new int[23];
        for(int i=0; i<arr.length; i++) {
            //arr[0]번에는 1번이 1번불려서 1이 저장된다.
            //arr[1]번에는 2번이 2번불려서 2가 저장된다.
            //...arr[9] 한칸씩 밀려서 저장되기때문에 -1을 해준다.
            total[Integer.parseInt(arr[i])-1] +=1;
        }
        
        for(int i=0; i<total.length; i++) {
            System.out.print(total[i]+" ");
        }
	}

}
