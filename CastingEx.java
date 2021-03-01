
public class CastingEx {
//byte(1) < short (2) < int(4) < long(8) <float (4) <double(8)
public static void main(String[] args) {
	//implicitCastingEx();
	explicitCastingEx();
}
//����� ĳ����
//ǥ�� ������ ���� �ڷ��� -> ���� �ڷ���	: �������� ���� ���ɼ�
//�����ڰ� ��������� Ÿ���� ��ȯ
private static void explicitCastingEx() {
	double d = 123.456;//8����Ʈ �Ǽ���
	System.out.println(d);
	
	//float f = d; //4����Ʈ �Ǽ���
	System.out.println(d);
	
	float f = (float)d;
	System.out.println(f);
	
	long l = (long)f;//8����Ʈ ������
	System.out.println(l);
	System.out.println(Long.toBinaryString(l));
	
	byte b = (byte)l;
	System.out.println(b);
	
}
//�Ϲ��� ĳ���� (implicit casting : promprion)
// ǥ�������� ���� �ڷ��� -> ���� �ڷ��� : �ڹ� �ڵ� ��ȯ
private static void implicitCastingEx() {
	byte b = 25;//1����Ʈ ����
	System.out.println(b);
	
	short s = b; //2����Ʈ ����
	System.out.println(s);
	
	int i = s; //4����Ʈ ����
	System.out.println(i);
	
	long l = i; //8����Ʈ ����
	System.out.println(l);
	
	float f = l;		//long�� float���� ����Ʈ ���� ũ���� ǥ�� ������ ����
	System.out.println(f);
	
	double d = f;
	System.out.println(d);

}



}
