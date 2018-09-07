/*
 * Written by: Mike Baldwin
 */

import java.io.BufferedReader;
import java.io.IOException;

public class Quarterback extends Player {
	private int passAttempts;
	private int passCompletions;
	private int passingYards;
	private int rushingAttempts;
	private int rushingYards;
	private int touchdowns;
	private int interceptions;
	private int fumbles;
	private int sacks;

	public int getPassAttempts() {
		return passAttempts;
	}

	public void setPassAttempts(int passAttempts) {
		this.passAttempts = passAttempts;
	}

	public int getPassCompletions() {
		return passCompletions;
	}

	public void setPassCompletions(int passCompletions) {
		this.passCompletions = passCompletions;
	}

	public int getPassingYards() {
		return passingYards;
	}

	public void setPassingYards(int passingYards) {
		this.passingYards = passingYards;
	}

	public int getRushingAttempts() {
		return rushingAttempts;
	}

	public void setRushingAttempts(int rushingAttempts) {
		this.rushingAttempts = rushingAttempts;
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

	public int getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}

	public int getFumbles() {
		return fumbles;
	}

	public void setFumbles(int fumbles) {
		this.fumbles = fumbles;
	}

	public int getSacks() {
		return sacks;
	}

	public void setSacks(int sacks) {
		this.sacks = sacks;
	}

	public Quarterback(BufferedReader reader) throws IOException {
		super(reader);
		setPassAttempts(Integer.parseInt(reader.readLine()));
		setPassCompletions(Integer.parseInt(reader.readLine()));
		setPassingYards(Integer.parseInt(reader.readLine()));
		setRushingAttempts(Integer.parseInt(reader.readLine()));
		setRushingYards(Integer.parseInt(reader.readLine()));
		setTouchdowns(Integer.parseInt(reader.readLine()));
		setInterceptions(Integer.parseInt(reader.readLine()));
		setFumbles(Integer.parseInt(reader.readLine()));
		setSacks(Integer.parseInt(reader.readLine()));
	}

	@Override
	public String toString() {
		return super.toString() + "\nPass Attempts: " + getPassAttempts() +
				"\nPass Completions: " + getPassCompletions() +
				"\nPassing Yards: " + getPassingYards() +
				"\nRushing Attempts: " + getRushingAttempts() +
				"\nRushing Yards: " + getRushingYards() +
				"\nTouchdowns: " + getTouchdowns() +
				"\nInterceptions: " + getInterceptions() +
				"\nFumbles: " + getFumbles() +
				"\nSacks: " + getSacks();
	}
}
