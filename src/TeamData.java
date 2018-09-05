import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeamData {
    public void main(String[] args) {
        List<String> allStrings = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(new File(System.getProperty("User.dir") + "/playerinfo.txt")))) {

        } catch (FileNotFoundException exception) {
            System.out.println("Failed to find playerinfo.txt, please make sure your file is spelled the correctly. " + exception);
        } catch (IOException exception) {
            System.out.println("Encountered an IO error: " + exception);
        }
    }
}
