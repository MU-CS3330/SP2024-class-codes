package app;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XMLAdapter implements JsonReaderWriter {

    public XMLAdapter() {

    }

    @Override
    public String readJson(String fileName) {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(fileName));
            return new String(bytes);
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void writeJson(String fileName, String jsonContent) {
        // Parse JSON content
        JsonObject jsonObject = JsonParser.parseString(jsonContent).getAsJsonObject();

        // Convert JSON object to XML string
        String xmlContent = convertJsonObjectToXml(jsonObject, "");

        // Write XML content to file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(xmlContent);
            System.out.println("JSON data written to " + fileName + " in XML format");
        } catch (IOException e) {
            System.err.println("Error writing XML file: " + e.getMessage());
        }
    }

    // Helper method to recursively convert JSON object to XML
    private String convertJsonObjectToXml(JsonObject jsonObject, String indent) {
        StringBuilder xmlBuilder = new StringBuilder();

        xmlBuilder.append(indent).append("<jsonObject>").append("\n");
        for (String key : jsonObject.keySet()) {
            Object value = jsonObject.get(key);
            if (value instanceof JsonObject) {
                xmlBuilder.append(indent).append("  <").append(key).append(">").append("\n");
                xmlBuilder.append(convertJsonObjectToXml((JsonObject) value, indent + "    "));
                xmlBuilder.append(indent).append("  </").append(key).append(">").append("\n");
            } else {
                xmlBuilder.append(indent).append("  <").append(key).append(">").append(value).append("</").append(key).append(">").append("\n");
            }
        }
        xmlBuilder.append(indent).append("</jsonObject>").append("\n");

        return xmlBuilder.toString();
    }
}