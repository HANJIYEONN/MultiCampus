import java.util.Scanner;



/*
 �� ���� ���α׷�
 bmi = ü�� / (���� ^2)
 
 �޼ҵ� : calculate
 �ʿ��� ������ : ü�� (double), ����(double)
 
 calculate �޼ҵ�κ��� ����� bmi������ �̿��ؼ�
  ���ܰ���� ��Ÿ���� �ʹٸ�?
  
  1. ������ ������ �޼ҵ带 �����ؼ� ���
  2. ������ �޼ҵ�� �״�� �ΰ� ���ο� �޼ҵ带 �ۼ��ؼ� �������Ѷ�
  
  getResult �޼ҵ� : bmi ������  ���� ���� ��� ���
  30~ 			: ��
  20~30			: ����
  13~20			: ����
  10~13			: �������
  ~10			: ������
  
 */
public class BMI_machine {
	
	public static void main(String[] args) {
		BMI_machine bm = new BMI_machine();
		double bmi = bm.calculate(40, 1.80);
		String result= bm.getResult(bmi);
		System.out.println(result);
		
	}

	public String getResult(double bmi) {
		if (bmi > 30) {
			return "��";
		} else if(bmi > 20) {
			return "����";
		} else if(bmi > 13) {
			return "����";
		} else if(bmi > 10) {
			return "�������";
		} else 	return "������" ;
	}
	
	public double calculate(double w, double h) {
		System.out.println("BMI���� ���ϱ�"); 
		double bmi = w/(h*h);
		System.out.println(bmi);
		return bmi;
	}
	
	//��ü : ����(��ɰ�) �����͸� ������ ������ ����
	
	
	/*
	 
	 ��ü : ������ + ��� ���� ����
	 
	 Ŭ������ ��ü
	 
		 �����Ϳ� ������ ��� ������ ������ ����� ����� �� �ְ� �ϰ�, ������ �ʿ��� �ڱ⸸�� �����͸�
		 �����ϱ� ���� ������ �̸� ������ �� ��
		 
	 Ŭ���� 
	 	
	 	���纻�� ����� ���� ����
	 	���� �����ϰ� �;����� ������ Ȥ�� �Ӽ����� ����
	 	�����Ϳ� ������� �����Ǵ� ���� ����̳� ����
	 */
}
