package Ch06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class C05FileInputStreamMain {

	public static void main(String[] args) throws IOException {
		InputStream fin = new FileInputStream("C:\\IOTEST\\Multi-AI_건설법규_워크플로우_혁신.pdf");
		
		long startTime = System.currentTimeMillis();
		byte [] buffer = new byte[1024];
		
		while(true){
			int data = fin.read(buffer);
			if(data == -1) 
				break;
			
//			System.out.print(data);
		}


		fin.close();
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime - startTime) + " ms");
	}

}
