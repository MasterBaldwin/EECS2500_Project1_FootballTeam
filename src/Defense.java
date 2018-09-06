import java.util.List;

public class Defense extends Player {
	public static final int RequiredInputCount = 3;
	public int tackles;
	public float sacks;
	public int interceptions;

	protected void LoadInternalData(List<String> data) {
		tackles = Integer.parseInt(data.get(0));
		sacks = Integer.parseInt(data.get(1));
		interceptions = Integer.parseInt(data.get(2));
	}

	@Override
	public String toString() {
		return super.toString() + "\nTackles: " + tackles +
				"\nSacks: " + sacks +
				"\nInterceptions: " + interceptions;
	}
}
