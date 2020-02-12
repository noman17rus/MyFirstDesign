package com.example.myfirstdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView tv;
    Spinner sp;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        sp = findViewById(R.id.sp_1);
        lv = findViewById(R.id.listviev_1);
        ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(this, R.array.analysis, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = sp.getSelectedItem().toString();
        tv.setText(text);

        //хочу использовать метод switch который будет проверять значение из "adapter" и выводить в список (lv)

        ArrayAdapter<?> adapter1 = ArrayAdapter.createFromResource(this, R.array.water, android.R.layout.simple_list_item_1);
        lv.setAdapter(adapter1);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
