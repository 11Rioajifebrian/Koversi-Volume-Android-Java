package com.rio.koversivolume211220079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LiterToft3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liter_toft3);

        final EditText inputLiter = findViewById(R.id.input_literToFt);
        Button konversiButton = findViewById(R.id.konversi_literToFt);

        konversiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                konversiDanKirim(inputLiter.getText().toString());
            }
        });
    }

    private void konversiDanKirim(String nilaiLiterToFt) {
        // Lakukan konversi lITER TO CC
        double liter = Double.parseDouble(nilaiLiterToFt);
        double ft = liter  * 0.035315;

        // Kembalikan hasil konversi ke MainActivity
        Intent resultIntent = new Intent();
        resultIntent.putExtra("NILAI_LITER_FT", liter);
        resultIntent.putExtra("HASIL_KONVERSI_FT", ft);
        setResult(RESULT_OK, resultIntent);

        // Tutup Activity konversi
        finish();
    }
}