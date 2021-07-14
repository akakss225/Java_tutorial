package List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Num1 {

	public static void main(String[] args) {
		
		// list에서 가장 중요한 키워드 >> 데이터가 순서대로 저장된다. 중복저장을 허용한다.
		
		// Array와 List는 매우 유사한 Data Structure이다. 
		// 다만, Array의 경우 index가 매우 중요하고
		// List는 element간 순서가 매우 중요하게 작용한다.
		// Array의 경우 데이터를 추가할 때 크기가 정해져있기 때문에 기존에 존재하던 index의 element를 제거하고 덮어쓰기를한다.
		// List의 경우 데이터를 추가할 때 index에 대하여 새로이 추가하여주고, 기존에 존재하던 index의 element가 한 칸 이동한다. << 삭제 x
		// Array의 경우 데이터를 삭제할 때 index를 빈칸으로 놔둔다.
		// List의 경우 데이터를 삭제할 때 비어두게 놔두지 않고, element가 한칸씩 당겨진다.
		
		// 자바의 경우 ArrayList LinkedList 이렇게 두가지 형태의 List를 갖는다.
		// 그 사용 방법은 매우 유사하나, 차이점이 존재하는데
		// ArrayList의 경우 추가 및 삭제가 느리지만, 인덱스를 통한 element의 조회가 매우 빠르고,
		// LinkedList의 경우 추가 및 삭제가 매우 빠르지만, 인덱스를 통한 element의 조회가 느리다.
		// 이를 trade off라고 한다. << 한가지 장점이 있다면, 단점이 존재한다.
		
		ArrayList numbers1 = new ArrayList();
		
		numbers1.add(10);
		numbers1.add(20);
		numbers1.add(30);
		numbers1.add(40);
		numbers1.add(50);
		
		System.out.println(numbers1);
		
		LinkedList numbers2 = new LinkedList();
		numbers2.add(10);
		numbers2.add(20);
		numbers2.add(30);
		numbers2.add(40);
		numbers2.add(50);
		
		System.out.println(numbers2);

		
	}

}
