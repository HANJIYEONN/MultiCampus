package jdbc03;

public class MemberDaoTest {
	
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		
		//id에 해당하는 비밀번호 확인메소드
		System.out.println(dao.selectMemberPwById("hong"));
		
//
//		Member member = new Member();
//		
//	
//		Member result = dao.SelectOneMember(member.getMid());
//		System.out.println(result);

	}

}
