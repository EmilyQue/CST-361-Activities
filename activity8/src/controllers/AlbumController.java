package controllers;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.faces.context.FacesContext;
import javax.interceptor.Interceptors;

import beans.Album;
import business.MusicManagerInterface;
import util.AlbumNotFoundException;
import util.TracksNotFoundException;
import util.LoggingInterceptor;

@Named
@ViewScoped
@Interceptors(LoggingInterceptor.class)
public class AlbumController implements Serializable {	
	@EJB
	MusicManagerInterface mgr;
	
	public String onSubmit(Album album) {	
		try {
			album = mgr.addAlbum(album);
		}
		catch (TracksNotFoundException e) {
			System.out.println("Tracks not found");
		}
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("album", album);
		return "AddAlbumResponse.xhtml";
	}
	
	public String onFind(Album album) {
		try {
			mgr.getAlbum(album);
		}
		catch(AlbumNotFoundException e) {
			System.out.println("Album not found");
		}
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("album", album);
		return "AddAlbumResponse.xhtml";
	}
}
