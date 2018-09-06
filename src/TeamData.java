import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TeamData {
	public static List<Player> players = new ArrayList<>();

	public static void main(String[] args) {
		List<String> allStrings = new ArrayList<>();

		try {
			allStrings = Files.readAllLines(Paths.get(System.getProperty("user.dir") + "/playerinfo.txt"));
		} catch (FileNotFoundException exception) {
			System.out.println("Failed to find playerinfo.txt, please make sure your file is spelled the correctly. " + exception);
		} catch (IOException exception) {
			System.out.println("Encountered an IO error: " + exception);
		}

		for (var i = 0; i < allStrings.size(); ) {
			//Read the first line to determine what type of player
			Player player;
			switch (allStrings.get(i)) {
				case "QuarterBack":
					player = new Quarterback();
					player.LoadPlayerData(allStrings.subList(i, i + Player.RequiredInputCount + Quarterback.RequiredInputCount));
					i += Player.RequiredInputCount + Quarterback.RequiredInputCount;
					break;
				case "Defense":
					player = new Defense();
					player.LoadPlayerData(allStrings.subList(i, i + Player.RequiredInputCount + Defense.RequiredInputCount));
					i += Player.RequiredInputCount + Defense.RequiredInputCount;
					break;
				case "Receiver":
					player = new Receiver();
					player.LoadPlayerData(allStrings.subList(i, i + Player.RequiredInputCount + Receiver.RequiredInputCount));
					i += Player.RequiredInputCount + Receiver.RequiredInputCount;
					break;
				default:
					System.out.println("Encountered unknown player position [" + allStrings.get(i) + "] at line position [" + i + "]");
					System.out.println("Please attempt to correct the error and try again.");
					System.out.println("The following is a printout of all correctly loaded players so far:");
					printAllPlayers();
					return;
			}
			players.add(player);
		}

		System.out.println("The following is a printout of all correctly loaded players so far:");
		printAllPlayers();
	}

	public static void printAllPlayers() {
		for (Player iPlayer : players) {
			System.out.println(iPlayer);
			System.out.println();
		}
	}
}
