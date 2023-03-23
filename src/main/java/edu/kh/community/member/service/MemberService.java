package edu.kh.community.member.service;


import java.sql.Connection;

import edu.kh.community.member.model.dao.MemberDAO;
import edu.kh.community.member.model.vo.Member;
import static edu.kh.community.common.JDBCTemplate.*;

public class MemberService {

	private MemberDAO dao = new MemberDAO();
	
	
	/** 회원 정보 조회 Service
	 * 
	 * @param memberEmail
	 * @return
	 */
	public Member selectOne(String memberEmail) throws Exception{
		Connection conn = getConnection();
		
		Member member = dao.selectOne(conn, memberEmail);
		
		close(conn);
		
		return member;
	}

}
