package edu.mu.maven;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class Main {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		Person p = new Person("Ekin", 32);
		Person p2 = new Person("Jane", 12);
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(p);
		people.add(p2);
		
		System.out.println(gson.toJson(people));
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("files/people.json"));
			bw.write(gson.toJson(people));
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 
		try {
			ArrayList<Person> px = gson.fromJson(new FileReader("files/people.json"), ArrayList.class);
			System.out.println("Person from file: " + px.toString());
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
