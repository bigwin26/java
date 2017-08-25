package data;

import java.awt.datatransfer.SystemFlavorMap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://211.238.142.247/newlecture?autoReconnect=true&amp;useSSL=false&characterEncoding=UTF-8";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어를 입력해주세요>_");
		String search = scan.nextLine();
		
		String sql = "SELECT ID, TITLE FROM Notice WHERE TITLE LIKE '%" +search+"%'";
		
		//jdbc 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		//연결 /인증
		Connection con = DriverManager.getConnection(url, "sist", "cclass");
		//실행
		Statement st = con.createStatement();
		//결과가져오기
		ResultSet rs = st.executeQuery(sql);
		
		//결과사용
        /*	while(rs.next()) {
			String title = rs.getString("title");
			if(title.indexOf("A")>=0)
			if(rs.getString("title").contains("A")) 
					System.out.println(rs.getString("title"));
		}*/
		while(rs.next()) {
		System.out.printf("아이디 : "+rs.getString("ID"));
		System.out.println(" 타이틀 : "+rs.getString("title"));
		}

		rs.close();
		st.close();
		con.close();
	}

}
