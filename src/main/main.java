package main;

public class main {
	/*
	 * �������� ��������, ����� ����� ������ ����� (0-9) � � ������� � ���� (��
	 * ����. ����)
	 */

	public static void task1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number");
		int num = sc.nextInt();
		switch (num) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("tree");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eigth");
			break;
		case 9:
			System.out.println("nine");
			break;
		default:
			System.out.println("Not a digit");

		}

	}
	// �������� ��������, ����� ��������� ����� ����� �� ���� �������� ��
	// ����. ������������ ������ �� ������ ������ ����� � ��������a[1;9].
	// ��� ������� �� � ��������� [1;3], �������� �� �� 5.
	// ��� ������� �� � ��������� [4;6], �������� �� �� 10. ��� ������� ��
	// � ��������� [7;9], �������� �� �� 50. ���������� �������� �� ������.

	public static void task2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert point");
		int point = sc.nextInt();
		int result = 0;

		if (point >= 1 && point <= 3) {
			result = point * 5;

		}
		if (point >= 4 && point <= 6) {
			result = point * 10;

		}
		if (point >= 7 && point <= 9) {
			result = point * 50;

		}
		System.out.println(result);

	}

	/*
	 * ������������ ����� ����� �� ������ �� 13 �������� ���� ����� ��������� 2,
	 * 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. ��������� ��������, ����� ������
	 * �� ��������� ���� ������ � �������� "������� �����", ��� ��������
	 * ������������ ������� �����, � ��������� �������� "��������� �����", ���
	 * �������� � �� ��������� �����.
	 */
	public static void task3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert card");
		String card = sc.nextLine();
		switch (card) {
		case "2":
			System.out.println("������� �����");
			break;
		case "3":
			System.out.println("������� �����");
			break;
		case "4":
			System.out.println("������� �����");
			break;
		case "5":
			System.out.println("������� �����");
			break;
		case "6":
			System.out.println("������� �����");
			break;
		case "7":
			System.out.println("������� �����");
			break;
		case "8":
			System.out.println("������� �����");
			break;
		case "9":
			System.out.println("������� �����");
			break;
		case "10":
			System.out.println("������� �����");
			break;
		case "J":
			System.out.println("������� �����");
			break;
		case "K":
			System.out.println("������� �����");
			break;
		case "Q":
			System.out.println("������� �����");
			break;

		case "A":
			System.out.println("������� �����");
			break;
		default:
			System.out.println("�� ������� �����");
		}

	}

	public static void main(String[] args) {
		task1();
		task2();
		task3();

	}

}
