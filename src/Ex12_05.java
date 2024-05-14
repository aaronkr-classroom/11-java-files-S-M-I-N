import java.io.File;
import java.io.FileInputStream;

public class Ex12_05 {

	public static void main(String[] args) {
		File file = new File("gugudan.txt");
		
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileInputStream fis = new FileInputStream(file);
			
			int i = 0;
			while((i = fis.read()) != -1) { // -1 은 파일 마지막까지 읽어오겠다는 뜻
				System.out.print((char) i); // 정수 -> 문자로 형변환
			}
			fis.close();
			System.out.println("파일 읽기 성공!");
		}
		catch(Exception e) {
			System.out.println(e); // e.getMessage(); 도 가능
		}
		
	}

}
