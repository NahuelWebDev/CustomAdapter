package net.nahuelberardi.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapater extends ArrayAdapter<DataModel> {

    ArrayList<DataModel> dataSet;
    Context context;
    public CustomAdapater(ArrayList<DataModel> data, Context context) {
        super(context,R.layout.custom_row,data);
        this.dataSet = data;
        this.context = context;

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(R.layout.custom_row, parent, false);
        }
        DataModel data = this.dataSet.get(position);
        TextView name = convertView.findViewById(R.id.txtName);
        TextView surname = convertView.findViewById(R.id.txtSurname);

        name.setText(data.getName());
        surname.setText(data.getSurname());

        return convertView;

        }
    }