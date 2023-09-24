package papaya.in.notesappwithroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Database db = Room.databaseBuilder(getApplicationContext(),
                Database.class, "mydb")
                .allowMainThreadQueries().build();

        DataDao dataDao = db.dataDao();

        dataDao.insertData(new DataModel("Shubham"));
        dataDao.insertData(new DataModel("Ankit"));
        dataDao.insertData(new DataModel("Amarjeet"));
        dataDao.insertData(new DataModel("Madhwendra"));
        dataDao.insertData(new DataModel("Anuj"));
        dataDao.insertData(new DataModel("Saurabh"));

        LiveData<List<DataModel>> list = dataDao.getData();
        Log.d("Shubham", "onCreate: "+list);

//        TextView tv = findViewById(R.id.textView);
//
//        DataModel dataModel = list.get(0);

    }
}