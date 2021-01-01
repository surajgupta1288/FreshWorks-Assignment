import java.io.File;
public class CreateFile {
	
	//Calling the createFile from Main function using the switch case
         void createFile() { 
        	          System.out.println("Creation of file in System :");
        	          //file name store in our local Database Storage
        	          File filename=new File("D:\\Eclipse project\\FreshWork\\Database.txt");
        	          
        	        //checking the file already exit in Database Storage
        	    if(filename.exists()) {
        		 System.out.println("File is already is exist in Your System.");
        	    }
        	  //if not show a message to your file is successfully is create in your local Database system 
        	    else {
        		 System.out.println("New File is created successfully in Your System.");
        	     }
        	          System.out.println();
         }
}
