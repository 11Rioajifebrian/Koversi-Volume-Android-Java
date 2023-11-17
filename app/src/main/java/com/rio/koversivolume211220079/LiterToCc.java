package com.rio.koversivolume211220079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LiterToCc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liter_to_cc);

        final EditText inputLiter = findViewById(R.id.input_literToCc);
        Button konversiButton = findViewById(R.id.konversi_literToCc);

        konversiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                konversiDanKirim(inputLiter.getText().toString());
            }
        });
    }

    private void konversiDanKirim(String nilaiLiterToCc) {
        // Lakukan konversi lITER TO CC
        int liter = Integer.parseInt(nilaiLiterToCc);
        int cc = liter * 1000;

        // Kembalikan hasil konversi ke MainActivity
        Intent resultIntent = new Intent();
        resultIntent.putExtra("NILAI_LITER_CC", liter);
        resultIntent.putExtra("HASIL_KONVERSI_CC", cc);
        setResult(RESULT_OK, resultIntent);

        // Tutup Activity konversi
        finish();
    }
}