
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

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

		int[] arr = new int[5];// 5, 10 declaring variable  ARRAY METHOD_1
         //disadvantage of this variable declaring is Memory allocation has to be done in the beginning
		arr[0] = 1;

		arr[1] = 2;

		arr[2]= 4;

		arr[3]= 5;

		arr[4]= 6;
		
		int[] arr2= {1,2,4,5,6,7,8,9,10,122};
		//print output 2,4,6,8,10,122
		//check if array is multiple of 2
		   for(int i=0;i<arr2.length;i++)
		      {
			   if(arr2[i]%2==0)
			   {
		         System.out.println(arr2[i]);
		         //if our condition satisfies means we can stop it here itself BY break; 
		         //break;
			   }
		      }
		   //Another method to declare an array Variable
		   
		   
		   
		  ArrayList<String> a=new ArrayList<String>();//array list creation
		  //in arraylist we should write  type we are storing in the object  
		  a.add("shrishail");
		  a.add("hiremath");
		  a.add("shahapur");
		  a.add("bangalore");//add the array
		  a.remove(3);//remove the array
		  System.out.println(a);
		  System.out.println(a.get(2));//extract the array
		  
		  //to check the size of the array in arraylist use size()
		  for(int i=0;i<a.size();i++)//normal for Loop
		  {
			  System.out.println(a.get(i));
		  }
		  for(String s:a)
		  {
			  System.out.println(s);
		  }
		  System.out.println("#######################################");
		  //check the item present or not
		  //System.out.println(a.contains("shrishail"));
		  //CONVERTING NORMAL ARRAY TO ARRAYLIST
		  String[] name= {"shrishail","hiremath","bangalore"};
		  List<String> nameArrayList= Arrays.asList(name);
		  nameArrayList.contains("shrishail"); 
		  
	}

}
	
