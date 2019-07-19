package com.example.bei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {
PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);
        myPDFViewer=(PDFView) findViewById(R.id.pdfViewer);
        String getItem = getIntent().getStringExtra("pdfFileName.pdf");
        if(getItem.equals("Microprocessor CH-1")){
            myPDFViewer.fromAsset("Chapter-1-Introduction.pdf").load();
        }
        if(getItem.equals("Microprocessor CH-2")){
            myPDFViewer.fromAsset("Chapter-2-Programming-with-8085Microprocessor.pdf").load();
        }
        if(getItem.equals("Advanced Topics")){
            myPDFViewer.fromAsset("Advanced Topics.pdf").load();
        }
        if(getItem.equals("Mathematics Guide")){
            myPDFViewer.fromAsset("Maths Guide.pdf").load();
        }

    }
}
