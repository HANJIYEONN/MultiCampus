/*
 1에서  부터 100까지의 합을구하는 프로그램 작성
 
 나중애 해당 코드를 재사용 하려면???
 
 1. 복붙
 2. 로직이나 기능을 하나로 묶어서 한 덩어리로 만들고 관리 : 메소드 (method)
 
 */
public class SumEx {
	/*
	 메소드 만들기 
	 1. 어떤 것을 만들지 결정
	 	숫자 둘 사이의 모든 값 더하기 : 0 ~ 100까지
	 2. 이름 정하기
	 	더하기니까 add
	 3. 형식에 맞게 구현
	 4. 실행 여부 판단
	 */
	/*
	public static void main(String[] args) {
		SumEx ex = new SumEx(); 		//메소드를 사용하기 위해서 객체를 생성하는 명령어
		//ex.add();						//add라는 메소드를 실행하기 위해서는 두 수가 필요하므로 오류
		ex.add(90,100);					//더하기 기능 호출 
		
	}
	
	public void add(int sval, int eval) {				//메소드 내용을 한번만 변경
		int sum = 0;
//		int sval = 0, eval=100;							//더하기 시작점, 끝점
		for (int i = sval; i <=eval; i++) {			
			sum += i;	
		}
		System.out.println(sum);
	}
	//만약 임의의 두 수 사이를 구하는 메소드를 만들고 싶다면?
	//매개변수 : 메소드가 실행될 때 전달 받아야 하는 입력값 
}
*/
 /*
  메소드 문법
  
  [public] 반환형 메소드이름 (매개변수){
  	실행문장들;
  }
  
  public void add() {
  
  }
  
  public void add(int sval, int eval) {
  
  }
  */
//===============================================================================


//메소드가 실행되고 난 후 결과가 10000 이상이면 '10000이상입니다'라고 출력하고 싶다면?
//방법 1 : 메소드 안에서 처리
//방법 2 메소드를 실행하고 난 후 결과 데이터를 받고 그 값을 저장해서 처리(메소드를 호출한 곳)

/*
 결과값 리턴
 	1. 돌려줄 결과값의 형태를 미리 정해둠
	2. 작업이 끝나고 결과값을 돌려줌
	3. 메소드를 호출하고 얻은 결과값을 특정 변수에 저장
 */

	public static void main(String[] args) {
		SumEx ex = new SumEx(); 			
		int result = ex.add(90,100);					
		
		System.out.println(result+"이상입니다");
		
	}
	
	public int add(int sval, int eval) {				
		int sum = 0;						
		for (int i = sval; i <=eval; i++) {			
			sum += i;	
		}
		System.out.println(sum);
		
		return sum;
	}
}

















