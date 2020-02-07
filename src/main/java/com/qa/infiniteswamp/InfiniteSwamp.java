package com.qa.infiniteswamp;

import java.util.Scanner;

import com.qa.gameworld.Gameworld;
import com.qa.utils.WorldMath;
import com.qa.worldentitys.*;

public class InfiniteSwamp {
	Scanner input = new Scanner(System.in);
	Gameworld world;
	Treasure treasure;
	Player player;
	
	public void play() {
		
		// init
		this.world = new Gameworld();
		treasure = (Treasure) world.addEntity("Treasure");
		player = (Player) world.addEntity("Player");
		boolean playing = true;
		boolean foundTreasure = false;
		
		
		System.out.println("Your playing Infinite Swamp\nPlease enter your name:");
		player.setName(input.nextLine());
		System.out.println("welcome " + player.getName() + " GoodLuck!!\n\n");
		
		System.out.println("Your lost looking for treasure in the infiniteSwamp \n"
				+ "A device shows you the distance between you and your treasure \n"
				+ "but not the direction\nplease enter, north, south, west or east to navigate\n\n");
		
		while (playing) {
			double distance = WorldMath.distance2d(player, treasure);
			
			world.generateTouchEvents();
			
			if (world.getEvent().size() == 1) {
				System.out.println("YOU HAVE FOUND THE TREASURE!!!");
				foundTreasure = true;
			}
			
			
			
			
			// INPUTS
			if (foundTreasure == false) {
				System.out.println("The dial reads" + Math.nextUp(distance));
				System.out.println("where will you go?");
				String choice = input.nextLine();
				choice = choice.toUpperCase();
				switch (choice) {
					case "NORTH":
						player.move(choice);
						break;
					case "SOUTH":
						player.move(choice);
						break;
					case "EAST":
						player.move(choice);
						break;
					case "WEST":
						player.move(choice);
						break;
					default:
						System.out.println("please enter, north, south, west or east");
						break;
				}
			}
			else {
				System.out.println("Well Done " + player.getName() + "\nYou've completed the game NICE \n"
						+ "press anykey to end the game");
				input.next();
				playing = false;
			}
			
			
			
			
			world.clearTouchEvents();
			
			
		}
		
		
	input.close();	
	}
	
	
	
	

}
