import java.util.List;

public abstract class FootballPlayer {
    private String position;
    private String name;
    private float weight;
    private int age;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void LoadData(List<String> data) throws IndexOutOfBoundsException {
        if (data.size() < 4)
            throw new IndexOutOfBoundsException("The ArrayList(data) size is too small");
        setPosition(data.get(0));
        setPosition(data.get(0));
        setPosition(data.get(0));
        setPosition(data.get(0));
    }

    @Override
    public String toString() {
        return "Position: " + getPosition() +
                "\nName: " + getName() +
                "\nWeight: " + getName() +
                "\nAge: " + getAge();
    }
}
