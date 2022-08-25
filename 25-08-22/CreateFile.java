import static java.lang.System.*;
import java.io.FileWriter;  
import java.util.*;

public class createFile{  
    public static void main(String args[]){    
	int i;
	Scanner sc = new Scanner(System.in);
        out.println("Enter the text.");
	String Text = sc.nextLine();
	try{
    
           FileWriter fw = new FileWriter("E:\\CreatedFile.txt");    
           fw.write(Text);  
           fw.close();    
          }
          catch(Exception e){
          System.out.println(e);
          }    
          out.println("Succesfully Saved.\n"+"Visit E drive to get ensure.");  
		
 }	     
}