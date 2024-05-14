import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex12_04 {

	public static void main(String[] args) {
		File file = new File("members.txt");
		
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			Scanner input = new Scanner(System.in);
			
			boolean quit = false;
			while (!quit) {
				System.out.print("ID : ");
				String uid = input.next();
				fw.write("ID : " + uid + "\t");
				
				System.out.print("이름 : ");
				String uname = input.next();
				fw.write("이름 : " + uname + "\n");

				System.out.println("계속 진행? Y | N");
				String str = input.next();
				
				if (str.toUpperCase().equals("N")) {
					quit = true;
				}
				
			}
			fw.close();
			System.out.println("파일 쓰기 성공");
		}
		catch(Exception e) {
			e.getMessage();
		}

	}

}
