/*
 * Written by: Mike Baldwin
 */

import java.io.BufferedReader;
import java.io.IOException;

public class Receiver extends Player {
	public int receptions;
	public int receptionYards;
	public int rushes;
	public int rushingYards;
	public int touchdowns;
	public int fumbles;

	public Receiver() {
		super("Receiver");
	}

	protected void LoadInternalData(BufferedReader reader) throws IOException {
		receptions = Integer.parseInt(reader.readLine());
		receptionYards = Integer.parseInt(reader.readLine());
		rushes = Integer.parseInt(reader.readLine());
		rushingYards = Integer.parseInt(reader.readLine());
		touchdowns = Integer.parseInt(reader.readLine());
		fumbles = Integer.parseInt(reader.readLine());
	}

	@Override
	public String toString() {
		return super.toString() + "\nReceptions: " + receptions +
				"\nReception Yards: " + receptionYards +
				"\nRushes: " + rushes +
				"\nRushing Yards: " + rushingYards +
				"\nTouchdowns: " + touchdowns +
				"\nFumbles: " + fumbles;
	}
}
