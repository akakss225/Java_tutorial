import java.util.Scanner;
import java.util.StringTokenizer;

public class ���� {

	public static void main(String[] args) {
	    
Scanner sc = new Scanner(System.in);
        
        //�������� ���ڿ��� �Է¹ޱ�
        String date = sc.nextLine();
        
        //"."�� �����ؼ� ���ڿ��� �߶���
        StringTokenizer token = new StringTokenizer(date,".");
        
        //���� 3�� int���� �迭 ����
        int [] arr = new int[3];
        
        int i = 0;  
        while(token.hasMoreTokens()) {
        //�Է¹��ڿ��� int�迭�� �ֱ����� int�� ����ȯ����
        arr[i] = Integer.parseInt(token.nextToken());
            i+=1;
        }
        
        String year = String.format("%04d", arr[0]);
        //������ ���ڸ����� �Է��߱⶧���� %02d
        String month = String.format("%02d", arr[1]);
        String day = String.format("%02d", arr[2]);
        
        System.out.print(year+"."+month+"."+day);
    }
}
