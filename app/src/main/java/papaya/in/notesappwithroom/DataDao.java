package papaya.in.notesappwithroom;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
interface DataDao {

    @Insert
     void insertData(DataModel data);

    @Update
    void updateData(DataModel data);

    @Delete
    void deleteData(DataModel data);

    @Query("SELECT * from student")
    LiveData<List<DataModel>> getData();
}
