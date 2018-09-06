import java.util.List;

public class Receiver extends Player {
	public static final int RequiredInputCount = 6;
	public int receptions;
	public int receptionYards;
	public int rushes;
	public int rushingYards;
	public int touchdowns;
	public int fumbles;

	protected void LoadInternalData(List<String> data) {
		receptions = Integer.parseInt(data.get(0));
		receptionYards = Integer.parseInt(data.get(1));
		rushes = Integer.parseInt(data.get(2));
		rushingYards = Integer.parseInt(data.get(3));
		touchdowns = Integer.parseInt(data.get(4));
		fumbles = Integer.parseInt(data.get(5));
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
