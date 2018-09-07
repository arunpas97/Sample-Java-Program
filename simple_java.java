import java.io.*;
class simple
	{	
		DataInputStream din=new DataInputStream(System.in);
		public void show()
			{
				try{
					System.out.println("Enter the 1st value :");
					int a=Integer.valueOf(din.readLine()).intValue();
					System.out.println("Enter the 2nd value :");
					int b=Integer.valueOf(din.readLine()).intValue();

					int c=a+b;
					System.out.println("The Addition Value is :"+c);
				   }
				catch(Exception e){}
			}
	}
class simple_java
	{
		public static void main(String a[])
			{
				simple obj=new simple();
				obj.show();				
			}
	}