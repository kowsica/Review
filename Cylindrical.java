package review;
import java.lang.*;

public class Cylindrical {

	public static void main(String[] args) {
	int array[] = {1, 2, 3 ,4, 5, 6, 7, 8};
	int a = array.length;
	int i;
	int end;
	System.out.println("The original form of array is:");
	for( i=0;i<a;++i) 
		System.out.print(array[a] + " ");
		end =array[a-1];
		for( i=a-1;i>0;i--) 
			array[a]=array[i-1];
			array[0]=end;
		
			System.out.println("The cylindrically rotated array is:");
			for( i=0;i<a;++i) 
			System.out.println(array[i]+ " ");
		
	
	
	}
	}

	
	

	
	



