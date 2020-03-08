package ReverseExp;

public class ReverseExp {
	
	
	
	
	
	public static int[] reverse(int[] list) {
		
		
		
		int[] result =new int[list.length];
		
		for(int i=0, j=result.length-1;i<list.length; i++, j-- ) {
			
			result[j]=list[i];
			
			
			
			System.out.println(list[j]);
		}
		
		
		
		return result;
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4};
		
		
		reverse(array);
		
		
		
		

	}

}
