import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
  public Main() {};
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    File file1 = new File("C:\\Users\\--\\Desktop\\new.txt");
    try {
      PrintWriter out = new PrintWriter(file1.getAbsoluteFile());Throwable localThrowable3 = null;
      try { out.print(str);
      }
      catch (Throwable localThrowable1) {
        localThrowable3 = localThrowable1;throw localThrowable1;
      } 
      finally {
        if (localThrowable3 != null) 
        	try { 
        		out.close(); 
        	} 
        catch (Throwable localThrowable2) {
        	localThrowable3.addSuppressed(localThrowable2); 
        } else 
        	out.close();
      } 
    } 
    catch (Exception e) {
    	throw new RuntimeException(e);
    }
  }
}
