package papaya.in.notesappwithroom;


import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {DataModel.class}, version=1)
public abstract class Database extends RoomDatabase {
    public abstract DataDao dataDao();
}
