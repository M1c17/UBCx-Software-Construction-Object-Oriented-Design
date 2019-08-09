package model;

import model.media.AbstractMedia;
import model.media.Movie;
import model.media.Photo;
import model.media.Song;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class iPod implements Iterable<AbstractMedia> {

    private String name;

    // TODO: add fields here which represent this iPod's Movies, Photos, and Songs, they should be of the Collection type
    private Set<AbstractMedia> movies;
    private Set<AbstractMedia> photos;
    private Collection<AbstractMedia> songs;

    public iPod(String name) {
        this.name = name;
        movies = new HashSet<>();
        photos = new HashSet<>();
        songs = new HashSet<>();
    }

    // getters
    public String getName() { return name; }

    public void addMovie(Movie m) { movies.add(m);}
    public void addPhotos(Photo p) { photos.add(p);}
    public void addSongs(Song s) { songs.add(s);}


    @Override
    public Iterator<AbstractMedia> iterator() {
        return new iPodIterator();
    }

    private class iPodIterator implements Iterator<AbstractMedia> {
        Iterator moviesIterator = movies.iterator();
        Iterator photosIterator = photos.iterator();
        Iterator songsIterator = songs.iterator();

        @Override
        public boolean hasNext() {
            return moviesIterator.hasNext() || photosIterator.hasNext() || songsIterator.hasNext();
        }

        @Override
        public AbstractMedia next() {
            AbstractMedia m = null;

            if(moviesIterator.hasNext()) {
                m = (Movie) moviesIterator.next();
            }
            else if(photosIterator.hasNext() ) {
                m = (Photo) photosIterator.next();
            }else if(songsIterator.hasNext()) {
                m = (Song) songsIterator.next();
            }
            return m;
        }
    }
}