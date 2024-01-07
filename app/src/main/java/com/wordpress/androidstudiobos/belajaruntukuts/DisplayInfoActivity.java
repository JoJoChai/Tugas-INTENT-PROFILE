package com.wordpress.androidstudiobos.belajaruntukuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayInfoActivity extends AppCompatActivity {
    TextView textViewName, textViewNIM, textViewProdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        textViewName = findViewById(R.id.textViewName);
        textViewNIM = findViewById(R.id.textViewNIM);
        textViewProdi = findViewById(R.id.textViewProdi);

        // Menerima data dari aktivitas pertama
        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("NAME");
            String nim = intent.getStringExtra("NIM");
            String prodi = intent.getStringExtra("PRODI");

            // Menampilkan data di TextView
            textViewName.setText("Nama: " + name);
            textViewNIM.setText("NIM: " + nim);
            textViewProdi.setText("Prodi: " + prodi);
        }
    }
}
