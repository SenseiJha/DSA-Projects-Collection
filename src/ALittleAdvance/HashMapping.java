package ALittleAdvance;

import java.util.HashMap;
public class HashMapping {

	public static void main(String[] args) {
		HashMap<String,Integer> hmObj=new HashMap<>();
		
		hmObj.put("Sidhant", 100);
		hmObj.put("Sambhav", 200);
		hmObj.put("Anshul", 300);
		hmObj.put("Swapnil", 400);
		
		System.out.println(hmObj.get("Sidhant"));
		System.out.println(hmObj.get("Sambhav"));
		System.out.println(hmObj.size());
		System.out.println(hmObj);
		System.out.println(hmObj.containsKey("Swapnil"));
		System.out.println(hmObj.containsValue(300));
		hmObj.replace("Sidhant", 100, 500);
		System.out.println(hmObj);
		System.out.println(hmObj.keySet());
		System.out.println(hmObj.values());
		for(String i:hmObj.keySet()) {
			System.out.print(hmObj.get(i)+" ");
		}
	}
}
