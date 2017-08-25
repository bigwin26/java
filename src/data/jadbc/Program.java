package data.jadbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		EXIT:
			while(true) {
				switch(inputMenu())
				{
				case 1: // 게시글 입력
					inputNotice();
					break;
				case 2: // 게시글 조회
					listNotice();
					break;
				default:
					break EXIT;

				}
			}

	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.게시글 입력");
		System.out.println("2.게시글 조회");
		System.out.println("3.종료");
		System.out.println("메뉴를 선택해주세요._");
		int num = scan.nextInt();
		return num;

	}

	private static void listNotice() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://211.238.142.247/newlecture?autoReconnect=true&amp;useSSL=false&characterEncoding=UTF-8";
		String sql = "SELECT * FROM Notice";

		//jdbc 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		//연결 /인증
		Connection con = DriverManager.getConnection(url, "sist", "cclass");
		//실행
		Statement st = con.createStatement();
		//결과가져오기
		ResultSet rs = st.executeQuery(sql);

		List<Notice> list = new ArrayList<>();
		
		
		while(rs.next()) {
			Notice n = new Notice();
			n.setId(rs.getString("id"));
			n.setTitle(rs.getString("title"));
			n.setContent(rs.getString("content"));
			
			list.add(n);
		}
		rs.close();
		st.close();
		con.close();
		
		for(Notice n : list)
			System.out.printf("ID:%s \tTITLE:%s \tCONTENT:%s\n",
		n.getId(),n.getTitle(),n.getContent());

	}
	private static void inputNotice() throws ClassNotFoundException, SQLException {

		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요.:");
		String id = scan.nextLine();
		System.out.println("제목을 입력해주세요.:");
		String title = scan.nextLine();
		System.out.println("내용을 입력해주세요.:");
		String content = scan.nextLine();


		String url = "jdbc:mysql://211.238.142.247/newlecture?autoReconnect=true&amp;useSSL=false&characterEncoding=UTF-8";
		String sql = "INSERT INTO Notice(ID,TITLE,writerId,CONTENT) VALUES('"+id+"','"+title+"','"+content+"')";

		//jdbc 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		//연결 /인증
		Connection con = DriverManager.getConnection(url, "sist", "cclass");
		//실행
		Statement st = con.createStatement();
		//결과가져오기
		//ResultSet rs = st.executeUpdate(sql);
		st.executeUpdate(sql);

		st.close();
		con.close();

	}
}
