package papaya.in.notesappwithroom;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student")
public class DataModel {

    @PrimaryKey(autoGenerate = true)
    private long id;
    private String name;

    public DataModel( String name) {
//        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
