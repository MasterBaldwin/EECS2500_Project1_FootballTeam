import java.util.List;

public class Quarterback extends Player {
	public static final int RequiredInputCount = 9;
	public int passAttempts;
	public int passCompletions;
	public int passingYards;
	public int rushingAttempts;
	public int rushingYards;
	public int touchdowns;
	public int interceptions;
	public int fumbles;
	public int sacks;

	protected void LoadInternalData(List<String> data) {
		passAttempts = Integer.parseInt(data.get(0));
		passCompletions = Integer.parseInt(data.get(1));
		passingYards = Integer.parseInt(data.get(2));
		rushingAttempts = Integer.parseInt(data.get(3));
		rushingYards = Integer.parseInt(data.get(4));
		touchdowns = Integer.parseInt(data.get(5));
		interceptions = Integer.parseInt(data.get(6));
		fumbles = Integer.parseInt(data.get(7));
		sacks = Integer.parseInt(data.get(8));
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
