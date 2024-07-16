package parsing;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;


public class Demo_jeson {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//creating json object
		 JSONObject jsonObj = new JSONObject();
			
		//creating key value pairs
			
		jsonObj.put("Employee", "Vanitha");
		jsonObj.put("Age", "21");
		jsonObj.put("Salary", "20000");
		jsonObj.put("Batch", "04");
		jsonObj.put("Company", "Renault");
			
		//creating FileWriter object
	FileWriter fileWriter = new FileWriter("/home/vanitha/Eclipse/Json/src/Demo.json");
			
	//passing the JSONobj as string and writing to the file
		fileWriter.write(jsonObj.toJSONString());
			
		fileWriter.close();
			
		System.out.println("File created successfully");
		}

	
	}


