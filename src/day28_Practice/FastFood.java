package day28_Practice;
import java.io.IOException;
import java.nio.*;   //new input output
import java.nio.file.Files;
import java.nio.file.Paths;
public class FastFood {

	public static void main(String[] args) throws IOException {

		//read all data and assign to array

		String [] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size: " + data.length);
		
		
		//print first row
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		
		//print last restaurant
		System.out.println(data[data.length-1]);

		//print each Restaurant info in separate lines
		
		int counter = 0;
		for ( String restaurant : data) {
			System.out.println(	"#"+ counter+ "=>" + restaurant	);
			counter++;
		}
			
		//print restaurants in state of VA
		
		int countVA=0;
		
		/*for (int i =0; i <data.length; i++) {
			if (data[i].contains(",VA,")) {
				System.out.println(data[i]);
				countVA++;
				System.out.println(countVA);
			}
		}
		*/
		
		//second Version
		
		for (String row : data) {
			if (row.contains(",VA,")) {
				System.out.println(row);
				countVA++;
			}
		}
		
		System.out.println("Total of VA restaurants is " + countVA);
		
		
		//find all restaurants in VA and print the restaurants alone with city names Subway / Herndon


		for (String res :data) {
			if(res.contains(",VA,")) {
				String[] resArr = res.split(",");
				System.out.println(resArr[2] + "-" + resArr[1]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
