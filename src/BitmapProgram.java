import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BitmapProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("res/walse.bmp");
		FileOutputStream fout = new FileOutputStream("res/walse_copy.bmp");
		
		//byte[] fileHeader = new byte[14];
		//byte[] bmpHeader = new byte[12];
		byte[] buf = new byte[1024];
		
		int num;
		while((num= fin.read(buf))!=-1){
		fout.write(buf,0,num);
		}
		
		/*while(true) {
			num=fin.read(buf);
			if(num==-1)
				break;
			fout.write(buf, 0, num);
		}*/
		
		
		/*fin.read(fileHeader);
		fin.read(bmpHeader);*/
		
		/*int width =(int)bmpHeader[4] & 0x000000ff<<0 |
				        ((int)bmpHeader[5]<<8) |
                        ((int)bmpHeader[6]<<16) |
						((int)bmpHeader[7]<<24); 
		
		System.out.printf("width: %d ",width);
		*/
		fin.close();
		fout.close();
	}

}
