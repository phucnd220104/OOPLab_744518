
package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import hust.soict.dsai.aims.exception.*;
public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(int id, String title, String category, float cost,String artist, ArrayList<Track> tracks) {
        super(id, title, category, cost);
        this.tracks = tracks;
        this.artist = artist;
        this.setLength(getLength());
    }

    public CompactDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track song) {
        if(tracks.contains(song)) {
            System.out.println(song.getTitle() + "is already in the CD");
        } else {
            tracks.add(song);
        }
    }

    public void removeTrack(Track song) {
        if(tracks.contains(song)) {
            tracks.remove(song);
        } else {
            System.out.println(song.getTitle() + "is not in the CD");
        }
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    @Override
    public float getLength() {
        float sum = 0;
        for(Track song : tracks) {
            sum += song.getLength();
        }
        return sum;
    }

    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            // Iterate over all tracks and play them
            java.util.Iterator iter = tracks.iterator();
            Track nextTrack;
            
            while (iter.hasNext()) {
                nextTrack = (Track) iter.next();
                try {
                    nextTrack.play();
                } catch (PlayerException e) {
                    // Rethrow the exception to indicate the track can't play
                    throw new PlayerException("ERROR: Failed to play track: " + e);
                }
            }
        } else {
            throw new PlayerException("ERROR: CD length is non-positive!");
        }
    }



    @Override
    public String toString() {
        StringBuilder print = new StringBuilder("CD: " +
                " [id = "  + getId() +
                ", artist: " + artist +
                ", title = '" + getTitle() + '\'' +
                ", category = '" + getCategory() + '\'' +
                ", length : " + getLength() + " min" +
                ", cost= " + getCost() + "$]" + '\n' + "Tracks: \n"
                + "===================" + '\n');
        for (Track track : tracks) {
            print.append(track.getTitle());
            print.append('\t');
            print.append(track.getLength());
            print.append(" min");
            print.append('\n');
        }
        return print.toString();
    }
}