package jdbc03;

public class MemberService {
	/*
	 dao한테 일시키는 애
	 
	 db의 member테이블에 연결되어서 db수정, 삭제, 갱신, 조회를 하는 dao객체를 필드로 선언
	 생성자에서 dao의 객체를 획득해서 객체에 저장
	 
	 */
	private MemberDao memberDao;
	
	public MemberService() {
		memberDao = MemberDao.getInstance();
		
	}
	
	/*
	 회원 가입
	 
	 	사용자가 회원가입을 위해 입력한 데이터를 매개변수로 받아서 회원가입을 진행
	 	
	 	1. id가 이미 존재하는지 확인 - > selectMemberById() : 특정 id에 해당하는 회원정보를 조회하는 메소드 : MemberDao에 정의
	 	2. 비밀번호와 비밀번호 확인이 일치하는지 확인
	 	3. 위의 조건을 모두 만족하면 회원가입 진행
	 	
	 	join 메소드의 리턴값
	 	
	 	1 : 회원가입 성공
	 	2 : 중복 아이디 있음
	 	3 : 비밀번호와 비밀번호 확인이 일치하지 않는다.

	 */
	
	public int join(String id, String pwd1, String pwd2, String name, String email) {
		//id에 해당하는 비밀번호 조회 메소드
		
		//id에 레코드가 있는지 없는지 검사
		//레코드 있으면 pw리턴 ->null이 아니라면 레코드 존재함 중복 아이디 있음!
		if (memberDao.selectMemberPwById(id) != null) {
			return 2;
		}
		
		if (!pwd1.equals(pwd2)) {
			return 3;
		}
		
		//회원가입 조건 만족됨!!
		//insertMember() 메소드 호출
		
		Member m = new Member(id, pwd1, name, email, null);
		memberDao.insertMember(m);
		
		return 1;
	}
}
