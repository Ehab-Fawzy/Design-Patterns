package Proxy_pattern_TrendVideos;

public class proxyVideo implements Video {
	private realVideo video = null;
	private String videoName;
	
	public proxyVideo( String _videoName ) {
		// TODO Auto-generated constructor stub
		this.videoName = _videoName;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		if ( video == null ) {
			video = new realVideo(videoName);
		}
		video.play();
	}
	
	public String getVideoName() {
		return this.videoName;
	}

}
