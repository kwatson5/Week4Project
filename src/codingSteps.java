
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class codingSteps {

	public static void main(String[] args) {
		
		//Create an instance of an ArrayList of String called employeeNames
					
			List<String> employeeNames = new ArrayList<String>();
			employeeNames.add("Hazel");
			employeeNames.add("Sarah");
			employeeNames.add("Karen");
			employeeNames.add("Kirstin");
			employeeNames.add("Chris");
			employeeNames.add("Tricia");
					
		//Create an instance of a HashSet of Integer called ids	
					
			Set<Integer> ids = new HashSet<Integer>();
			ids.add(126);
			ids.add(277);
			ids.add(452);
			ids.add(569);
			ids.add(723);
			ids.add(837);
					
					
		//Create an instance of a HashMap of Integer, String called employeeMap
				
			Map<Integer, String> employeeMap = new HashMap<Integer, String>();
					
					
		//Create a variable int i=0, then iterate over ids using an enhanced for loop	
					
			int i = 0;
			for(int id : ids){
				String employeeName = employeeNames.get(i++);
				employeeMap.put(id, employeeName);
			}
			
		//Use another enhanced for loop to iterate over the employeeMap.keySet(), 
		//and use the key for each current iteration to print to the console both 
		//the current key and its associated value in the map.	
			
			for(int id : employeeMap.keySet()) {
				System.out.println(id + ": " +employeeMap.get(id));
			}
		
		//Create a StringBuilder called idsBuilder
		//Iterate over the ids HashSet and append each id, followed by a dash “-“ 
		//to idsBuilder. Print the result of idsBuilder.toString() to the console.	
			
			StringBuilder idsBuilder = new StringBuilder();
			
			for(int id : ids) {
				idsBuilder.append(id).append("-");	
				}
				
			System.out.println(idsBuilder.toString());	
			
		//Create a StringBuilder called namesBuilder. Iterate over the employeeNames 
		//ArrayList and append each name, followed by a space “ “ to the namesBuilder.	
		
			StringBuilder namesBuilder = new StringBuilder();
			
			for(String employeeName : employeeNames) {
				namesBuilder.append(employeeName).append(" ");
			}
				
				System.out.println(namesBuilder.toString());
				
		}
	
}
