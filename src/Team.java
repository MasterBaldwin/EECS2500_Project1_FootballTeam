/*
 * Written by: Mike Baldwin
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Team {
	public static List<Player> players = new ArrayList<>();

	public static void main(String[] args) {
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(System.getProperty("user.dir") + "/playerinfo.txt"))) {
			while (reader.ready()) {
				reader.mark(15); //I think 15 characters is enough to account for the longest word "Quarterback", plus some
				String position = reader.readLine();
				reader.reset();
				Player player;
				switch (position) {
					case "Quarterback":
						player = new Quarterback(reader);
						break;
					case "Defense":
						player = new Defense(reader);
						break;
					case "Receiver":
						player = new Receiver(reader);
						break;
					default:
						System.out.println("Encountered unknown player position.");
						System.out.println("Please attempt to correct the error and try again.");
						System.out.println("The following is a printout of all correctly loaded players:");
						System.out.println();
						printAllPlayers();
						return;
				}
				players.add(player);
			}
		} catch (FileNotFoundException exception) {
			System.out.println("Failed to find playerinfo.txt, please make sure your file is spelled the correctly. " + exception);
		} catch (IOException exception) {
			System.out.println("Encountered an IO error: " + exception);
		}

		System.out.println("The following is a printout of all loaded players:");
		System.out.println();
		printAllPlayers();
	}

	public static void printAllPlayers() {
		for (Player iPlayer : players) {
			System.out.println(iPlayer);
			System.out.println();
		}
	}
}
