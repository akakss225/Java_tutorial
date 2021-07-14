import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Num97{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
        String[][] arr = new String[19][19];
        
        //�ٵϾ��� ����ִ� ��Ȳ 19*19�� �Է¹޴´�
        for(int i=0; i<arr.length; i++) {
            //String �迭�� " "�� �������� �ϳ��� �߶� ��� ��´�
            String[] ar1 = br.readLine().split(" ");
            for(int j=0; j<arr.length; j++) {
                //[��][��] �߶��� ���ڵ��� ���� [j]�������� ��� ��´�
                arr[i][j] = ar1[j];
            }
        }
        
        //���� �ڱ�� Ƚ��(n)�� �Է¹޴´� 
        int n = Integer.parseInt(br.readLine());  
        
        ArrayList<String> list = new ArrayList();		
        
        //���� �ڱ��� ��ǥ�� Ƚ��(n)��ŭ �Էµȴ�
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
            //list�� [10 10, 12 12] ����
        }
        System.out.println(list);
        
        for (int i = 0; i < list.size(); i++) {
            
            //String �迭�� " "�� �������� ��ǥ�� �߶� �����Ѵ�
            String[] point = list.get(i).split(" ");
            
            int x = Integer.parseInt(point[0]);
            int y = Integer.parseInt(point[1]);
            
            for (int j = 0; j < 19; j++) {
                if(arr[x-1][j] == "0"){ //x�� 0�̸�
                    arr[x-1][j] = 1 + ""; //1�� �־��ش�
                }else{
                    arr[x-1][j] = 0 + ""; //�ƴϸ� 0�� �־��ش�
                }
            }
            for (int j = 0; j < 19; j++) {
                if(arr[j][y-1] == "0"){ //y�� 0�̸�
                    arr[j][y-1] = 1 + ""; //1�� �־��ش�
                }else{
                    arr[j][y-1] = 0 + ""; //�ƴϸ� 0�� �־��ش�
                }
            }
        }
        
        //��ü ��� for��
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        
        }catch(NumberFormatException e) {
            e.printStackTrace();
        }
    }
}