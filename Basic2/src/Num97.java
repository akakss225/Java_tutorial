import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Num97{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
        String[][] arr = new String[19][19];
        
        //바둑알이 깔려있는 상황 19*19를 입력받는다
        for(int i=0; i<arr.length; i++) {
            //String 배열에 " "을 기준으로 하나씩 잘라서 모두 담는다
            String[] ar1 = br.readLine().split(" ");
            for(int j=0; j<arr.length; j++) {
                //[행][열] 잘라진 숫자들을 열인 [j]기준으로 모두 담는다
                arr[i][j] = ar1[j];
            }
        }
        
        //십자 뒤깁기 횟수(n)을 입력받는다 
        int n = Integer.parseInt(br.readLine());  
        
        ArrayList<String> list = new ArrayList();
        
        //십자 뒤깁지 좌표가 횟수(n)만큼 입력된다
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
            //list에 [10 10, 12 12] 저장
        }
        System.out.println(list);
        
        for (int i = 0; i < list.size(); i++) {
            
            //String 배열에 " "을 기준으로 좌표를 잘라서 저장한다
            String[] point = list.get(i).split(" ");
            
            int x = Integer.parseInt(point[0]);
            int y = Integer.parseInt(point[1]);
            
            for (int j = 0; j < 19; j++) {
                if(arr[x-1][j] == "0"){ //x가 0이면
                    arr[x-1][j] = 1 + ""; //1을 넣어준다
                }else{
                    arr[x-1][j] = 0 + ""; //아니면 0을 넣어준다
                }
            }
            for (int j = 0; j < 19; j++) {
                if(arr[j][y-1] == "0"){ //y가 0이면
                    arr[j][y-1] = 1 + ""; //1을 넣어준다
                }else{
                    arr[j][y-1] = 0 + ""; //아니면 0을 넣어준다
                }
            }
        }
        
        //전체 출력 for문
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