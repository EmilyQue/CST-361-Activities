package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import beans.Album;
import beans.Track;
import data.DataAccessInterface;
import util.AlbumNotFoundException;
import util.TracksNotFoundException;

@Stateless
@Local(MusicManagerInterface.class)
@LocalBean
public class MusicManager implements MusicManagerInterface{
	@EJB
	DataAccessInterface<Album> dao;

	@Inject
	TrackFinderInterface tf;
	
	//Default constructor
	public MusicManager() {
		//
	}
	
	@Override
	public Album addAlbum(Album album) throws TracksNotFoundException{
		album.setTracks(tf.getTracks(album));
		
		dao.create(album);
		
		Album findAlbum = dao.findBy(album);
		
		if(findAlbum == null) {
			System.out.println("The album " + album.getTitle() + " by " + album.getArtist() + "does not exist. Adding to database now.");
			dao.create(album);
			album = dao.findBy(album);
			
			if(album.getTracks().isEmpty()) {
				throw new TracksNotFoundException();
			}
		}
		else {
			System.out.println("Album exists");
		}
		
		return album;
	}
	
	@Override 
	public Album getAlbum(Album album) throws AlbumNotFoundException{
		Album albumFound = dao.findBy(album);
		
		if(albumFound == null) {
			throw new AlbumNotFoundException();
		}
		else {
			System.out.println("Album was found");
			return albumFound;
		}
	}
}
