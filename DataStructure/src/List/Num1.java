package List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Num1 {

	public static void main(String[] args) {
		
		// list���� ���� �߿��� Ű���� >> �����Ͱ� ������� ����ȴ�. �ߺ������� ����Ѵ�.
		
		// Array�� List�� �ſ� ������ Data Structure�̴�. 
		// �ٸ�, Array�� ��� index�� �ſ� �߿��ϰ�
		// List�� element�� ������ �ſ� �߿��ϰ� �ۿ��Ѵ�.
		// Array�� ��� �����͸� �߰��� �� ũ�Ⱑ �������ֱ� ������ ������ �����ϴ� index�� element�� �����ϰ� ����⸦�Ѵ�.
		// List�� ��� �����͸� �߰��� �� index�� ���Ͽ� ������ �߰��Ͽ��ְ�, ������ �����ϴ� index�� element�� �� ĭ �̵��Ѵ�. << ���� x
		// Array�� ��� �����͸� ������ �� index�� ��ĭ���� ���д�.
		// List�� ��� �����͸� ������ �� ���ΰ� ������ �ʰ�, element�� ��ĭ�� �������.
		
		// �ڹ��� ��� ArrayList LinkedList �̷��� �ΰ��� ������ List�� ���´�.
		// �� ��� ����� �ſ� �����ϳ�, �������� �����ϴµ�
		// ArrayList�� ��� �߰� �� ������ ��������, �ε����� ���� element�� ��ȸ�� �ſ� ������,
		// LinkedList�� ��� �߰� �� ������ �ſ� ��������, �ε����� ���� element�� ��ȸ�� ������.
		// �̸� trade off��� �Ѵ�. << �Ѱ��� ������ �ִٸ�, ������ �����Ѵ�.
		
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
