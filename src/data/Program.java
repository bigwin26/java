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
		System.out.print("�˻�� �Է����ּ���>_");
		String search = scan.nextLine();
		
		String sql = "SELECT ID, TITLE FROM Notice WHERE TITLE LIKE '%" +search+"%'";
		
		//jdbc ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		//���� /����
		Connection con = DriverManager.getConnection(url, "sist", "cclass");
		//����
		Statement st = con.createStatement();
		//�����������
		ResultSet rs = st.executeQuery(sql);
		
		//������
        /*	while(rs.next()) {
			String title = rs.getString("title");
			if(title.indexOf("A")>=0)
			if(rs.getString("title").contains("A")) 
					System.out.println(rs.getString("title"));
		}*/
		while(rs.next()) {
		System.out.printf("���̵� : "+rs.getString("ID"));
		System.out.println(" Ÿ��Ʋ : "+rs.getString("title"));
		}

		rs.close();
		st.close();
		con.close();
	}

}
