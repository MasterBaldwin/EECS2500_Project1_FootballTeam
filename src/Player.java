/*
 * Written by: Mike Baldwin
 */

import java.io.BufferedReader;
import java.io.IOException;

public abstract class Player {
	private String position;
	private String name;
	private float weight;
	private int age;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	protected Player(BufferedReader reader) throws IOException {
		setPosition(reader.readLine());
		setName(reader.readLine());
		setWeight(Float.parseFloat(reader.readLine()));
		setAge(Integer.parseInt(reader.readLine()));
	}

	@Override
	public String toString() {
		return "Position: " + getPosition() +
				"\nName: " + getName() +
				"\nWeight: " + getWeight() +
				"\nAge: " + getAge();
	}
}
