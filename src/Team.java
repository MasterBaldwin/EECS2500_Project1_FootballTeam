/*
 * Written by: Mike Baldwin
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Team {
	private static final String inputFilePath = System.getProperty("user.dir") + "/playerinfo.txt";
	private final static List<Player> players = new ArrayList<>();

	/*
	 * A few things:
	 * 1. We don't need to check if marking the stream is supported or not, BufferedReader does, that's the point of buffering it  :)
	 * 2. I only mark 15 characters ahead because the largest line we will be reading is "Quarterback", and accounting for the carriage read at the end, that's only 12 characters.
	 * 3. No "finally" block is needed as I'm using a Try-With-Resources block. NOTE: If it fails to compile for you, update to at least jre7.
	 */
	public static void main(String[] args) {
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFilePath))) {
			while (reader.ready()) {
				reader.mark(15);
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
		} catch (InvalidPathException exception) {
			System.out.println("The path provided to playerinfo.txt is invalid, please make sure you set the field \"inputFilePath\" to the correct path. " + exception);
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
