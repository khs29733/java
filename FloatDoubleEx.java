// �Ǽ�
//float(4) < double (8)
//���е��� �����ϰ� ǥ�� ������ ���� �ڷ���
//ǥ�� ���� : byte < short < int(4) < long(8) < float(4) < double
public class FloatDoubleEx {
	public static void main(String[] args) {
		
		float floatVar = 3.14159F;
		double doubleVar = 3.14159;
		int intVar = 30000000;
		floatVar = 3E7f;
		doubleVar = 314159E-5;	//=3.14159
		
		System.out.println("int :" + intVar);		
		System.out.println("float : "+ floatVar);
		System.out.println("double : "+ doubleVar);
		
		//�ε��Ҽ��� ����� ������
		//float double ���е� �����ϰ� ǥ�� ������ ���� �ڷ���
		//���а�꿡 Ȱ��ÿ��� ����
		
		System.out.println(0.1 * 3);
		
		
		
	}
}