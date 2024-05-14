import java.io.File;
import java.io.IOException;

public class Ex12_01 {

	public static void main(String[] args) {
		File fileObj = new File("example01.txt"); // 생성자
		try {
			// 새로운 파일을 생성하면 반환값은 true
			boolean success = fileObj.createNewFile();	
			
			if(success) {
				System.out.println("파일 생성 성공!");
			}
			else {
				System.out.println("파일 생성 실패!");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
