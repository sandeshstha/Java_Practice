class Demo
{
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Demo(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	  
	 public static void main(String args[])
	 {  
	   Demo s1=new Demo(101,"Raj","lucknow");  
	   Demo s2=new Demo(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	   // output are: Demo@77556fd and Demo@368239c8
 	}  
}  
