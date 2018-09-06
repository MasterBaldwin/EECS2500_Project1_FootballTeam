import java.io.BufferedReader;
import java.io.IOException;

public class Defense extends Player {
	public int tackles;
	public float sacks;
	public int interceptions;

	public Defense() {
		super("Defense");
	}

	protected void LoadInternalData(BufferedReader reader) throws IOException {
		tackles = Integer.parseInt(reader.readLine());
		sacks = Float.parseFloat(reader.readLine());
		interceptions = Integer.parseInt(reader.readLine());
	}

	@Override
	public String toString() {
		return super.toString() + "\nTackles: " + tackles +
				"\nSacks: " + sacks +
				"\nInterceptions: " + interceptions;
	}
}
