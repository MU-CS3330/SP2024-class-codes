package app;

public interface JsonReaderWriter {
	String readJson(String fileName);
	void writeJson(String fileName, String jsonContent);
}
