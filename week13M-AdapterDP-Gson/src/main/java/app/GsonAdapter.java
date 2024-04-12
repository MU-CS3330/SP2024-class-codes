package app;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GsonAdapter implements JsonReaderWriter {

	private Gson gson;

	public GsonAdapter() {
		this.gson = new Gson();
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
		try (FileWriter writer = new FileWriter(fileName)) {
			gson.toJson(jsonContent, writer);
		} catch (JsonIOException | IOException e) {
			System.err.println("Error writing JSON file: " + e.getMessage());
		}
	}
}