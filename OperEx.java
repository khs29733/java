package com.javaex.basic;

public class OperEx {
public static void main(String[] args) {
	//arithOperEx();
	//LogicalOperEx();
	//bitOperEx();
	//bitshiftEx();
	ConditionaloperEx;
}

//3�� ������
private static void ConditionaloperEx() {
	int a = 10;
	
	//���� a�� ¦���� "¦��", Ȧ���� "Ȧ��"
	String result = a%2 == 0? "¦��"	: "Ȧ��";
	System.out.println(a + "�� ¦��?" + result);
	
	int score  = 40;
	
	//���� score >= 80Good
	// 80>score > 50 : pass
	//������ : fail
	
	String message = score >=80?"Good": score > 50 ? "pass" : "Fail";
	System.out.println("score" + score + ", Result : "+message);
	
}
//��Ʈ ����Ʈ ������
//��Ʈ������ �̵� : <<,>>
private static void bitshiftEx() {
int val = 1;

System.out.println(val);
System.out.println(val << 1); 		//�������� 1��Ʈ �̵�
System.out.println(val << 2);		//�������� 2��Ʈ �̵�

val = 0b1000;
//���� shift
System.out.println(Integer.toBinaryString(val));
System.out.println(Integer.toBinaryString(val >>1));	//�������� 1��Ʈ �̵�
System.out.println(Integer.toBinaryString(val >> 2));//�������� 2��Ʈ �̵�







}
// ��Ʈ ������(&, |, ~)
//int���� ����, ��Ʈ ������ �̼��� ������ ���
private static void bitOperEx() {
	int b1 = 0b1101;
	int b2 = 0b0111;
	
	System.out.println(Integer.toBinaryString(b1));
	System.out.println(Integer.toBinaryString(b2));
	
	int result = b1 & b2;// ��Ʈ ����
	System.out.println(Integer.toBinaryString(result));
	result = b1 | b2;		//��Ʈ ����
	System.out.println(Integer.toBinaryString(result));
	result = ~b1;
	System.out.println(Integer.toBinaryString(result);
}
	
//��, �������� -> ��� boolean
private static void logicalOperEx()
// �񱳿����� ==, !=, >, >=,<,<=
int a = 7;
int b = 3;

System.out.println("a > b?"+(a<b));
System.out.println("a equals b ?"+ (a==b)); //==
System.out.println("a not equals b?" + (a !=b)); // !=�����ʴ� 

// ������ : AND(���� : &&), OR(���� : ||), NOT(�� ���� :!)

int val = 5;

//val�� 0�ʰ�, 10�̸��� ������ �ִ°�?
//���� 1 : val > 0
//����2 : val < 10
//���� 1 and ���� 2
boolean r1 = val > 0;
boolean r2 = val <10;
boolean r1andr2 = r1 && r2 // = val > 0 && val <10
System.out.println("r1 && r2 =" + r1andr2); 

//val�� 0���� 10�̻��� ������ �ִ°�
//���� 1 : val <= 0
//���� 2 : val >= 0
//���� 1 or ���� 2
r1 = val <= 0;
r2 = val >= 10;
boolean r1orr2 = r1 || r2; // = val <=0 || val >=10
System.out.println("r1 || r2 =" + r1orr2);

//val�� 0���� 10�̻��� ������ �ִ°�? -> ������ �����´�
boolean rNot = !r1orr2;	//(val <= 0 || val > 10)
System.out.println("r1orr2 ���� ���� :" + rNot);
}

//��� ������
private static void arithOperEx() {
	int a = 7;
	int b = 3;
	
	//��ȣ ������ : +, -
	System.out.println(-a);
	
	//��������� : +,-,*,/,%(������)
	System.out.println(a / b); //	int/int ->int : �������� ��
	System.out.println(a % b);
	
	//	int 7 / int 3 -> ���� ������

	System.out.println((float)a / (float)a);	// 7.0 / 3.0
	//	�� �ǿ����ڸ� ������� -> Ÿ���� ū������ �����
	System.out.println((float)a / b); 		//7.0 / 3.0(�ڵ���ȯ).
	
	//��������(++,--)
	//������ ����� ���� �������� ���� �ܼ� ���� �뵵�θ� ���
	int c = 10;
	System.out.println("��������");
	System.out.println(c);
	System.out.println(c++); //����� �� ������ �Ͼ
	System.out.println(c);
	System.out.println("��������");
	
	c =10;
	System.out.println(c);
	System.out.println(++c);
	System.out.println(c);
	
	//������ ����
	int d = 10;
	int e = 0;
	
	//System.out.println(d / 0); // Arithmetic Exception
	System.out.println(4 / 0);
	
	//���� ����� ���Ѽ����� Ȯ��
	System.out.println("10.0 / 0�� ���Ѽ�?" + Double.isFinite((float)d / 0);
	
	System.out.println(0.0 / 0.0); 		//	Nan (Not a Number)
	System.out.println("0.0 / 0.0 is Nan?" + Double.isNaN(0.0 / 0.0));
	// Infinity�� ���Ե� ��� ���� -> Infinity
	System.out.println(10.0 / 0 + 10);
	//Nan�� ���Ե� ��� ���� -> ��� �ȵ�(Nan)
	System.out.println(0.0 / 0.0 + 10);
	
	//�Ҵ翬����
//	a = a + b;
	a +=b;
	
}
}
