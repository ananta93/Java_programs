//import java.io.CreateNewFile;
import java.io.*;
class CreateNewFile 
{
	public static void main(String[] args) 
	{
		Writer writer = null;
		try {
				writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("first.txt"), "utf-8"));
				writer.write("This is my first file");
		}
		catch (IOException ex) {
				ex.printStackTrace();
		}
		finally {
					try {
							writer.close();
					} 
					catch (Exception ex){
							ex.printStackTrace();
					}
		}
	}
}
