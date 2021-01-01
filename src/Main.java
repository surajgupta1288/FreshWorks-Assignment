import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		     long start=System.currentTimeMillis();//starting point of the execution program 
		     System.out.println(":-------------------Please Read The Instruction CareFully----------------:");
		     Instruction inst=new Instruction();
		                 inst.ShowInstruction();// Show all instruction from this class
		
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Please Enter Your User Name :");
		     String username = sc.nextLine();
		             
		     if(username.equals("admin")){//check your username
		    	 System.out.println("Please Enter Your Password :");
			     String password = sc.nextLine();

					        if(password.equals("admin")) {//check your password
		        	
			             int choice;// variable
		                do {
			                    System.out.println(" 1.)Create File\n 2.)Insert the Key-Value Pair\n 3.)Read the file\n 4.)Search Record\n 5.)Delete the Data\n 6.)Exit.");
		                      	    System.out.println("Please Enter Your Choice :");
			                    choice=sc.nextInt();//Your Choice 
			                    //using the switch case selecting your choice
			                    switch(choice){
			                                  case 1:
				                                     CreateFile ctf=new CreateFile();//creating file 
				                                     ctf.createFile();
				                                     break;
			                                  case 2:
				                                     InsertKeyValue ins=new InsertKeyValue();//insert the data in file
				                                     ins.insertRecord();
				                                     break;
			                                  case 3:
				                                     ReadFile rdf=new ReadFile();//read the data from the file
				                                     rdf.readfile();
				                                     break;
			                                  case 4:
				                                     SearchData sch=new SearchData();//search the data from the file
				                                     sch.ShowRecord();
				                                     break;
			                                  case 5:
				                                     DeleteData dt=new DeleteData();//delete the record from the file.
				                                     dt.deleteData();
				                                     break;
			                                  case 6:
				                                     System.out.println("You Entered to the Exit function... :");//exit function has been clicked
				                                     long end=System.currentTimeMillis();// end point of execution program 
				                                     double total=(double)(end-start)/100000;//Calculating the total execution time of the program
				                         	            System.out.println("Total execution time is = "+total+"sec");// print the total execution time
				                         	            break;

			                                  default: 
				                                     System.out.println("Please Enter Your valid choice... :");//it's your invalid choice.
			                               }
		                           }while(choice<6);
		                 }
		             else
		                 {
			               System.out.println(" Entered Password was Wrong...");
					       System.out.println("Pls Re-run the Application and Try Again \n");

		                 }
	             }
		    else
	            {
		          System.out.println("Entered Username was wrong...");
		          System.out.println("Pls Re-run the Application and Try Again \n");

		         
	            }
		
//		    long end=System.currentTimeMillis();// end point of execution program 
//		    double total=(double)(end-start)/100000;//Calculating the total execution time of the program
//	            System.out.println("Total execution time is = "+total+"sec"+"\nAfter it You can not perform any opeation in your Database:");// print the total execution time
     }
}
