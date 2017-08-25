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
				case 1: // �Խñ� �Է�
					inputNotice();
					break;
				case 2: // �Խñ� ��ȸ
					listNotice();
					break;
				default:
					break EXIT;

				}
			}

	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.�Խñ� �Է�");
		System.out.println("2.�Խñ� ��ȸ");
		System.out.println("3.����");
		System.out.println("�޴��� �������ּ���._");
		int num = scan.nextInt();
		return num;

	}

	private static void listNotice() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://211.238.142.247/newlecture?autoReconnect=true&amp;useSSL=false&characterEncoding=UTF-8";
		String sql = "SELECT * FROM Notice";

		//jdbc ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		//���� /����
		Connection con = DriverManager.getConnection(url, "sist", "cclass");
		//����
		Statement st = con.createStatement();
		//�����������
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
		System.out.println("���̵� �Է����ּ���.:");
		String id = scan.nextLine();
		System.out.println("������ �Է����ּ���.:");
		String title = scan.nextLine();
		System.out.println("������ �Է����ּ���.:");
		String content = scan.nextLine();


		String url = "jdbc:mysql://211.238.142.247/newlecture?autoReconnect=true&amp;useSSL=false&characterEncoding=UTF-8";
		String sql = "INSERT INTO Notice(ID,TITLE,writerId,CONTENT) VALUES('"+id+"','"+title+"','"+content+"')";

		//jdbc ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
		//���� /����
		Connection con = DriverManager.getConnection(url, "sist", "cclass");
		//����
		Statement st = con.createStatement();
		//�����������
		//ResultSet rs = st.executeUpdate(sql);
		st.executeUpdate(sql);

		st.close();
		con.close();

	}
}
