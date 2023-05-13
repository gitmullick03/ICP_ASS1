/*
 Name: SWASTIK MULLICK
 Registration no.: 2241013379
 Program: Assume a string variable ruler1 contains "1" initially i.e. String ruler1="1". Write a java program to print the following output using string concatenation.(You can take extra string variable)
  		  1
 		  1 2 1
 		  1 2 1 3 1 2 1
 		  1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
 */
public class P10_Q10 
{
	public static void main(String args[])
	{
		String r1="1";//,r2="2",r3="3",r4="4";
		//System.out.println(r1);
		//System.out.println(r1+" "+r2+" "+r1);
		//System.out.println(r1+" "+r2+" "+r1+" "+r3+" "+r1+" "+r2+" "+r1);
		//System.out.println(r1+" "+r2+" "+r1+" "+r3+" "+r1+" "+r2+" "+r1+" "+r4+" "+r1+" "+r2+" "+r1+" "+r3+" "+r1+" "+r2+" "+r1);
		System.out.println(r1);
		r1=r1+" 2 "+r1;
		System.out.println(r1);
		r1=r1+" 3 "+r1;
		System.out.println(r1);
		r1=r1+" 4 "+r1;
		System.out.println(r1);
	}
}
