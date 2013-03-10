package sample.model;

import java.io.Serializable;

import com.google.appengine.api.datastore.Key;
import org.slim3.datastore.Model;
import org.slim3.datastore.Attribute;

@Model
public class Sample implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}