/*
 * Written by: Mike Baldwin
 */

import java.io.BufferedReader;
import java.io.IOException;

public class Quarterback extends Player {
	public int passAttempts;
	public int passCompletions;
	public int passingYards;
	public int rushingAttempts;
	public int rushingYards;
	public int touchdowns;
	public int interceptions;
	public int fumbles;
	public int sacks;

	public Quarterback() {
		super("Quarterback");
	}

	protected void LoadInternalData(BufferedReader reader) throws IOException {
		passAttempts = Integer.parseInt(reader.readLine());
		passCompletions = Integer.parseInt(reader.readLine());
		passingYards = Integer.parseInt(reader.readLine());
		rushingAttempts = Integer.parseInt(reader.readLine());
		rushingYards = Integer.parseInt(reader.readLine());
		touchdowns = Integer.parseInt(reader.readLine());
		interceptions = Integer.parseInt(reader.readLine());
		fumbles = Integer.parseInt(reader.readLine());
		sacks = Integer.parseInt(reader.readLine());
	}

	@Override
	public String toString() {
		return super.toString() + "\nPass Attempts: " + passAttempts +
				"\nPass Completions: " + passCompletions +
				"\nPassing Yards: " + passingYards +
				"\nRushing Attempts: " + rushingAttempts +
				"\nRushing Yards: " + rushingYards +
				"\nTouchdowns: " + touchdowns +
				"\nInterceptions: " + interceptions +
				"\nFumbles: " + fumbles +
				"\nSacks: " + sacks;
	}
}
