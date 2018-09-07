/*
 * Written by: Mike Baldwin
 */

import java.io.BufferedReader;
import java.io.IOException;

public class Receiver extends Player {
	private int receptions;
	private int receptionYards;
	private int rushes;
	private int rushingYards;
	private int touchdowns;
	private int fumbles;

	public int getReceptions() {
		return receptions;
	}

	public void setReceptions(int receptions) {
		this.receptions = receptions;
	}

	public int getReceptionYards() {
		return receptionYards;
	}

	public void setReceptionYards(int receptionYards) {
		this.receptionYards = receptionYards;
	}

	public int getRushes() {
		return rushes;
	}

	public void setRushes(int rushes) {
		this.rushes = rushes;
	}

	public int getRushingYards() {
		return rushingYards;
	}

	public void setRushingYards(int rushingYards) {
		this.rushingYards = rushingYards;
	}

	public int getTouchdowns() {
		return touchdowns;
	}

	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}

	public int getFumbles() {
		return fumbles;
	}

	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}

	public Receiver(BufferedReader reader) throws IOException {
		super(reader);
		setReceptions(Integer.parseInt(reader.readLine()));
		setReceptionYards(Integer.parseInt(reader.readLine()));
		setRushes(Integer.parseInt(reader.readLine()));
		setRushingYards(Integer.parseInt(reader.readLine()));
		setTouchdowns(Integer.parseInt(reader.readLine()));
		setFumbles(Integer.parseInt(reader.readLine()));
	}

	@Override
	public String toString() {
		return super.toString() + "\nReceptions: " + getReceptions() +
				"\nReception Yards: " + getReceptionYards() +
				"\nRushes: " + getRushes() +
				"\nRushing Yards: " + getRushingYards() +
				"\nTouchdowns: " + getTouchdowns() +
				"\nFumbles: " + getFumbles();
	}
}
