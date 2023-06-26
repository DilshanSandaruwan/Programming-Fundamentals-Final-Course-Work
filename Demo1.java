import java.util.*;
class Demo1{
		public static String [][] student = new String [0][2];
		public static int[][] marks = new int [0][2];
		
		public static void main(String args[]){
			
		while(true){
		arryPrint();
		int option=welcome_page();
		clearConsole();
	     
		
		switch(option){
			case 1 :
			add_new_student();
			clearConsole();
			 break;
			
		    case 2 :
			Add_New_Student_With_Marks();
			clearConsole();
			 break;
			 
			case 3 :
			 Add_Marks();
			 clearConsole();
			  break;
			  
			case 4 :
			  Update_Student_Details();
			   clearConsole();
			   break;
			   
			case 5 :
			   Update_Marks();
			   clearConsole();
			   break;
			   
			case 6 :
			   Delete_Student();
			   clearConsole();
			   break;
			   
			case 7 :
			   Print_Student_Details();
			   clearConsole();
			    break;
			    
			case 8 :
			 Print_Student_Ranks();
			  clearConsole();
			    break;
			    
			case 9 :
			 Best_In_Programming_Fundamentals();
			  clearConsole();
			    break;
			    
			case 10 :
			 Best_In_Database_Mnagement_System();
			  clearConsole();
			    break;
			}
		}
	}
	
	public static int welcome_page(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("|                             WELCOME TO GDSE MANAGEMENT SYSTEM                          |");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("[1] Add New Student				[2] Add New Student With Marks " );
		System.out.println("[3] Add Marks				        [4] Update Student Details ");
		System.out.println("[5]Update Marks                                 [6] Delete Student");
		System.out.println("[7] Print Student Details		        [8] Print Student Ranks");
		System.out.println("[9] Best In Programming Fundamentals            [10] Best In Database Management System\n\n");
		
		System.out.print("Enter An Option To Continue : ");
		int option = scan.nextInt();
		
		return option;
		}
	
	public static void add_new_student(){
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("|                                  Add New Student                                       |");
		System.out.println("------------------------------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
	  
		d1:do{
		
			System.out.print("Enter Student Id : ");
			String id = scan.next();
						
			for(int x=0; x<student.length; x++){
				if(id.equals(student[x][0])){
					System.out.println("The Student Id alredy exists");
					continue d1;
				}
					}
						extend();
						student[(student.length-1)][0]=id;
						
						System.out.print("Enter your name : ");
						String name = scan.next();
						
						student[student.length-1][1]=name;
						System.out.print("student added has been successfully");
				d2:while(true){
	            System.out.print("Do you wand yo add a new student(y/n) :");
				char option=scan.next().charAt(0);
				  
				  if(option=='Y' || option=='n'){
					  if(option=='Y'){
						  continue d1;}
						else{
							break d1;
				}
					}else {
						 System.out.println("invalid input");
						 continue d2;
						}
					}
		}while(true);		
	}
	
	public static void Add_New_Student_With_Marks(){
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("|                                  Add New Student With Marks                            |");
		System.out.println("------------------------------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
				d1:do{
		
			     System.out.print("Enter Student Id : ");
			     String id = scan.next();
						
			    for(int x=0; x<student.length; x++){
				if(id.equals(student[x][0])){
					System.out.println("The Student Id alredy exists");
					continue d1;
				}
					}
		        extend();
		  
			    student[(student.length-1)][0]=id;
			    System.out.print("Enter Student Name : ");
	            student[(student.length-1)][1]= scan.next();
	          
	             for(int y = 0; y<2; y++){
				     if(y==0){
                     System.out.print("Programming Fundamentals Marks : ");
                     
                      int marks1=scan.nextInt();
                 while(marks1<0 ||marks1>100){
                     System.out.println("Invalid Marks,Please enter correct marks. ");
                     System.out.print("Programming Fundamentals Marks : ");
                     marks1 =scan.nextInt();
                 }
                                 
					marks[(marks.length-1)][0] = marks1;  }
                    else{
                       
                  System.out.print("Databeas Management System Marks : ");
                  int marks2=scan.nextInt();
                  
                  while(marks2<0 ||marks2>100){
                    System.out.println("Invalid Marks,Please enter correct marks. ");
                    System.out.print(" Databeas Management System Marks : ");
                               
                       marks2=scan.nextInt();
                               }
                          marks[(marks.length-1)][1]=marks2;      
                    }
                  }
	          
			d2:while(true){
				System.out.print("Student has been added successfully.Do you want a new student (y/n) : ");
				char a = scan.next().charAt(0);
				if(a =='y'||a=='n'){
					if(a=='y'){
						continue d1;
						
						}else
					{
						break d1;}
						
					}
				else{
					System.out.println("invalid input");
					continue d2;	
				}
			}
	}while(true);
 }

	public static void Add_Marks(){
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("|                                  Add Marks                                             |");
		System.out.println("------------------------------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
			d1:do{
			int num = -1;
			System.out.print("Enter Student Id : ");
			String id = scan.next();
						
			for(int x=0; x<student.length; x++){
				if(id.equals(student[x][0])){
					num =x;
				}
					}
					if(num==-1){
						 System.out.print("Invalid Student ID.Do you want to search again ? (y/n)");
						 char a = scan.next().charAt(0);
						 if(a=='y'){
							 continue ;
							 }else{
								 break;
								 }
						}
		   System.out.println("Student Name : "+student[num][1]);
		   
			  if(marks[num][0]>0){
				  System.out.println("This  Student's marks have already added.\nIf you want to update  the marks.Please use [5] update Marks option.");
				  }else{
			
	          for(int y = 0; y<2; y++){
				     if(y==0){
                  System.out.print("Programming Fundamentals Marks : ");
                     
                      int marks1=scan.nextInt();
              while(marks1<0 ||marks1>100){
                   System.out.println("Invalid Marks,Please enter correct marks. ");
                   System.out.print("Programming Fundamentals Marks : ");
                       marks1 =scan.nextInt();
                 }
                                 
						 marks[num][0] = marks1;  }
                     else{
                       
                  System.out.print("Databeas Management System Marks : ");
                         int marks2=scan.nextInt();
              while(marks2<0 ||marks2>100){
				  
                    System.out.println("Invalid Marks,Please enter correct marks. ");
                    System.out.print(" Databeas Management System Marks : ");
                               
                       marks2=scan.nextInt();
                               }
                          marks[num][1]=marks2; 
                               
                    }
                    
                  }
	          }
           
	          
			d2:while(true){
				System.out.print("Do you want to add another student ? (y/n) ");
				char a = scan.next().charAt(0);
				if(a =='y'||a=='n'){
					if(a=='y'){
						continue d1;
						
						}else
					{
						break d1;}
						
					}
				else{
					System.out.println("invalid input");
					continue d2;	
				}
			}
	}while(true);
		}

	public static void Update_Student_Details(){
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("|                                  Update_Student_Details                                |");
		System.out.println("------------------------------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		d1 :do{
			int num = -1;
			System.out.print("Enter Student Id : ");
			String id = scan.next();
			
			for(int x=0; x<student.length; x++){
				if(id.equals(student[x][0])){
					num =x;
				}
					}
					if(num==-1){
						 System.out.print("Invalid Student ID.Do you want to search again ? (y/n)");
						 char a = scan.next().charAt(0);
						 if(a=='y'){
							 continue ;
							 }else{
								 break;
								 }
						}
					 System.out.println("Student Name : "+student[num][1]);
					 
					 System.out.print("\nEnter the new student name : ");
					 String name = scan.next();	
					 
					 student[num][1] = name;
					
					 System.out.println("Student details has been update successfully.");
					 
		d2:while(true){
				System.out.print("Do you want to Update another student details ? (y/n) ");
				char a = scan.next().charAt(0);
				if(a =='y'||a=='n'){
					if(a=='y'){
						continue d1;
						
						}else
					{
						break d1;}
						
					}
				else{
					System.out.println("invalid input");
					continue d2;	
				}
			}
	}while(true);
}

	public static void Update_Marks(){
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("|                                  Update Marks                                          |");
		System.out.println("------------------------------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		d1 :do{
			int num = -1;
			System.out.print("Enter Student Id : ");
			String id = scan.next();
			
			for(int x=0; x<student.length; x++){
				if(id.equals(student[x][0])){
					num =x;
				}
					}
					if(num==-1){
						 System.out.print("Invalid Student ID.Do you want to search again ? (y/n)");
						 char a = scan.next().charAt(0);
						 if(a=='y'){
							 continue ;
							 }else{
								 break;
								 }
						}
					System.out.println("Student Name : "+student[num][1]);
				    if(marks[num][0]>0){
				    System.out.println("\nProgramming Fundamentals marks : "+marks[num][0]);
					System.out.println("Database Mangement System  marks : "+marks[num][1]);
					
					System.out.println("\nEnter new Programming Fundamentals marks : ");
					int lakunu = scan.nextInt();
					marks[num][0]= lakunu;
					
					System.out.print("Enter new Database Mangement System  marks : ");
					int lakunu1 = scan.nextInt();
					marks[num][1] = lakunu1;
					
					System.out.print("Marks has been update successfully.");
				    }else{
					System.out.println("This  Student's marks yet be added.");
					
				 }
		d2:while(true){
				System.out.print("Do you want to Update marks another student ? (y/n) ");
				char a = scan.next().charAt(0);
				if(a =='y'||a=='n'){
					if(a=='y'){
						continue d1;
						
						}else
					{
						break d1;}
						
					}
				else{
					System.out.println("invalid input");
					continue d2;	
				}
			}
	}while(true);
		}

public static void Delete_Student(){
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("|                                  Delete Student                                        |");
		System.out.println("------------------------------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		d1 :do{
			int num = -1;
			System.out.print("Enter Student Id : ");
			String id = scan.next();
			
			for(int x=0; x<student.length; x++){
				if(id.equals(student[x][0])){
					num =x;
				}
					}
					if(num==-1){
						 System.out.print("Invalid Student ID.Do you want to search again ? (y/n)");
						 char a = scan.next().charAt(0);
						 if(a=='y'){
							 continue ;
							 }else{
								 break;
								 }
						}
						
					 System.out.println("Student Name : "+student[num][1]);
					String [][] temp = new String[student.length-1][2];
						int [][] temp2 = new int[marks.length-1][2];
						
						int k=0;
						l3:for(int i=0;i< student.length;i++){
							if(i!=num){
								temp [k][0] = student[i][0];
								temp [k][1] = student[i][1];
								temp2 [k][0] = marks[i][0];
								temp2 [k][1] = marks[i][1];
								k++;
								}
						}
						
						student  = temp ;
						marks  = temp2 ;
						 
					
					 System.out.println("Student details has been update successfully.");
					 
		d2:while(true){
				System.out.print("Do you want to Delete another student ? (y/n) ");
				char a = scan.next().charAt(0);
				if(a =='y'||a=='n'){
					if(a=='y'){
						continue d1;
						
						}else
					{
						break d1;}
						
					}
				else{
					System.out.println("invalid input");
					continue d2;	
				}
			}
	}while(true);
}

	public static void Print_Student_Details(){
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("|                                 Print Student Details                                  |");
		System.out.println("------------------------------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		
		d1 :do{
			int num = -1;
			System.out.print("Enter Student Id : ");
			String id = scan.next();
			
			for(int x=0; x<student.length; x++){
				if(id.equals(student[x][0])){
					num =x;
				}
					}
					if(num==-1){
						 System.out.print("Invalid Student ID.Do you want to search again ? (y/n)");
						 char a = scan.next().charAt(0);
						 if(a=='y'){
							 continue ;
							 }else{
								 break;
								 }
						}
						
				  System.out.println("Student Name : "+student[num][1]);
					  
				int total = marks[num][0]+marks[num][1];  
				double avg = total/2.0;
				
				if(marks[num][0]>0){
					
				  System.out.print("+--------------------------------------------------------------------------------+");	  
				  System.out.printf("%n|Programming Fundamentals marks				|%24d|%n",marks[num][0]); 
				  System.out.printf("|Database Mangement System  marks			|%24d|%n",marks[num][1]);
				  System.out.printf("|Total Marks 						|%24d|%n",total);
				  System.out.printf("|Avg marks						|%24.2f|%n",avg);
				  System.out.printf("|Rank							|%24d|%n",printRank(id));		
			      System.out.print("+--------------------------------------------------------------------------------+");	  
				  
				  }else{
					  
					System.out.println("This  Student's marks yet be added.");
					
				 }
				 
		d2:while(true){
				System.out.print("\nDo you want to search another student details ? (y/n) ");
				char a = scan.next().charAt(0);
				if(a =='y'||a=='n'){
					if(a=='y'){
						continue d1;
						
						}else
					{
						break d1;}
						
					}
				else{
					System.out.println("invalid input");
					continue d2;	
				}
			}
	}while(true);
		
}

	public static void Print_Student_Ranks(){
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("|                                  Print Student Ranks                                   |");
		System.out.println("------------------------------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		int[] a= getTotal();
		String[][] b=getRank();
		int rank[]=searchRank();
		
		d1:do{  
		 System.out.println("+--------+--------+----------------+----------------+----------------+");	
		 System.out.printf("|%-8s|%-8s|%-16s|%16s|%16s|%n","Rank","ID","Name","Totala Marks","Avg. Marks");
		 System.out.println("+--------+--------+----------------+----------------+----------------+");	
		 for(int x=0; x<student.length; x++){
			 if(a[x]>0){
			 System.out.printf("|%-8d|%-8s|%-16s|%16d|%16.2f|%n",rank[x],b[x][0],b[x][1],a[x],a[x]/2.0);
		       }
			 }
		  System.out.println("+--------+--------+----------------+----------------+----------------+");	
			d2:while(true){
				System.out.print("\nDo you want to go back to main menu ? (y/n) ");
				char h = scan.next().charAt(0);
				if(h =='y'||h=='n'){
					if(h=='y'){
						continue d1;
						
						}else
					{
						break d1;}
						
					}
				else{
					System.out.println("invalid input");
					continue d2;	
				}
			}
	}while(true);
	
		}
		
	public static void Best_In_Programming_Fundamentals(){
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("|                                  Best In Programming Fundamentals                      |");
		System.out.println("------------------------------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		int[][] r = PFmarks();
		String[][]t=  sort_pfName();
		
		d1:do{System.out.println("+--------+----------------+----------------+----------------+");
			System.out.printf("|%-8s|%-16s|%-16s|%-16s|%n","ID","Name","PF Marks","DBM Marks");
			System.out.println("+--------+----------------+----------------+----------------+");		
			for(int p =0; p<student.length; p++){
				if(r[p][0]>0){
		    System.out.printf("|%-8s|%-16s|%-16d|%-16d|%n",t[p][0],t[p][1],r[p][0],r[p][1]);
		       }
		     }
		    System.out.println("+--------+----------------+----------------+----------------+");	
		d2:while(true){
				System.out.print("\nDo you want to go back to main manu ? (y/n) ");
				char a = scan.next().charAt(0);
				if(a =='y'||a=='n'){
					if(a=='y'){
						continue d1;
						
						}else
					{
						break d1;}
						
					}
				else{
					System.out.println("invalid input");
					continue d2;	
				}
			}
	}while(true);
 }

	public static void Best_In_Database_Mnagement_System(){
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("|                                  Best In Database Management System                    |");
		System.out.println("------------------------------------------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		int[][] k= DBMmarks();
		String[][] m= sort_DBM_Name();
		
		d1:do{
			System.out.println("+--------+----------------+----------------+----------------+");	
			System.out.printf("|%-8s|%-16s|%-16s|%-16s|%n","ID","Name","DBM Marks","PF Marks");
			System.out.println("+--------+----------------+----------------+----------------+");		
			for(int p =0; p<student.length; p++){
				if(k[p][1]>0){
		    System.out.printf("|%-8s|%-16s|%-16d|%-16d|%n",m[p][0],m[p][1],k[p][1],k[p][0]);
		       }
		     }
		    System.out.println("+--------+----------------+----------------+----------------+");	
		d2:while(true){
				System.out.print("\nDo you want to go back to main manu ? (y/n) ");
				char a = scan.next().charAt(0);
				if(a =='y'||a=='n'){
					if(a=='y'){
						continue d1;
						
						}else
					{
						break d1;}	
					}
				else{
					System.out.println("invalid input");
					continue d2;	
				}
			}
	}while(true);
		
		}
		
		public static String[][] sort_DBM_Name(){
			
			String [][] total2 = new String [student.length][2];
			int [][] DBM = new int [student.length][2];
			
			for(int i=0;i<student.length;i++){
			
				total2[i][0] = student[i][0];
				total2[i][1] = student[i][1];
				DBM[i][0] = marks[i][0];
				DBM[i][1] =marks[i][1];
			
				}
			
			for(int i=0;i<(student.length-1);i++){
				for(int j=i+1;j<(student.length);j++){
					
					if(DBM[i][1]<DBM[j][1]){
			
						 String name = total2[i][0];
						 total2[i][0] = total2[j][0];
						 total2[j][0] = name;
						 String name2 = total2[i][1];
						 total2[i][1] = total2[j][1];
						 total2[j][1] = name2;
						
						}
					}
				}
				
			return total2;
			
			}

		
	 public static int[][] DBMmarks(){
		  
		int [][] DBM = new int [student.length][2];
			
			for(int i=0;i<student.length;i++){
			
				DBM[i][0] = marks[i][0];
				DBM[i][1] =marks[i][1];
				
			}
			
			for(int i=0;i<(student.length-1);i++){
				for(int j=i+1;j<(student.length);j++){
					
					if(DBM[i][1]<DBM[j][1]){
					
						 int number = DBM[i][0];
						 DBM[i][0] = DBM[j][0];
						 DBM[j][0] = number;
						 int number2 = DBM[i][1];
						 DBM[i][1] = DBM[j][1];
						 DBM[j][1] = number2;
					
					}
				}
			}
			
			return DBM;
		}

		


	 public static String[][] sort_pfName(){
		   
		String [][] pfNAme = new String [student.length][2];
			int [][] prfmarks = new int [student.length][2];
		
			for(int i=0;i<student.length;i++){
		
				 pfNAme[i][0] = student[i][0];
				 pfNAme[i][1] = student[i][1];
				 prfmarks[i][0] = marks[i][0];
				 prfmarks[i][1] =marks[i][1];
		
				}
			
			
			for(int i=0;i<(student.length-1);i++){
				for(int j=i+1;j<(student.length);j++){
		
					if(prfmarks[i][0]<prfmarks[j][0]){
		
						 String name =  pfNAme[i][0];
						  pfNAme[i][0] =  pfNAme[j][0];
						  pfNAme[j][0] = name;
						 String name2 =  pfNAme[i][1];
						  pfNAme[i][1] =  pfNAme[j][1];
						  pfNAme[j][1] = name2;
						
						}
					}
				}
		
			return  pfNAme;
   }

     public static int[][] PFmarks(){
		  
			int [][] prfmarks = new int [student.length][2];
		
			for(int i=0;i<student.length;i++){
		
				prfmarks[i][0] = marks[i][0];
				prfmarks[i][1] =marks[i][1];
		
		}
		
			for(int i=0;i<(student.length-1);i++){
				for(int j=i+1;j<(student.length);j++){
		
					if(prfmarks[i][0]<prfmarks[j][0]){
		
						 int number = prfmarks[i][0];
						 prfmarks[i][0] = prfmarks[j][0];
						 prfmarks[j][0] = number;
						 int number2 = prfmarks[i][1];
						 prfmarks[i][1] = prfmarks[j][1];
						 prfmarks[j][1] = number2;
		
					}
				}
			}
		
			return prfmarks;
			}

   public static int[] getTotal(){
		  
		int [] total = new int [student.length];
			for(int i=0;i<student.length;i++){
		
				total[i] = marks[i][0]+marks[i][1];
		
				}
		
			for(int i=0;i<(total.length-1);i++){
				for(int j=i+1;j<(total.length);j++){
		
					if(total[i]<total[j]){
		
						 int number = total[i];
						 total[i] = total[j];
						 total[j] = number;
		
						}
					}
				}
		
			return total;
		
 }

    public static int[] searchRank(){
	  int[]d = getTotal();
      int [] rank = new int[d.length];
      
      rank[0] = 1;
       for(int i=1; i<d.length; i++){
		  
		   if(d[i]==d[i-1]){
			   rank[i] =rank[i-1];
			   continue;
			   }
			   
				   rank[i] = (i+1);
       
       }
            return rank;
    }

	 public static String[][] getRank(){
		   
	String [][] total2 = new String [student.length][2];
			int [] total = new int [student.length];
		
			for(int i=0;i<student.length;i++){
		
				total2[i][0] = student[i][0];
				total2[i][1] = student[i][1];
				total[i] = marks[i][0]+marks[i][1];
		
				}
			
			for(int i=0;i<(total.length-1);i++){
				for(int j=i+1;j<(total.length);j++){
		
					if(total[i]<total[j]){
		
						 int number = total[i];
						 total[i] = total[j];
						 total[j] = number;
						 String name = total2[i][0];
						 total2[i][0] = total2[j][0];
						 total2[j][0] = name;
						 String name2 = total2[i][1];
						 total2[i][1] = total2[j][1];
						 total2[j][1] = name2;
						
						}
					}
				}
			return total2;
}

	  public static int printRank(String id){
		String [][] total2 = getRank();
			int num = -1;
			int [] rank = searchRank();
		
			for(int i=0;i<student.length;i++){
		
				if(id.equals(total2[i][0])){
		
					num = i;
		
					}
				}
			
			return rank[num];	
			
    }
	
	public static void extend(){
	   String [][] temp = new String [student.length+1][2];
	   
	   for(int i =0; i<student.length; i++){
		   temp[i][0] = student[i][0];
		   temp[i][1] = student[i][1];
		   }
		 student = temp;
		 
		 int[][] temp1 = new int[marks.length+1][2];
		 
		 for(int x=0; x<marks.length; x++){
			 temp1[x][0] = marks[x][0];
			 temp1[x][1] = marks[x][1];
			 }
			 marks = temp1;
	   }
	
	public final static void clearConsole() {
      try {
      final String os = System.getProperty("os.name");
      if (os.contains("Windows")) {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
        System.out.print("\033[H\033[2J");
        System.out.flush();
     }
   } catch (final Exception e) {
     e.printStackTrace();

   }
 }
 
  public static void arryPrint(){
		String[][] ar =getRank();
		int[] cr =getTotal();
		System.out.println(Arrays.deepToString(student));
		System.out.println(Arrays.deepToString(marks));
		System.out.println(Arrays.deepToString(ar));
		System.out.println(Arrays.toString(cr));
		
		
				}
 
}
