//���� Ÿ�� ����
//byte(1) < short(2)< int(4 : �������� �⺻Ÿ��) < long(8)
public class IntLongEx {

	public static void main(String[] args) {
		int intVar = 2021;
		//Ÿ���� ������ �Ѿ�� ���� �Ҵ��� ���� ����
	//	intVar2 = 123456789012345; //���� �ʰ��ϴ� ���� ���� �� ����
	
	long longVar = 2021;
	//long longVar2 = 123456789012345;	// L or 1
	
	//short type
	short s1 = 100;
	short s2 = 200;
	
	//short result = s1 +s2; //int�� ��ȯ�Ǿ� ���� -> ��� int
	int result = s1 + s2;
	
	System.out.println(s1 + "+ " + s2 + "=" + result);

	//2����, 8����, 16���� ǥ����
	int bin, oct, hex;
	
	bin = 0b1100; //		0b�� ���ξ� -> 2����
	oct = 072;	//	0�� ���ξ� -> 8����
	hex	=	0xFF;	//0x�� ���ξ� -> 16����
	
	System.out.println(bin);
	System.out.println(oct);
	System.out.println(hex);
	
	
	}
	
	
}
