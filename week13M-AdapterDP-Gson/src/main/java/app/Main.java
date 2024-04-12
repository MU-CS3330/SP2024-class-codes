package app;

public class Main {

	public static void main(String[] args) {
		
		JsonReaderWriter adapter = new GsonAdapter();
        // Reading JSON from file
        String jsonData = adapter.readJson("files/data.json");
        System.out.println("Read JSON data: " + jsonData);

        // Writing JSON to file
        String jsonString = "{\"name\": \"John\", \"age\": 30}";
        adapter.writeJson("output.json", jsonString);
        System.out.println("JSON data written to output.json");
        
        JsonReaderWriter XMLadapt = new XMLAdapter();

        // Writing JSON to XML file
        String jsonStringData = "{\"name\": \"John\", \"age\": 30}";
        XMLadapt.writeJson("output.xml", jsonStringData);
//        System.out.println("JSON data written to output.xml in XML format");
	}

}
