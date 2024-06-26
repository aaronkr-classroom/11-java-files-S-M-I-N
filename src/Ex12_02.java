import java.io.File;
import java.io.IOException;

public class Ex12_02 {

	public static void main(String[] args) {
		File fileObj = new File("src\\Ex12_02.java"); // 생성자
		
		if(fileObj.exists()) {
		System.out.println("파일의 이름 : " + fileObj.getName());
		System.out.println("파일의 경로 : " + fileObj.getAbsolutePath());
		System.out.println("파일 쓰기 권한 : " + fileObj.canWrite());
		System.out.println("파일 읽기 권한 : " + fileObj.canRead());
		System.out.println("파일의 크기 : " + fileObj.length());
		}
		else {
			System.out.println("존재하는 파일이 아닙니다.");
		}
	}

}
