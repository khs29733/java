package com.javaex.basic;

public class ConsoleEx {
	public static void main(String[] args) {
		consoleOutputEx();
		
	}
	//�ܼ� ���
	private static void consoleOutputEx() {
		//ǥ�� ��� (stdout) : System.out
		//ǥ�� ���� (stderr) : system.err
		//�޼��� print() ->��� �� ������ ���� ����
		//�޼��� print() -> ��� �� ����
		//printf -> ������� ->String �׸񿡼� ����
		
		System.out.println("Hello");//���� ����
		System.out.println("Java");//���� ��
		System.out.println("New Line");
		//�̽����̽� ���� 
		//\n(����), \t(��), \"(����ǥ), \\(��������)
		System.out.println(("Hello \nJava"));
		
		System.out.println("Hello \t\tJava");//��
		System.out.println("Hello \"Java\"");
		
		String filePath = "D:\tmyfolder\tmyfile.txt";
		System.out.println(filePath);
	}
}
