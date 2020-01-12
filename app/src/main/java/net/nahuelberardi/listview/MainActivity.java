package net.nahuelberardi.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnRemove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.listview);

        ArrayList<DataModel> dataSet = new ArrayList<>();
        dataSet.add(new DataModel("John", "Smith"));
        dataSet.add(new DataModel("Luke", "Cage"));
        dataSet.add(new DataModel("Scarlett", "Witch"));
        dataSet.add(new DataModel("John", "Wick"));
        dataSet.add(new DataModel("Nahuel", "Berardi"));
        dataSet.add(new DataModel("Gilderoy", "Allock"));
        dataSet.add(new DataModel("Ginger", "Pol"));

        CustomAdapater customAdapter = new CustomAdapater(dataSet,this);
        listView.setAdapter(customAdapter);
    }
}
