package chapter02;
//2. Person Ŭ������ ����� ����, �Ʒ��� ȸ�� ������ �����ϴ� �������� �����غ��ô�.

//�����̸��� �ۼ��ϴ� ��Ģ�� �°� ���� ���� �̸��� ������ ������.
//�� ȸ���̸��� �����ϴ� ����
//�� ȸ�� ��ȭ��ȣ ( 000-0000-0000 )�� �����ϴ� ����
//�� ȸ�� �ֹε�Ϲ�ȣ ( 000000-0000000 �Ǵ� 0000000000000 )�� �����ϴ� ����

public class Person {

	// private : Ŭ���� ���ο��� ����鸸 ������ �����ϵ��� �ϴ� ���� ������
	// ����������뵵�� �������� ���δ� �����̺����༭ �������ش�

	private String memberName;// ȸ���̸�
	private String phoneNumber;// ��ȭ��ȣ
	// String juminNumber;//�ֹι�ȣ

	private long juminNumber;

	// getter �� ���ͷ� �����̺� ������ �ٲ�
	// setter ���� / getter ��������
	// setter => ���� �޾Ƽ� ������ ����
	public void setMemberName(String name) {
		memberName = name;
	}

	// getter =>�ν��Ͻ� ������ ��ȯ
	public String getMemberName() {
		return memberName;
	}

	public void setPhoneNumber(String number) {
		phoneNumber = number;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setJuminNumber(long number) {
		juminNumber = number;
	}

	public long getJuminNumber() {
		return juminNumber;
	}

	// �����ϳ��� ���� ���� Ŭ������ ������ ��ſ� �ۺ����� ������

	// ��ü ������ ���
	public void printData() {
		System.out.println("�̸�: " + getMemberName());
		System.out.println("��ȭ��ȣ: " + getPhoneNumber());
		System.out.println("�ֹι�ȣ: " + getJuminNumber());

	}

}
