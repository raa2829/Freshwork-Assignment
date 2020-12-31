package com.datastore.main;
import org.json.simple.JSONObject;
public class DataStoreUser {
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Aravind");
		jsonObject.put("Gender", "Male");
		jsonObject.put("Department", "ECE");
		System.out.println("C R E A T E");
		DataStore myDataStore = new DataStore("C:\\Users\\Madhu aravindh\\Desktop\\Storage");
		System.out.println(myDataStore.create("1", jsonObject, 10));
		System.out.println(myDataStore.create("1", jsonObject));
		System.out.println(myDataStore.create("1", jsonObject, 10));
		System.out.println(myDataStore.create("2", jsonObject));
		System.out.println(myDataStore.create("helloDataStoreThisIsKeyNameValidation", new JSONObject()));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("A F T E R W A I T");
		jsonObject.put("Age", "25");
		System.out.println(myDataStore.create("1", jsonObject, 10));
		System.out.println(myDataStore.create("1", jsonObject));
		System.out.println(myDataStore.create("1", jsonObject, 10));
		System.out.println(myDataStore.create("2", jsonObject));
   		System.out.println("R E A D");
		System.out.println(myDataStore.read("1"));
		System.out.println(myDataStore.read("2"));
		System.out.println(myDataStore.read("3"));
		System.out.println(myDataStore.read("helloDataStoreThisIsKeyNameValidation"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("A F T E R W A I T");
		System.out.println(myDataStore.read("1"));
		System.out.println(myDataStore.read("2"));
		System.out.println("D E L E T E");
		System.out.println(myDataStore.delete("1"));
		System.out.println(myDataStore.delete("2"));
		System.out.println(myDataStore.delete("2"));
		System.out.println(myDataStore.delete("3"));
		System.out.println(myDataStore.delete("helloDataStoreThisIsKeyNameValidation"));
	}
}
