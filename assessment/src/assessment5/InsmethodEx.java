package assessment5;


	class Student{  
		   int rollno;//instance variable  
		   String name;  
		   static String college ="chaitanya";//static variable  
		   //constructor  
		   Student(int r, String n){  
		   rollno = r;  
		   name = n;  
		   }  
		   //method to display the values  
		   void display (){System.out.println(rollno+" "+name+" "+college);}  
		}  
		//Test class to show the values of objects  
		public class InsmethodEx{  
		 public static void main(String args[]){  
		 Student s1 = new Student(111,"sania");  
		 Student s2 = new Student(222,"mirza");  
		 s1.display();  
		 s2.display();  
		 }  
		}  

