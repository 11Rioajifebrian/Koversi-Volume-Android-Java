package com.rio.koversivolume211220079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LiterToM3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liter_to_m3);

        final EditText inputLiter = findViewById(R.id.input_literToM);
        Button konversiButton = findViewById(R.id.konversi_literToM);

        konversiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                konversiDanKirim(inputLiter.getText().toString());
            }
        });
    }

    private void konversiDanKirim(String nilaiLiterToM) {
        // Lakukan konversi lITER TO CC
        double liter = Double.parseDouble(nilaiLiterToM);
        double m = liter / 1000;

        // Kembalikan hasil konversi ke MainActivity
        Intent resultIntent = new Intent();
        resultIntent.putExtra("NILAI_LITER_M", liter);
        resultIntent.putExtra("HASIL_KONVERSI_M", m);
        setResult(RESULT_OK, resultIntent);

        // Tutup Activity konversi
        finish();
    }
}