import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
public class Arrays1 {

	int[] array1;
	int [] array2;
	public void fillArray(){
		array1 = new int[10];
		array2= new int [10];
		for(int i=0; i<10; i++){
			array1[i]=i;
			array2[i] = i;
			
		}
		array2[array2.length-1]=100;
	}
	
	public void findMissing(){
		boolean found;
		for(int i=0; i<array1.length; i++){
			found=false;
			for(int j=0; j<array2.length; j++){
				if(array1[i] == array2[j]){
					found =true;
					System.out.println(array1[i] + " is found");
					break;
				}
				
				 if(j==array2.length-1){
					 System.out.println(array1[i] + " is missing");
					 break;
				 }
			}
		   if(!found){
			   break;
		   }
		}
	}
	
	public void findMissinbWithArraysAsList(){
		try { 
			  
           
            
            int i[] = new int[] {1,2,3};
           boolean found= Arrays.stream(i).anyMatch(abc -> abc==1);
            List<Integer> x =new ArrayList(Arrays.asList(i));
            
            String j[] = new String[] {"1","2","3"};
            List<String>str = Arrays.asList(j);
            if(str.contains("100")){
            	System.out.println("Present");
            }
            
            List<String> a = Arrays.asList(j);
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
            Optional<Integer> r = list.stream().parallel().filter(num -> num ==100).findAny();
            
           boolean bol = Arrays.asList(i).contains(1);
           System.out.print(r.get());
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 

	}
	
	public static void main(String[] args)
	{
	   Arrays1 a = new Arrays1();
	   a.fillArray();
	 //  a.findMissing();
	   a.findMissinbWithArraysAsList();
	}
}
