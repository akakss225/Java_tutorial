import java.util.Scanner;
import java.util.StringTokenizer;

public class Num93 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        Scanner sc2 = new Scanner(System.in);
        String num2 = sc2.nextLine();
        
        //10���� �������� �θ� ��ȣ�� �� �迭 1 3 2 2 5 6 7 4 5 9
        String [] arr = num2.split(" ");
                
        int total[] = new int[23];
        for(int i=0; i<arr.length; i++) {
            //arr[0]������ 1���� 1���ҷ��� 1�� ����ȴ�.
            //arr[1]������ 2���� 2���ҷ��� 2�� ����ȴ�.
            //...arr[9] ��ĭ�� �з��� ����Ǳ⶧���� -1�� ���ش�.
            total[Integer.parseInt(arr[i])-1] +=1;
        }
        
        for(int i=0; i<total.length; i++) {
            System.out.print(total[i]+" ");
        }
	}

}
