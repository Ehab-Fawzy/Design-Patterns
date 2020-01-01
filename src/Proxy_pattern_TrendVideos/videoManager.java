package Proxy_pattern_TrendVideos;

import java.util.HashMap;
import java.util.Map.Entry;

public class videoManager {
	private static HashMap<String, proxyVideo> trendVideos;
	
	public videoManager() {
		// TODO Auto-generated constructor stub
		trendVideos = new HashMap<String, proxyVideo>();
		loadTrendVideos();
	}
	
	public void playVideo( String videoName ) {
		if ( trendVideos.containsKey( videoName ) == true ) {
			trendVideos.get(videoName).play();
		}
		else {
			System.out.println( "Invalid Video Name" );
		}
	}
	
	public void loadTrendVideos() {
		String loadedVideos[] = new String[10];
		for ( int i = 0; i < 10; ++i ) {
			loadedVideos[i] = "Video number " + String.valueOf(i+1); 
		}
		
		for ( int i = 0; i < loadedVideos.length; ++i ) {
			proxyVideo proxyObject = new proxyVideo( loadedVideos[i] );
			trendVideos.put( loadedVideos[i] , proxyObject);
		}
	}
	
	public void displayAllTrendVideos() {
		for (Entry<String, proxyVideo> itrator : trendVideos.entrySet()) {
			System.out.println( itrator.getKey() );
		}
	}
}
