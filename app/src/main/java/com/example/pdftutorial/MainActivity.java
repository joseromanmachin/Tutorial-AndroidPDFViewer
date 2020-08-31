package com.example.pdftutorial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pdfView = findViewById(R.id.pdf_viewer);
        progressBar = findViewById(R.id.progressBar);

        String urlPdf = "https://oficinavirtual.ugr.es/apli/solicitudPAU/test.pdf";
        new RecibirPDFStream(pdfView,progressBar).execute(urlPdf);
    }
}