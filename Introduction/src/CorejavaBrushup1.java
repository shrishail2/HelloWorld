/*
 JAVA LOOPS 
public class CoreJavaBrushUp1 {

public static void main(String[] args) {

// TODO Auto-generated method stub

int myNum = 5;

String website = "Rahul Shetty Academy";

char letter = 'r';

double dec = 5.99;

boolean myCard = true;


System.out.println(myNum+"is the value stored in the myNum variable");

System.out.println(website);

//Arrays -

int[] arr = new int[5];// 5, 10 declaring an ARRAY METHOD_1

arr[0] = 1;

arr[1] = 2;

arr[2]= 4;

arr[3]= 5;

arr[4]= 6;


int[] arr2 = {1,2,4,5,6};

System.out.println(arr2[0]);


//for loop arr.length - 5

for(int i = 0; i< arr.length; i++) //4
{
 System.out.println(arr[i]);
}

for (int i =0;i<arr2.length; i++)
{
  System.out.println(arr2[i]);
}

String[] name = {"rahul", "shetty", "selenium"};
for(int i =0; i<name.length;i++)
{
  System.out.println(name[i]);
}



for( String s: name)
{
  System.out.println(s);
}
}
*/

public class CorejavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,4,5,6,7,8,9,10,122};
		//print output 2,4,6,8,10,122
		//check if array is multiple of 2
		   for(int i=0;i<arr1.length;i++)
		      {
			   if(arr1[i]%2==0)
			   {
		         System.out.println(arr1[i]);
		         //if our condition satisfies means we can stop it here itself BY break; 
		         break;
		       }
		      }
	}

}
