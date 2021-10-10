
package objects;

import java.io.Serializable;

/**
 *
 * @author 504785
 */
public class Note implements Serializable {
    
    private String title;
    private String contents;

    public Note() {
        this.title=""; // 0 arg constructor. Always use best practice.
        this.contents=""; //security risk to leave null values
        
    }

    public Note(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    
}
