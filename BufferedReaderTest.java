//Program to take input by the help of BufferedReader and displaying it
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class BufferedReaderTest {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.print("Enter anything : ");
		String input=br.readLine();
		System.out.println("The input from you is : "+input);
	}
}
