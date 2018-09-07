/*
 * Written by: Mike Baldwin
 */

import java.io.BufferedReader;
import java.io.IOException;

public class Defense extends Player {
	private int tackles;
	private float sacks;
	private int interceptions;

	public int getTackles() {
		return tackles;
	}

	public void setTackles(int tackles) {
		this.tackles = tackles;
	}

	public float getSacks() {
		return sacks;
	}

	public void setSacks(float sacks) {
		this.sacks = sacks;
	}

	public int getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}

	public Defense() {
		super("Defense");
	}

	protected void LoadInternalData(BufferedReader reader) throws IOException {
		setTackles(Integer.parseInt(reader.readLine()));
		setSacks(Float.parseFloat(reader.readLine()));
		setInterceptions(Integer.parseInt(reader.readLine()));
	}

	@Override
	public String toString() {
		return super.toString() + "\nTackles: " + getTackles() +
				"\nSacks: " + getSacks() +
				"\nInterceptions: " + getInterceptions();
	}
}
