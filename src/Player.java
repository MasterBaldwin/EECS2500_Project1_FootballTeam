import java.util.List;

public abstract class Player {
	public static final int RequiredInputCount = 4;
	public String position;
	public String name;
	public float weight;
	public int age;

	public void LoadPlayerData(List<String> data) {
		position = data.get(0);
		name = data.get(1);
		weight = Float.parseFloat(data.get(2));
		age = Integer.parseInt(data.get(3));
		LoadInternalData(data.subList(4, data.size()));
	}

	protected abstract void LoadInternalData(List<String> data);

	@Override
	public String toString() {
		return "Position: " + position +
				"\nName: " + name +
				"\nWeight: " + weight +
				"\nAge: " + age;
	}
}
