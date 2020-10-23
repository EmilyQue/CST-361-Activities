package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Album;
import beans.Track;

@Stateless
@Local(TrackFinderInterface.class)
@LocalBean
@Alternative
public class TrackFinder1 implements TrackFinderInterface{
	HashMap<String, List<Track>> trackInfo;
	
	public TrackFinder1() {
		trackInfo = new HashMap<String, List<Track>>();
		List<Track> listOfTracks = new ArrayList<Track>();
		listOfTracks.add(new Track("Eleven", 1));
		listOfTracks.add(new Track("Dominos", 2));
		listOfTracks.add(new Track("Bass God", 3));
		listOfTracks.add(new Track("Sense", 4));
		listOfTracks.add(new Track("Happy", 5));
		listOfTracks.add(new Track("Forget About", 6));
		listOfTracks.add(new Track("Italo Disco", 7));
		listOfTracks.add(new Track("Everything Relative", 8));
		listOfTracks.add(new Track("Shallow Boy", 9));
		listOfTracks.add(new Track("Non Lo So", 10));
		trackInfo.put("Yumeno Garden by Last Dinosaurs - 2018", listOfTracks);
	}
	
	@Override
	public List<Track> getTracks(Album album) {
		String key = album.getTitle() + " by " + album.getArtist() + " - " + album.getYear();
		if (trackInfo.containsKey(key)) {
			return trackInfo.get(key);
		}
		else {
			return new ArrayList<Track>();
		}
	}
}
