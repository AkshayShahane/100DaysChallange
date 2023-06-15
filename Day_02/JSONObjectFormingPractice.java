package Day_02;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONObjectFormingPractice {
	public static void main(String[] args) {
		constructRequest();
	}
	
	public static void constructRequest() {
		JSONArray topingArray = new JSONArray();
		JSONObject obj1 = new JSONObject();
		obj1.put("id", "5001");
		obj1.put("type", "None");
		
		JSONObject obj2 = new JSONObject();
		obj2.put("id", "5002");
		obj2.put("type", "Glazed");
		
		JSONObject obj3 = new JSONObject();
		obj3.put("id", "5005");
		obj3.put("type", "Sugar");
		
		JSONObject obj4 = new JSONObject();
		obj4.put("id", "5007");
		obj4.put("type", "Powdered Sugar");
		
		JSONObject obj5 = new JSONObject();
		obj5.put("id", "5006");
		obj5.put("type", "Chocolate with Sprinkles");
		
		JSONObject obj6 = new JSONObject();
		obj6.put("id", "5003");
		obj6.put("type", "Chocolate");
		
		JSONObject obj7 = new JSONObject();
		obj7.put("id", "5004");
		obj7.put("type", "Maple");
		
		topingArray.put(obj1);
		topingArray.put(obj2);
		topingArray.put(obj3);
		topingArray.put(obj4);
		topingArray.put(obj5);
		topingArray.put(obj6);
		topingArray.put(obj7);
		
		System.out.println(topingArray.toString());
		
		JSONArray batterArray = new JSONArray();
		
		JSONObject object1 = new JSONObject();
		object1.put("id", "1001");
		object1.put("type", "Regular");
		
		JSONObject object2 = new JSONObject();
		object2.put("id", "1002");
		object2.put("type", "Chocolate");
		
		JSONObject object3 = new JSONObject();
		object3.put("id", "1003");
		object3.put("type", "Blueberry");
		
		JSONObject object4 = new JSONObject();
		object4.put("id", "1004");
		object4.put("type", "Devil's Food");
		
		batterArray.put(object1);
		batterArray.put(object2);
		batterArray.put(object3);
		batterArray.put(object4);
		
		JSONObject batters = new JSONObject();
		batters.put("batter",batterArray);
		System.out.println(batters);
		
		JSONObject item = new JSONObject();
		item.put("id", "0001");
		item.put("type", "donut");
		item.put("name", "Cake");
		item.put("ppu", 0.55);
		item.put("batters", batters);
		item.put("topping", topingArray);
		
		JSONArray itemList = new JSONArray();
		itemList.put(item);		
		JSONObject items = new JSONObject();
		items.put("item", itemList);
		
		JSONObject itemsobj = new JSONObject();
		itemsobj.put("items", items);
		System.out.println(itemsobj.toString());
	}
}
