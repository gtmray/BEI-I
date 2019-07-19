package com.example.bei;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class SubActivity extends AppCompatActivity {
    ListView pdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdflist);
        pdfListView = (ListView) findViewById(R.id.myPDFlist);
        String[] pdfFiles = {"Microprocessor CH-1", "Microprocessor CH-2","Advanced Topics","Mathematics Guide", };
        ArrayAdapter<String> adpater = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pdfFiles) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };
        pdfListView.setAdapter(adpater);
        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long I) {
                String item = pdfListView.getItemAtPosition(i).toString();
                Intent start = new Intent(getApplicationContext(),PDFOpener.class);
                start.putExtra("pdfFileName.pdf",item);
                startActivity(start);

            }
        });
    }
}