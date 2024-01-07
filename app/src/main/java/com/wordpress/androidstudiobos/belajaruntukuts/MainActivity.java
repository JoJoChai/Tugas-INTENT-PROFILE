package com.wordpress.androidstudiobos.belajaruntukuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextName, editTextNIM, editTextProdi;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextNIM = findViewById(R.id.editTextNIM);
        editTextProdi = findViewById(R.id.editTextProdi);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String nim = editTextNIM.getText().toString();
                String prodi = editTextProdi.getText().toString();

                // Membuat Intent untuk berpindah ke aktivitas kedua
                Intent intent = new Intent(MainActivity.this, DisplayInfoActivity.class);
                // Mengirim data melalui Intent
                intent.putExtra("NAME", name);
                intent.putExtra("NIM", nim);
                intent.putExtra("PRODI", prodi);
                // Memulai aktivitas kedua
                startActivity(intent);
            }
        });
    }
}
