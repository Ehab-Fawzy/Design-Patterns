package Proxy_pattern_TrendVideos;

public class realVideo implements Video {
	String videoName , videoContent;
	
	public realVideo( String _videoName ) {
		// TODO Auto-generated constructor stub
		this.videoName = _videoName;
		loadVedio();
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println( "Display Video Content" );
	}
	
	public void loadVedio() {
		System.out.println( "load video ( " + videoName + " ) from database" );
	}

}
