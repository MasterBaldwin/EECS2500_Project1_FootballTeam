import java.io.BufferedReader;
import java.io.IOException;

public abstract class Player {
	public String position;
	public String name;
	public float weight;
	public int age;

	protected Player(String position) {
		this.position = position;
	}

	public void LoadPlayerData(BufferedReader reader) throws IOException {
		name = reader.readLine();
		weight = Float.parseFloat(reader.readLine());
		age = Integer.parseInt(reader.readLine());
		LoadInternalData(reader);
	}

	protected abstract void LoadInternalData(BufferedReader reader) throws IOException;

	@Override
	public String toString() {
		return "Position: " + position +
				"\nName: " + name +
				"\nWeight: " + weight +
				"\nAge: " + age;
	}
}
