package Proxy_pattern_TrendVideos;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner javain = new Scanner( System.in );
		videoManager vm = new videoManager();
		
		do {
			menu();
			String choice = javain.nextLine();
			
			if 		( choice.compareTo("1") == 0 ) {
				vm.displayAllTrendVideos();
			}
			else if ( choice.compareTo("2") == 0 ) {
				System.out.println( "Enter Video Name: " );
				String name = javain.nextLine();
				vm.playVideo(name);
			}
			else if ( choice.compareTo("3") == 0 ) {
				break;
			}
			else {
				System.out.println( "Invalid Input" );
			}
			System.out.println();
		}
		while( true );
		javain.close();
	}
	
	public static void menu() {
		System.out.println( "1- Display All Trend Videos" );
		System.out.println( "2- Play Video" );
		System.out.println( "3- End" );
		System.out.println( "Enter: " );
	}
}
